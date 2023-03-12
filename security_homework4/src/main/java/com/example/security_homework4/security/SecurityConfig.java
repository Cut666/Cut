package com.example.security_homework4.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.cache.SpringCacheBasedUserCache;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.DelegatingPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.crypto.password.Pbkdf2PasswordEncoder;
import org.springframework.security.crypto.scrypt.SCryptPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
@Autowired
    CustomAuthenProvider authenProvider;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.authenticationProvider(authenProvider);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.httpBasic();
        http.authorizeRequests()
                .antMatchers("/book/search").access("hasAnyAuthority('READ','SEARCH')")
                .antMatchers("/book/add").access("hasAnyAuthority('READ', 'CREATE', 'SEARCH')")
                .antMatchers("/book/update/{id}").access("hasAnyAuthority('READ','EDIT', 'SEARCH')")
                .antMatchers("/**").permitAll();
    }
    public PasswordEncoder delegatePassWordEncoder(String encodingType){
        Map<String, PasswordEncoder> encoderMap =new HashMap<>();
        encoderMap.put("bcrypt", new BCryptPasswordEncoder());
        encoderMap.put("pbkdf2", new Pbkdf2PasswordEncoder());
        encoderMap.put("scrypt", new SCryptPasswordEncoder());

        return new DelegatingPasswordEncoder(encodingType, encoderMap);
    }
    @Bean
    public PasswordEncoder encoder(){
        return delegatePassWordEncoder("bcrypt");
    }
    @Bean
    public InMemoryUserDetailsManager inMemoryUserDetailsManager(){
        Collection<UserDetails> userDetails = new ArrayList<>();
        User.UserBuilder userBuilder = User.builder().passwordEncoder(encoder()::encode);
        var thai1 = userBuilder.username("thai1").password("123").authorities("READ").build();
        var thai2 = userBuilder.username("thai2").password("123").authorities("CREATE").build();
        var thai3 = userBuilder.username("thai3").password("123").authorities("EDIT").build();
        var thai4 = userBuilder.username("thai4").password("123").authorities("EDIT","CREATE").build();
        userDetails.add(thai1);
        userDetails.add(thai2);
        userDetails.add(thai3);
        userDetails.add(thai4);
        return new InMemoryUserDetailsManager(userDetails);
    }
}

package com.example.securityb5.security;


import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
@Slf4j
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.formLogin();
//        http.authorizeRequests()
//                .antMatchers("/book/getall").hasAnyRole("user","admin")
//                .antMatchers("/book/delete").hasAnyRole("admin")
//                .antMatchers("/**").permitAll();
        http.authorizeRequests().anyRequest().authenticated();
    }

//    public PasswordEncoder delegatePasswordEncoder(String encodingType) {
//        Map<String, PasswordEncoder> encoders = new HashMap<>();
//        encoders.put("bcrypt", new BCryptPasswordEncoder());
//        encoders.put("pbkdf2", new Pbkdf2PasswordEncoder());
//        encoders.put("scrypt", new SCryptPasswordEncoder());
//
//        return new DelegatingPasswordEncoder(encodingType, encoders);
//    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return NoOpPasswordEncoder.getInstance();
    }


}

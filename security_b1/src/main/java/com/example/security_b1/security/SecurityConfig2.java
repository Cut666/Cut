//package com.example.security_b1.security;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.crypto.password.NoOpPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//
//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.Collections;
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig2 extends WebSecurityConfigurerAdapter {
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception{
//        http.httpBasic();
//        http.authorizeRequests().anyRequest().authenticated();
//    }
//    @Bean
//    public PasswordEncoder encoder(){
//        return NoOpPasswordEncoder.getInstance();
//    }
//    @Bean
//    public InMemoryUserDetailsManager inMemoryUserDetailsManager(){
//        Collection<UserDetails> users = new ArrayList<>();
//        var tho1 = User.withUsername("tho1").password("123").authorities("read").build();
//        var tho2 = User.withUsername("tho2").password("123").authorities("read").build();
//        var tho3 = User.withUsername("tho3").password("123").authorities("read").build();
//        users.add(tho1);
//        users.add(tho2);
//        users.add(tho3);
//        return new InMemoryUserDetailsManager(users);
//    }
//}

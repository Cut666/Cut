//package com.example.security_b1.security;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.NoOpPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//
//import java.util.ArrayList;
//import java.util.Collection;
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig3 extends WebSecurityConfigurerAdapter {
//    @Autowired
//    private PasswordEncoder encoder;
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception{
//        http.httpBasic();
//        http.authorizeRequests().anyRequest().authenticated();
//    }
//    @Bean
//    public PasswordEncoder encoder(){
////        return NoOpPasswordEncoder.getInstance();
//        return new BCryptPasswordEncoder();
//    }
//    @Bean
//    public InMemoryUserDetailsManager inMemoryUserDetailsManager(){
//        Collection<UserDetails> users = new ArrayList<>();
//        User.UserBuilder userBuilder = User.builder().passwordEncoder(encoder::encode);
//        var tho1 = userBuilder.username("tho1").password("123").authorities("read").build();
//        var tho2 = userBuilder.username("tho2").password("123").authorities("read").build();
//        var tho3 = userBuilder.username("tho3").password("123").authorities("read").build();
//        System.out.println("pass"+tho2.getPassword());
//        users.add(tho1);
//        users.add(tho2);
//        users.add(tho3);
//        return new InMemoryUserDetailsManager(users);
//    }
//}

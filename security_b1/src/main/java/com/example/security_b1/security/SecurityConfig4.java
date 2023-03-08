//package com.example.security_b1.security;
//import org.apache.catalina.security.SecurityConfig;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.DelegatingPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//
//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.HashMap;
//import java.util.Map;
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig4 extends WebSecurityConfigurerAdapter {
//    @Autowired
//    private PasswordEncoder encoder;
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception{
//        http.httpBasic();
//        http.authorizeRequests().anyRequest().authenticated();
//    }
//
//    public static PasswordEncoder delegatePasswordEncoder(String encodingType){
//        Map<String, PasswordEncoder> encoders = new HashMap<>();
//        encoders.put("bcrypt",new BCryptPasswordEncoder());
//        encoders.put("bcrypt",new BCryptPasswordEncoder());
//        encoders.put("bcrypt",new BCryptPasswordEncoder());
//        encoders.put("bcrypt",new BCryptPasswordEncoder());
//        encoders.put("bcrypt",new BCryptPasswordEncoder());
//        encoders.put("bcrypt",new BCryptPasswordEncoder());
//        encoders.put("bcrypt",new BCryptPasswordEncoder());
//        encoders.put("bcrypt",new BCryptPasswordEncoder());
//        encoders.put("bcrypt",new BCryptPasswordEncoder());
//        encoders.put("bcrypt",new BCryptPasswordEncoder());
//        return new DelegatingPasswordEncoder(encodingType,encoders);
//
//    }
//    @Bean
//    public PasswordEncoder encoder(){
////        return NoOpPasswordEncoder.getInstance();
//        return SecurityConfig4.delegatePasswordEncoder("bcrypt");
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

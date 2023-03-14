package com.example.securityhomework2.security;

import com.example.securityhomework2.model.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
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
//@Configuration là một Annotation (chú thích) trong Spring Framework được sử dụng để đánh dấu một lớp và chỉ định rằng lớp đó là một configuration class (lớp cấu hình) trong Spring. Các configuration class được sử dụng để cung cấp các thông tin cấu hình cho Spring
@Configuration
// là một Annotation trong Spring Security được sử dụng để kích hoạt tính năng bảo mật trên ứng dụng web
////         nó sẽ được tạo ra như là một FilterChainProxy, và các filter được thêm vào filter chain để xử lý các yêu cầu HTTP tới ứng dụng.
////         Các filter này được sử dụng để xác thực (authentication) và phân quyền (authorization) các yêu cầu HTTP, và đảm bảo rằng chỉ có người dùng có quyền được truy cập
@EnableWebSecurity
public class SecutityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    private CustomAuthenProvider customAuthenProvider;
    //cho phép SpringSecurity sử dụng cơ chế xác thực ta cấu hình trong CustomAuthenProvider
    //AuthenticationManagerBuilder dùng để cấu hình thông tin đăng nhập,  có cung cấp 1 api
    //để thêm các Authetication Provider để xác thực
    @Override
    // AuthenticationManager sẽ sử dụng CustomAuthenProvider để xác thực người dùng. Khi một yêu cầu đăng nhập được gửi đến ứng dụng của bạn, AuthenticationManager sẽ yêu cầu CustomAuthenProvider để xác thực người dùng.
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
       auth.authenticationProvider(customAuthenProvider);
    }
//    http.basic sử dụng một chuỗi mã hóa để xác thực người dùng, trong khi http.formLogin sử dụng một trang đăng nhập để xác thực người dùng.

    @Override
    //được sử dụng để cấu hình việc phân quyền truy cập trong ứng dụng.
    protected void configure(HttpSecurity http) throws Exception {
       http.formLogin();
       http.authorizeRequests()
               .antMatchers("/api/product").hasAnyRole(Role.User,Role.Operator,Role.Admin)
               .antMatchers("/api/update").hasAnyRole(Role.User,Role.Operator)
               .antMatchers("/api/delete").hasAnyRole(Role.Admin)
               .antMatchers("/**").permitAll();
    }
    public PasswordEncoder delegatePasswordEncoder(String encodingType){
        Map<String,PasswordEncoder> encoderMap = new HashMap<>();
        encoderMap.put("bcrypt", new BCryptPasswordEncoder());
        encoderMap.put("pbkdf2", new Pbkdf2PasswordEncoder());
        encoderMap.put("scrypt", new SCryptPasswordEncoder());
        return new DelegatingPasswordEncoder(encodingType,encoderMap);
    }

    @Bean
    public PasswordEncoder passwordEncoder(){
        return delegatePasswordEncoder("scrypt");
    }

    @Bean
    public InMemoryUserDetailsManager inMemoryUserDetailsManager(){
        Collection<UserDetails> userDetails = new ArrayList<>();
        User.UserBuilder userBuilder = User.builder().passwordEncoder(delegatePasswordEncoder("scrypt")::encode);
        var thai1 = userBuilder.username("thai1").password("123").roles(Role.User).build();
        var thai2 = userBuilder.username("ope").password("123").roles(Role.Operator).build();
        var thai3 = userBuilder.username("admin").password("123").roles(Role.Admin).build();
        //tạo ra các user add vào users và dùng UserBuilder để mã hoá các mật khẩu
        userDetails.add(thai1);
        userDetails.add(thai2);
        userDetails.add(thai3);
        return new InMemoryUserDetailsManager(userDetails);
    }
}

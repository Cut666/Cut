package com.example.security_homework4.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.stereotype.Component;

@Component
public class CustomAuthenProvider implements AuthenticationProvider {
    @Autowired
    private InMemoryUserDetailsManager inMemoryUserDetailsManager;
    @Autowired
    private PasswordEncoder encoder;

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        String username = authentication.getName();
        String rawPass = String.valueOf(authentication.getCredentials());
        try {
            UserDetails userDetails = inMemoryUserDetailsManager.loadUserByUsername(username);
            if (encoder.matches(rawPass,userDetails.getPassword())){
                return new UsernamePasswordAuthenticationToken(username,userDetails.getPassword(),userDetails.getAuthorities());
            }else {
                return null;
            }
        }catch (UsernameNotFoundException e){
            return null;
        }
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return UsernamePasswordAuthenticationToken.class.isAssignableFrom(authentication);
    }
}

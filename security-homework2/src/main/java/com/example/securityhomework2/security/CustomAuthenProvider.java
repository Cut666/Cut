package com.example.securityhomework2.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.authentication.jaas.memory.InMemoryConfiguration;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Component
public class CustomAuthenProvider implements AuthenticationProvider {

    @Autowired
    private InMemoryUserDetailsManager inMemoryUserDetailsManager;
    @Autowired
    private PasswordEncoder encoder;

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        String usename= authentication.getName();
        String rawPassword = String.valueOf(authentication.getCredentials());
        try {
            UserDetails userDetails = inMemoryUserDetailsManager.loadUserByUsername(usename);
            if (encoder.matches(rawPassword, userDetails.getPassword())) {
                return new UsernamePasswordAuthenticationToken(usename, userDetails.getPassword(), userDetails.getAuthorities());
            } else {
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

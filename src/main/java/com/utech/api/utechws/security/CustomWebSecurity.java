package com.utech.api.utechws.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class CustomWebSecurity extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity httpSecurity) throws Exception {
        httpSecurity
                //no authentication needed for these context paths
                .authorizeRequests()
                .antMatchers("/error").permitAll()
                .antMatchers("/error/**").permitAll()
                .antMatchers("/api/**").permitAll();
    }
}

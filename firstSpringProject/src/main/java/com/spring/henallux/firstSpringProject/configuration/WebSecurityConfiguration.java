package com.spring.henallux.firstSpringProject.configuration;

import com.spring.henallux.firstSpringProject.service.UserDetailsServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;

@Configuration
@EnableWebSecurity
public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter {

    private static final String LOGIN_REQUEST = "/login";
    private static final String[] AUTHORIZED_REQUESTS_ANYBODY = new String[]{"/","/login","/login/**","/welcome/**","/css/**","/Images/**","/js/**"};

    private UserDetailsService userDetailsServiceImpl;

    @Autowired
    public WebSecurityConfiguration(UserDetailsServiceImplementation userDetailsServiceImpl) {
        this.userDetailsServiceImpl = userDetailsServiceImpl;
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable(); // Disable the protection to the CRFS. Otherwise, we need to implement it and it is not necessary for our concerns

        http
                .authorizeRequests() // We define the authorization here
                .antMatchers(AUTHORIZED_REQUESTS_ANYBODY).permitAll() // For the request to the index page, any user has access
                .anyRequest().authenticated() // For all the other requests, the user needs to be authenticated
                .and()
                .formLogin() // We define the login part here.
                .successHandler(new SavedRequestAwareAuthenticationSuccessHandler())// This handler is already provided by spring to redirect to the last request
                //.failureHandler(new FailureHandl)
                .failureForwardUrl("/")
                .loginPage(LOGIN_REQUEST) // We specify a login page. Otherwise spring create one by default
                .successForwardUrl("/welcome")
                .permitAll() // To make the login page the available for any user
                .and()
                .logout()
                .permitAll()
                .logoutSuccessUrl("/");
    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsServiceImpl).passwordEncoder(new BCryptPasswordEncoder());
    }
}

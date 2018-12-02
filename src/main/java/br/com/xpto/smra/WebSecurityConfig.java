package br.com.xpto.smra;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Security configuration to Klonner.
 * 
 * User authentication is performed via LDAP, with JWT token generation, which
 * must then be sent on all requests made by the authenticated user.
 * 
 * @author Kyros
 * @since 22/11/2016
 *
 */
@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	/**
	 * {@inheritDoc}
	 */
    @Override
	protected void configure( HttpSecurity http ) throws Exception {
        http
        	.csrf().disable() // We don't need CSRF for JWT based authentication
        	.exceptionHandling()
            .and()
            	.authorizeRequests()
            		.antMatchers( HttpMethod.OPTIONS ).permitAll(); // OPTIONS method is permitted to all
            		
    }
}

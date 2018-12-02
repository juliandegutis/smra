package br.com.xpto.smra;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * Cors Filter.
 * 
 * @author Kyros
 * @since 29/11/2016
 *
 */
@Component
@Order( Ordered.HIGHEST_PRECEDENCE )
public class CorsFilter implements Filter {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void init( FilterConfig filterConfig ) throws ServletException {
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void doFilter( ServletRequest req, ServletResponse res, FilterChain chain ) throws IOException,
		ServletException {

		HttpServletRequest request = (HttpServletRequest) req;
		HttpServletResponse response = (HttpServletResponse) res;

		response.setHeader( "Access-Control-Allow-Origin", "*" );
		response.setHeader( "Access-Control-Allow-Credentials", "true" );
		response.setHeader( "Access-Control-Allow-Methods", "POST, PUT, GET, OPTIONS, DELETE" );
		response.setHeader( "Access-Control-Max-Age", "3600" );
		response.setHeader(
			"Access-Control-Allow-Headers",
			"Cache-Control, X-Authorization, Content-Type, Accept, X-Requested-With, remember-me, No-Auth, Access-Control-Allow-Origin, Access-Control-Allow-Headers" );

		if ( !WebUtil.isMethodChecking( request ) ) {
			chain.doFilter( req, res );
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void destroy() {
	}

}

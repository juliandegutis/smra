package br.com.xpto.smra;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpMethod;
import org.springframework.security.web.savedrequest.SavedRequest;

/**
 * Web util methods.
 * 
 * @author Kyros
 * @since 22/11/2016
 *
 */
public class WebUtil {

    private static final String XML_HTTP_REQUEST = "XMLHttpRequest";
    private static final String X_REQUESTED_WITH = "X-Requested-With";

    private static final String CONTENT_TYPE = "Content-type";
    private static final String CONTENT_TYPE_JSON = "application/json";

	/**
	 * Verifies if a HTTP request is an ajax request.
	 * 
	 * @param request The HTTP request to be verified.
	 * 
	 * @return True if ajax request, False otherwise.
	 */
	public static boolean isAjax( HttpServletRequest request ) {
		return XML_HTTP_REQUEST.equals( request.getHeader( X_REQUESTED_WITH ) );
    }

	/**
	 * Verifies if a saved request is an ajax request.
	 * 
	 * @param request The saved request to be verified.
	 * 
	 * @return True if ajax request, False otherwise.
	 */
	public static boolean isAjax( SavedRequest request ) {
		return request.getHeaderValues( X_REQUESTED_WITH ).contains( XML_HTTP_REQUEST );
    }

	/**
	 * Verifies if the content type of a saved request is JSON.
	 * 
	 * @param request The saved request to verify content.
	 * 
	 * @return True if the request content is JSON, False otherwise.
	 */
	public static boolean isContentTypeJson( SavedRequest request ) {
		return request.getHeaderValues( CONTENT_TYPE ).contains( CONTENT_TYPE_JSON );
    }

	/**
	 * Checks if it is a OPTIONS call.
	 * 
	 * @param request The request.
	 * 
	 * @return True if it is a OPTIONS call, False otherwise.
	 */
	public static boolean isMethodChecking( HttpServletRequest request ) {
		return HttpMethod.OPTIONS.name().equals( request.getMethod() );
	}

}

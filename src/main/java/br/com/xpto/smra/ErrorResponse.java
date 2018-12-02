package br.com.xpto.smra;

import java.util.Date;

import org.springframework.http.HttpStatus;

/**
 * Error model for interacting with client.
 * 
 * @author Kyros
 * @since 17/11/2016
 *
 */
public class ErrorResponse {

	/** HTTP Response Status Code. */
    private final HttpStatus status;

	/** General Error message. */
    private final String message;

	/** Error code. */
    private final ErrorCode errorCode;

	/** Timestamp. */
    private final Date timestamp;

	/**
	 * Constructor.
	 *
	 * @param message Error message.
	 * @param errorCode Error code.
	 * @param status HTTP status.
	 */
    protected ErrorResponse(final String message, final ErrorCode errorCode, HttpStatus status) {
        this.message = message;
        this.errorCode = errorCode;
        this.status = status;
        this.timestamp = new java.util.Date();
    }

	/**
	 * Returns a new ErrorResponse object.
	 * 
	 * @param message Error message.
	 * @param errorCode Error code.
	 * @param status HTTP status.
	 * 
	 * @return A new ErrorResponse object.
	 */
	public static ErrorResponse of( final String message, final ErrorCode errorCode, HttpStatus status ) {
		return new ErrorResponse( message, errorCode, status );
    }

	/**
	 * @return "status".
	 */
	public HttpStatus getStatus() {
		return status;
	}

	/**
	 * @return "message".
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @return "errorCode".
	 */
	public ErrorCode getErrorCode() {
		return errorCode;
	}

	/**
	 * @return "timestamp".
	 */
	public Date getTimestamp() {
		return timestamp;
	}

}

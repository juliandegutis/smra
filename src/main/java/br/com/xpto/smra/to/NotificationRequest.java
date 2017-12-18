package br.com.xpto.smra.to;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude( Include.NON_NULL )
@JsonIgnoreProperties( ignoreUnknown = true )
public class NotificationRequest implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2062041098764307628L;
	
	private String email;
	
	private Long userId;
	
	private String smraCode;
	
	private String username;
	
	private String body;
	
	public NotificationRequest() {
		
	}

	
	public String getEmail() {
		return email;
	}

	
	public void setEmail( String email ) {
		this.email = email;
	}

	
	public Long getUserId() {
		return userId;
	}

	
	public void setUserId( Long userId ) {
		this.userId = userId;
	}

	
	public String getSmraCode() {
		return smraCode;
	}

	
	public void setSmraCode( String smraCode ) {
		this.smraCode = smraCode;
	}


	
	public String getUsername() {
		return username;
	}


	
	public void setUsername( String username ) {
		this.username = username;
	}


	
	public String getBody() {
		return body;
	}


	
	public void setBody( String body ) {
		this.body = body;
	}
	
}

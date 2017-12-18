package br.com.xpto.smra.to;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude( Include.NON_NULL )
@JsonIgnoreProperties( ignoreUnknown = true )
public class NotificationTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6095914638068719455L;

	private Long notificationId;

	private Long userId;

	private Date sendingDate;

	private String body;
	
	public NotificationTO() {
		
	}
	
	public Long getNotificationId() {
		return notificationId;
	}

	
	public void setNotificationId( Long notificationId ) {
		this.notificationId = notificationId;
	}

	
	public Long getUserId() {
		return userId;
	}

	
	public void setUserId( Long userId ) {
		this.userId = userId;
	}

	
	public Date getSendingDate() {
		return sendingDate;
	}

	
	public void setSendingDate( Date sendingDate ) {
		this.sendingDate = sendingDate;
	}

	
	public String getBody() {
		return body;
	}

	
	public void setBody( String body ) {
		this.body = body;
	}

}

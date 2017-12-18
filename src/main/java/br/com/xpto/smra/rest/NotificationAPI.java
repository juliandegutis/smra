package br.com.xpto.smra.rest;

import br.com.xpto.smra.to.NotificationRequest;
import br.com.xpto.smra.to.NotificationTO;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface NotificationAPI {
	
	@POST( "notification/send" )
	Call< NotificationTO > sendEmailNotification(
		@Body NotificationRequest notificationRequestBodyTO );
	
}

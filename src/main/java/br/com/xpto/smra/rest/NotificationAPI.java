package br.com.xpto.smra.rest;

import br.com.xpto.smra.to.NotificationRequestBodyTO;
import br.com.xpto.smra.to.NotificationTO;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface NotificationAPI {
	
	@POST( "notification/" )
	Call< NotificationTO > sendEmailNotification(
		@Body NotificationRequestBodyTO notificationRequestBodyTO );
	
}

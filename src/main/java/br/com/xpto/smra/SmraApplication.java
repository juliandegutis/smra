package br.com.xpto.smra;

import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

import br.com.xpto.smra.rest.GoogleRestAPI;
import br.com.xpto.smra.rest.NotificationAPI;
import br.com.xpto.smra.rest.OrionContextServer;
import br.com.xpto.smra.util.NullOnEmptyConverterFactory;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

@SpringBootApplication
public class SmraApplication {

	@Autowired
	private Environment environment;

	final OkHttpClient okHttpClient = new OkHttpClient.Builder().readTimeout( 5, TimeUnit.MINUTES )
		.connectTimeout( 5, TimeUnit.MINUTES ).build();
	
	public static void main(String[] args) {
		SpringApplication.run(SmraApplication.class, args);
	}
	
	@Bean( name = "googleRestAPI" )
	public GoogleRestAPI googleRestAPI() {
		return new Retrofit.Builder().baseUrl( environment.getProperty( "xpto.service.google.url" ) )
				.addConverterFactory( new NullOnEmptyConverterFactory() )
				.addConverterFactory( JacksonConverterFactory.create() ).client( okHttpClient ).build()
				.create( GoogleRestAPI.class );
	}
	
	@Bean( name = "orionContextServer" )
	public OrionContextServer orionContextServer() {

		return new Retrofit.Builder().baseUrl( environment.getProperty( "xpto.service.orion.url" ) )
			.addConverterFactory( new NullOnEmptyConverterFactory() )
			.addConverterFactory( JacksonConverterFactory.create() ).client( okHttpClient ).build()
			.create( OrionContextServer.class );
	}
	
	@Bean( name = "notificationAPI" )
	public NotificationAPI notificationAPI() {

		return new Retrofit.Builder().baseUrl( environment.getProperty( "xpto.service.notification.url" ) )
			.addConverterFactory( new NullOnEmptyConverterFactory() )
			.addConverterFactory( JacksonConverterFactory.create() ).client( okHttpClient ).build()
			.create( NotificationAPI.class );
	}
}

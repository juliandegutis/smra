package br.com.xpto.smra.rest;

import br.com.xpto.smra.to.OrionContextAppendRequest;
import br.com.xpto.smra.to.OrionContextAppendResponse;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface OrionContextServer {

	@POST( "/v1/updateContext" )
	Call< OrionContextAppendResponse > updateContext( @Body OrionContextAppendRequest request );
	
}

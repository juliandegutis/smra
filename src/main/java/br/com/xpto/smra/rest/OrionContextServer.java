package br.com.xpto.smra.rest;

import br.com.xpto.smra.to.OrionContextAppendRequest;
import br.com.xpto.smra.to.OrionContextAppendResponse;
import br.com.xpto.smra.util.Constants;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;

public interface OrionContextServer {

	@POST( "/v1/updateContext" )
	Call< OrionContextAppendResponse > updateContext( @Header( Constants.CONTENT_TYPE ) String contentType, @Header( Constants.ACCEPT ) String accept, @Body OrionContextAppendRequest request );
	
}

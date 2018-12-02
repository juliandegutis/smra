package br.com.xpto.smra.rest;

import java.util.List;

import br.com.xpto.smra.to.Place;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface GoogleRestAPI {

	@GET( "json" )
	Call< List< Place > > place( @Query( "latlng" ) String latlng, @Query( "key" ) String appKey );
	
}

package br.com.xpto.smra.service;

import java.util.List;

import br.com.kyros.generics.GenericService;
import br.com.xpto.smra.model.Smra;
import br.com.xpto.smra.to.LocalizationTO;
import br.com.xpto.smra.to.NotificationTO;
import br.com.xpto.smra.to.OrionContextAppendResponse;
import br.com.xpto.smra.to.OrionContextQueryResponse;
import br.com.xpto.smra.to.PlaceContext;
import br.com.xpto.smra.to.SmraContext;
import br.com.xpto.smra.to.UserContext;

public interface SmraService extends GenericService< Smra, Long > {

	OrionContextAppendResponse updateContext( LocalizationTO localization );
	
	OrionContextQueryResponse queryContext( String smraCode );
	
	NotificationTO recieve( String smraCode );
	
	List< PlaceContext > findPlace( String smraCode );
	
	Boolean register( UserContext context );
	
	List< SmraContext > find( String email );
	
	
	
}

package br.com.xpto.smra.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.xpto.smra.exception.SmraException;
import br.com.xpto.smra.rest.OrionContextServer;
import br.com.xpto.smra.service.SmraService;
import br.com.xpto.smra.to.LocalizationTO;
import br.com.xpto.smra.to.OrionContextAppendRequest;
import br.com.xpto.smra.to.OrionContextAppendResponse;
import br.com.xpto.smra.util.ObjectConverter;
import retrofit2.Call;
import retrofit2.Response;

@Service
public class SmraServiceImpl implements SmraService {

	@Autowired
	private OrionContextServer orionContextServer;
	
	@Override
	public OrionContextAppendResponse updateContext( LocalizationTO localization ) {

		try {
			
			OrionContextAppendRequest request = ObjectConverter.appendEntity( localization );
			
			Call< OrionContextAppendResponse > call = orionContextServer.updateContext( request );
			Response< OrionContextAppendResponse > response = call.execute();
			
			if( response.errorBody() == null ) {
				return response.body();
			} else {
				throw new SmraException( "Erro ao tentar consultar o serviço do Orion." );
			}
			
		} catch( Exception ex ) {
			throw new SmraException( ex.getMessage() );
		}
		
	}

}

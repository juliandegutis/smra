package br.com.xpto.smra.service;

import br.com.kyros.generics.GenericService;
import br.com.xpto.smra.model.Smra;
import br.com.xpto.smra.to.LocalizationTO;
import br.com.xpto.smra.to.OrionContextAppendResponse;

public interface SmraService extends GenericService< Smra, Long > {

	OrionContextAppendResponse updateContext( LocalizationTO localization );
	
}

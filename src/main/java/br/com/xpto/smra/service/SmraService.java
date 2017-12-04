package br.com.xpto.smra.service;

import br.com.xpto.smra.to.LocalizationTO;
import br.com.xpto.smra.to.OrionContextAppendResponse;

public interface SmraService {

	OrionContextAppendResponse updateContext( LocalizationTO localization );
	
}

package br.com.xpto.smra.service;

import br.com.kyros.generics.GenericService;
import br.com.xpto.smra.model.SmraUser;

public interface SmraUserService extends GenericService< SmraUser, Long > {

	SmraUser findBySmraId( Long smraId );
	
}

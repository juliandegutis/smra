package br.com.xpto.smra.service;

import br.com.kyros.generics.GenericService;
import br.com.xpto.smra.model.User;
import br.com.xpto.smra.to.UserContext;

public interface UserService extends GenericService< User, Long > {

	UserContext register( UserContext context );
	
}

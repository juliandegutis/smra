package br.com.xpto.smra.service;

import br.com.xpto.smra.to.UserContext;

public interface LoginService {

	UserContext login( UserContext user );
	
}

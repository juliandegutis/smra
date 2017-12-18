package br.com.xpto.smra.service.impl;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.kyros.generics.GenericServiceImpl;
import br.com.xpto.smra.model.User;
import br.com.xpto.smra.repository.UserRepository;
import br.com.xpto.smra.service.UserService;

@Service
public class UserServiceImpl extends GenericServiceImpl< User, Long > implements UserService {

	@Autowired
	public UserServiceImpl( UserRepository repository, EntityManager entityManager ) {
		super( repository, entityManager );
	}

}

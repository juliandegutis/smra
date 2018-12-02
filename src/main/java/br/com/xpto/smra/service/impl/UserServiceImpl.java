package br.com.xpto.smra.service.impl;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.kyros.generics.GenericServiceImpl;
import br.com.xpto.smra.model.User;
import br.com.xpto.smra.repository.UserRepository;
import br.com.xpto.smra.service.UserService;
import br.com.xpto.smra.to.UserContext;

@Service
public class UserServiceImpl extends GenericServiceImpl< User, Long > implements UserService {

	private UserRepository repository;
	
	@Autowired
	public UserServiceImpl( UserRepository repository, EntityManager entityManager ) {
		super( repository, entityManager );
		this.repository = repository;
	}

	@Override
	public UserContext register(UserContext context) {
		
		User user = new User();
		user.setEmail( context.getEmail() );
		user.setName( context.getName() );
		user.setPassword( context.getPassword() );
		
		repository.save( user );
		
		return new UserContext( true );
	}

}

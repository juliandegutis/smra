package br.com.xpto.smra.service.impl;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.kyros.generics.GenericServiceImpl;
import br.com.xpto.smra.model.SmraUser;
import br.com.xpto.smra.repository.SmraUserRepository;
import br.com.xpto.smra.service.SmraUserService;

@Service
public class SmraUserServiceImpl extends GenericServiceImpl< SmraUser, Long > implements SmraUserService {

	private SmraUserRepository repository;
	
	@Autowired
	public SmraUserServiceImpl( SmraUserRepository repository, EntityManager entityManager ) {
		super( repository, entityManager );
		this.repository = repository;
	}

	@Override
	public SmraUser findBySmraId( Long smraId ) {
		return repository.findBySmraId( smraId );
	}

}

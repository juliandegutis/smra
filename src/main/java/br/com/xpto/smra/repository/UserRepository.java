package br.com.xpto.smra.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.xpto.smra.model.User;

@Repository
public interface UserRepository extends CrudRepository< User, Long > {

	User findByEmailAndPassword( String email, String password );
	
	User findByEmail( String email );
	
}

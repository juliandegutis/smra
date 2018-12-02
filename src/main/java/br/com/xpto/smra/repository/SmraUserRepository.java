package br.com.xpto.smra.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.xpto.smra.model.SmraUser;

@Repository
public interface SmraUserRepository extends CrudRepository< SmraUser, Long > {
	
	List< SmraUser > findByUserId( Long userId );
	
	SmraUser findBySmraId( Long smraId );
	
}

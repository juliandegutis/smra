package br.com.xpto.smra.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.xpto.smra.model.Smra;

@Repository
public interface SmraRepository extends CrudRepository< Smra, Long > {
	
	Smra findBySmraCode( String smraCode );
	
}

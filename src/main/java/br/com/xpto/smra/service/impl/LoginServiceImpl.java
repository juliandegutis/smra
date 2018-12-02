package br.com.xpto.smra.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.xpto.smra.model.Smra;
import br.com.xpto.smra.model.SmraUser;
import br.com.xpto.smra.model.User;
import br.com.xpto.smra.repository.SmraRepository;
import br.com.xpto.smra.repository.SmraUserRepository;
import br.com.xpto.smra.repository.UserRepository;
import br.com.xpto.smra.service.LoginService;
import br.com.xpto.smra.to.UserContext;

@Service
public class LoginServiceImpl implements LoginService  {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private SmraUserRepository smraUserRepository;
	
	@Autowired
	private SmraRepository smraRepository;
	
	@Override
	public UserContext login(UserContext context) {	
		User user = userRepository.findByEmailAndPassword( context.getEmail(), context.getPassword() );
		if( user == null ) {
			return new UserContext( false );
		}
		List< SmraUser > smraByUser = smraUserRepository.findByUserId( user.getUserId() );
		List< String > smras = new ArrayList< String >();
		for( SmraUser smraUser : smraByUser ) {
			Smra smra = smraRepository.findOne( smraUser.getSmraId() );
			smras.add( smra.getSmraCode() );
		}
		return new UserContext( user.getName(), smras, true, user.getEmail() );
	}



}

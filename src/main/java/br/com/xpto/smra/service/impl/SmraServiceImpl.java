package br.com.xpto.smra.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import br.com.kyros.generics.GenericServiceImpl;
import br.com.xpto.smra.exception.SmraException;
import br.com.xpto.smra.model.Smra;
import br.com.xpto.smra.model.SmraUser;
import br.com.xpto.smra.model.User;
import br.com.xpto.smra.repository.SmraRepository;
import br.com.xpto.smra.repository.SmraUserRepository;
import br.com.xpto.smra.repository.UserRepository;
import br.com.xpto.smra.rest.GoogleRestAPI;
import br.com.xpto.smra.rest.NotificationAPI;
import br.com.xpto.smra.rest.OrionContextServer;
import br.com.xpto.smra.service.SmraService;
import br.com.xpto.smra.service.SmraUserService;
import br.com.xpto.smra.service.UserService;
import br.com.xpto.smra.to.LocalizationTO;
import br.com.xpto.smra.to.NotificationRequest;
import br.com.xpto.smra.to.NotificationTO;
import br.com.xpto.smra.to.OrionContextAppendRequest;
import br.com.xpto.smra.to.OrionContextAppendResponse;
import br.com.xpto.smra.to.OrionContextQueryRequest;
import br.com.xpto.smra.to.OrionContextQueryResponse;
import br.com.xpto.smra.to.PlaceContext;
import br.com.xpto.smra.to.SmraContext;
import br.com.xpto.smra.to.UserContext;
import br.com.xpto.smra.util.ObjectConverter;
import retrofit2.Call;
import retrofit2.Response;

@Service
public class SmraServiceImpl extends GenericServiceImpl< Smra, Long > implements SmraService {

	@Autowired
	private OrionContextServer orionContextServer;
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private SmraUserRepository smraUserRepository;
	
	@Autowired
	private SmraUserService smraUserService;
	
	@Autowired
	private NotificationAPI notificationAPI;
	
	@Autowired
	private GoogleRestAPI googleRestAPI;
	
	@Autowired
	private Environment environment;
	
	private SmraRepository repository;
	
	
	@Autowired
	public SmraServiceImpl( SmraRepository repository, EntityManager entityManager ) {
		super( repository, entityManager );
		this.repository = repository;
	}
	
	@Override
	public List< PlaceContext > findPlace( String smraCode ) {
		
		try {
			
			List< PlaceContext > places = new ArrayList< PlaceContext >();
			
			PlaceContext place = new PlaceContext();
			place.setLatitude( 37.4224764 );
			place.setLongitude( -122.0842499 );
			place.setSmraCode( "SMRA-0001" );
			place.setDescription( "Casa" );
			
			places.add( place );
			
			return places;
			
		} catch( Exception ex ) {
			throw new SmraException( ex.getMessage() );
		}
		
	}
	
	@Override
	public OrionContextQueryResponse queryContext( String smraCode ) {
		
		try {
			
			OrionContextQueryRequest request = ObjectConverter.queryContext( smraCode );
			
			Call< OrionContextQueryResponse > call = orionContextServer.queryContext( "application/json", "application/json", request );
			Response< OrionContextQueryResponse > response = call.execute();
			
			if( response.errorBody() == null ) {
				return response.body();
			} else {
				throw new SmraException( "Erro ao tentar consultar o serviço do Orion." );
			}
			
		} catch( Exception ex ) {
			throw new SmraException( ex.getMessage() );
		}
		
	}

	
	@Override
	public OrionContextAppendResponse updateContext( LocalizationTO localization ) {

		try {
			
			OrionContextAppendRequest request = ObjectConverter.appendEntity( localization );
			
			Call< OrionContextAppendResponse > call = orionContextServer.updateContext( "application/json", "application/json", request );
			Response< OrionContextAppendResponse > response = call.execute();
			
			if( response.errorBody() == null ) {
				return response.body();
			} else {
				throw new SmraException( "Erro ao tentar consultar o serviço do Orion." );
			}
			
		} catch( Exception ex ) {
			throw new SmraException( ex.getMessage() );
		}
		
	}

	@Override
	public NotificationTO recieve( String smraCode ) {
		
		try {
			
			Smra smra = repository.findBySmraCode( smraCode );
			SmraUser smraUser = smraUserService.findBySmraId( smra.getSmraId() );
			User user = userService.get( smraUser.getUserId() );
			
			NotificationRequest notification = new NotificationRequest();
			notification.setUserId( user.getUserId() );
			notification.setSmraCode( smra.getSmraCode() );
			notification.setEmail( user.getEmail() );
			notification.setUsername( user.getName() );
			
			return sendNotification( notification );
			
		} catch( Exception ex ) {
			throw new SmraException( ex.getMessage() );
		}
		
	}
	
	private NotificationTO sendNotification( NotificationRequest notification ) {
		
		try {
			
			Call< NotificationTO > call = notificationAPI.sendEmailNotification( notification );
			Response< NotificationTO > response = call.execute();
			
			if( response.errorBody() == null ) {
				return response.body();
			} else {
				throw new SmraException( "Erro ao tentar comunicar com o serviço de notificações." );
			}
			
		} catch( Exception ex ) {
			throw new SmraException( ex.getMessage() );
		}
		
 	}

	@Override
	public Boolean register( UserContext context ) {
		try {
			
			User user = userRepository.findByEmail( context.getEmail() );
			
			Smra smra = new Smra();
			smra.setSmraCode( context.getSmraCode() );
			smra = repository.save( smra );
			
			SmraUser smraUser = new SmraUser();
			smraUser.setSmraId( smra.getSmraId() );
			smraUser.setUserId( user.getUserId() );
			smraUser.setDescription( context.getDescription() );
			
			smraUserService.save( smraUser );
			
			return Boolean.TRUE;
			
		} catch( Exception ex ) {
			throw new SmraException( ex.getMessage() );
		}
	}

	@Override
	public List<SmraContext> find(String email) {
		
		try {
			
			User user = userRepository.findByEmail(email);
			List< SmraUser > smraUsers = smraUserRepository.findByUserId(user.getUserId());
			
			List< SmraContext > returnList = new ArrayList< SmraContext >();
			
			for( SmraUser smraUser : smraUsers ) {
				Smra smra = repository.findOne( smraUser.getSmraId() );
				returnList.add(new SmraContext( smra.getSmraCode(), smraUser.getDescription() ) );
			}
			
			return returnList;
			
		} catch( Exception ex ) {
			throw new SmraException( ex.getMessage() );
		}
		
	}

}

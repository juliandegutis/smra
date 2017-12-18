package br.com.xpto.smra.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.xpto.smra.service.SmraService;
import br.com.xpto.smra.to.LocalizationTO;
import br.com.xpto.smra.to.NotificationTO;
import br.com.xpto.smra.to.OrionContextAppendResponse;
import br.com.xpto.smra.to.OrionContextQueryResponse;

@RestController
@RequestMapping( value = "/smra" )
public class SmraController {

	private final SmraService smraService;
	
	@Autowired
	public SmraController( SmraService smraService ) {
		this.smraService = smraService;
	}
	
	@RequestMapping( path = { "", "/" }, method = RequestMethod.GET )
	public OrionContextQueryResponse get( @RequestParam( value = "smraCode", required = true ) String smraCode ) {
		return smraService.queryContext( smraCode );
	}
	
	@RequestMapping( path = { "", "/" }, method = RequestMethod.POST )
	public @ResponseBody OrionContextAppendResponse post( @RequestBody LocalizationTO localization ) {
		return smraService.updateContext( localization );
	}
	
	@RequestMapping( value = "/recieve", method = RequestMethod.GET )
	public NotificationTO recieve( @RequestParam( value = "smraCode", required = true ) String smraCode ) {
		return smraService.recieve( smraCode );
	}
	
}

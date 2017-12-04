package br.com.xpto.smra.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.xpto.smra.service.SmraService;
import br.com.xpto.smra.to.LocalizationTO;
import br.com.xpto.smra.to.OrionContextAppendResponse;

@Controller
@RequestMapping( value = "/smra" )
public class SmraController {

	private final SmraService smraService;
	
	@Autowired
	public SmraController( SmraService smraService ) {
		this.smraService = smraService;
	}
	
	@RequestMapping( value = "/", method = RequestMethod.POST )
	public @ResponseBody OrionContextAppendResponse post( @RequestBody LocalizationTO localization ) {
		return smraService.updateContext( localization );
	}
	
	
}

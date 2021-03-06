package br.com.xpto.smra.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.xpto.smra.service.LoginService;
import br.com.xpto.smra.to.UserContext;

@RestController
@RequestMapping( value = "/login" )
public class LoginController {

	@Autowired
	private LoginService loginService;
	
	@RequestMapping( path = { "", "/" }, method = RequestMethod.POST )
	public @ResponseBody UserContext login( @RequestBody UserContext user ) {
		return loginService.login( user );
	}
	
}

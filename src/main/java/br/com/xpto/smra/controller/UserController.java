package br.com.xpto.smra.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.xpto.smra.service.UserService;
import br.com.xpto.smra.to.UserContext;

@RestController
@RequestMapping( value = "/user" )
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping( path = { "", "/" }, method = RequestMethod.POST )
	public @ResponseBody UserContext register( @RequestBody UserContext user ) {
		return userService.register( user );
	}
	
}

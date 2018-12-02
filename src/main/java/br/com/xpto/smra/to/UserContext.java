package br.com.xpto.smra.to;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude( Include.NON_NULL )
@JsonIgnoreProperties( ignoreUnknown = true )
public class UserContext {

	private String username;
	
	private List< String > smraCodes;
	
	private String email;
	
	private String name;
	
	private String password;
	
	private Boolean authenticated;
	
	private String access_token;
	
	private String smraCode;
	
	private String description;
	
	public Boolean getAuthenticated() {
		return authenticated;
	}

	public void setAuthenticated(Boolean authenticated) {
		this.authenticated = authenticated;
	}

	public UserContext() {}
	
	public UserContext( Boolean authenticated ) {
		this.authenticated = authenticated;
	}
	
	public UserContext( String username, List< String > smraCodes, Boolean authenticated, String email ) {
		this.username = username;
		this.smraCodes = smraCodes;
		this.authenticated = authenticated;
		this.email = email;
		this.access_token = "AB2882H3S";
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public List<String> getSmraCodes() {
		return smraCodes;
	}

	public void setSmraCodes(List<String> smraCodes) {
		this.smraCodes = smraCodes;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAccess_token() {
		return access_token;
	}

	public void setAccess_token(String access_token) {
		this.access_token = access_token;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSmraCode() {
		return smraCode;
	}

	public void setSmraCode(String smraCode) {
		this.smraCode = smraCode;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}

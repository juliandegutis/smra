package br.com.xpto.smra.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "tb_usuario" )
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7107490945762143944L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column( name = "id_usuario" )
	private Long userId;
	
	@Column( name = "nm_usuario" )
	private String name;
	
	@Column( name = "cd_login" )
	private String login;
	
	@Column( name = "cd_email" ) 
	private String email;
	
	@Column( name = "cd_password" )
	private String password;
	
	@Column( name = "cd_salt" )
	private String salt;
	
	@Column( name = "dt_cadastro" )
	private Date registerDate;
	
	public User() {
		
	}

	
	public Long getUserId() {
		return userId;
	}

	
	public void setUserId( Long userId ) {
		this.userId = userId;
	}

	
	public String getName() {
		return name;
	}

	
	public void setName( String name ) {
		this.name = name;
	}

	
	public String getLogin() {
		return login;
	}

	
	public void setLogin( String login ) {
		this.login = login;
	}

	
	public String getPassword() {
		return password;
	}

	
	public void setPassword( String password ) {
		this.password = password;
	}

	
	public String getSalt() {
		return salt;
	}

	
	public void setSalt( String salt ) {
		this.salt = salt;
	}

	
	public Date getRegisterDate() {
		return registerDate;
	}

	
	public void setRegisterDate( Date registerDate ) {
		this.registerDate = registerDate;
	}


	
	public String getEmail() {
		return email;
	}


	
	public void setEmail( String email ) {
		this.email = email;
	}
}

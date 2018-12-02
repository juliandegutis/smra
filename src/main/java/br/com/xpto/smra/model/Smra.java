package br.com.xpto.smra.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "tb_smra" )
public class Smra implements Serializable {

	private static final long serialVersionUID = -980750926057000554L;
	
	@Id
	@Column( name = "id_smra")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long smraId;
	
	@Column( name = "cd_smra" )
	private String smraCode;

	public Smra() {

	}

	public Long getSmraId() {
		return smraId;
	}

	public void setSmraId( Long smraId ) {
		this.smraId = smraId;
	}

	public String getSmraCode() {
		return smraCode;
	}

	public void setSmraCode( String smraCode ) {
		this.smraCode = smraCode;
	}

}

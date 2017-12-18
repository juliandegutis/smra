package br.com.xpto.smra.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "tb_usuario_smra" )
public class SmraUser implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7844675883203765901L;
	
	@Id
	@Column( name = "id_usuario_smra" )
	private Long smraUserId;
	
	@Column( name = "id_smra" )
	private Long smraId;
	
	@Column( name = "id_usuario" )
	private Long userId;
	
	public SmraUser() {
		
	}

	
	public Long getSmraUserId() {
		return smraUserId;
	}

	
	public void setSmraUserId( Long smraUserId ) {
		this.smraUserId = smraUserId;
	}

	
	public Long getSmraId() {
		return smraId;
	}

	
	public void setSmraId( Long smraId ) {
		this.smraId = smraId;
	}

	
	public Long getUserId() {
		return userId;
	}

	
	public void setUserId( Long userId ) {
		this.userId = userId;
	}
}

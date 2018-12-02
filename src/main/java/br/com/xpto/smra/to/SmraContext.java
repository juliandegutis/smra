package br.com.xpto.smra.to;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude( Include.NON_NULL )
@JsonIgnoreProperties( ignoreUnknown = true )
public class SmraContext implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3519698887730348086L;

	private String smraCode;
	
	private String description;
	
	public SmraContext() {}
	
	public SmraContext( String smraCode, String description ) {
		this.smraCode = smraCode;
		this.description = description;
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

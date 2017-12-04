package br.com.xpto.smra.to;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude( Include.NON_NULL )
@JsonIgnoreProperties( ignoreUnknown = true )
public class Entity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6306923081310929154L;
	
	private String type;
	
	private String isPattern;
	
	private String id;
	
	public Entity() {
		
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getIsPattern() {
		return isPattern;
	}

	public void setIsPattern(String isPattern) {
		this.isPattern = isPattern;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
}

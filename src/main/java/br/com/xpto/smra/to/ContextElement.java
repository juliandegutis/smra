package br.com.xpto.smra.to;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude( Include.NON_NULL )
@JsonIgnoreProperties( ignoreUnknown = true )
public class ContextElement implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7209570222779162536L;
	
	private String type;
	
	private String isPattern;
	
	private String id;
	
	private List< Attribute > attributes;
	
	private StatusCode statusCode;
	
	public ContextElement() {
		
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

	public List<Attribute> getAttributes() {
		return attributes;
	}

	public void setAttributes(List<Attribute> attributes) {
		this.attributes = attributes;
	}

	public StatusCode getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(StatusCode statusCode) {
		this.statusCode = statusCode;
	}

}

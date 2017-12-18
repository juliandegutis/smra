package br.com.xpto.smra.to;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude( Include.NON_NULL )
@JsonIgnoreProperties( ignoreUnknown = true )
public class OrionContextQueryResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 570138274973250150L;
	
	private List< ContextResponse > contextResponses;
	
	public OrionContextQueryResponse() {
		
	}
	
	public List< ContextResponse > getContextResponses() {
		return contextResponses;
	}

	
	public void setContextResponses( List< ContextResponse > contextResponses ) {
		this.contextResponses = contextResponses;
	}

}

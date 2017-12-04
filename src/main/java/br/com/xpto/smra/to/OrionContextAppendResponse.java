package br.com.xpto.smra.to;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude( Include.NON_NULL )
@JsonIgnoreProperties( ignoreUnknown = true )
public class OrionContextAppendResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3141554503922769377L;
	
	private List< ContextResponse > contextResponses;
	
	private OrionContextAppendResponse() {
		
	}
	
	public List< ContextResponse > getContextResponses() {
		return contextResponses;
	}

	
	public void setContextResponses( List< ContextResponse > contextResponses ) {
		this.contextResponses = contextResponses;
	}
	
}

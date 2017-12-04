package br.com.xpto.smra.to;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude( Include.NON_NULL )
@JsonIgnoreProperties( ignoreUnknown = true )
public class ContextResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5052838214866780809L;
	
	private ContextElement contextElement;
	
	public ContextResponse() {
		
	}

	
	public ContextElement getContextElement() {
		return contextElement;
	}

	
	public void setContextElement( ContextElement contextElement ) {
		this.contextElement = contextElement;
	}

}

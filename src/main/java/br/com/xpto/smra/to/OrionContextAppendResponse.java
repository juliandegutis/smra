package br.com.xpto.smra.to;

import java.io.Serializable;
import java.util.ArrayList;
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
	
	private List< ContextElement > contextElements;
	
	private OrionContextAppendResponse() {
		
	}

	
	public List< ContextElement > getContextElements() {
		if( contextElements != null ) {
			return contextElements;
		} else {
			return new ArrayList< ContextElement >();
		}
	}

	
	public void setContextElements( List< ContextElement > contextElements ) {
		this.contextElements = contextElements;
	}
	
}

package br.com.xpto.smra.to;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude( Include.NON_NULL )
@JsonIgnoreProperties( ignoreUnknown = true )
public class OrionContextQueryRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3619265235372504577L;

	private List< Entity > entities;

	public OrionContextQueryRequest() {

	}

	public List< Entity > getEntities() {
		if ( entities != null ) {
			return entities;
		} else {
			return new ArrayList< Entity >();
		}
	}

	public void setEntities( List< Entity > entities ) {
		this.entities = entities;
	}

}

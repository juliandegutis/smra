package br.com.xpto.smra.to;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude( Include.NON_NULL )
@JsonIgnoreProperties( ignoreUnknown = true )
public class Place implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1580762388038187661L;
	private List< PlaceResult > results;
	
	public Place() {
		
	}

	public List<PlaceResult> getResults() {
		return results;
	}

	public void setResults(List<PlaceResult> results) {
		this.results = results;
	}
	
}

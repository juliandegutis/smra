package br.com.xpto.smra.to;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude( Include.NON_NULL )
@JsonIgnoreProperties( ignoreUnknown = true )
public class Attribute implements Serializable {
	
	public static String LATITUDE = "latitude";
	public static String LONGITUDE = "longitude";
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4960337618101305184L;
	
	private String name;
	
	private String type;
	
	private String value;
	
	public Attribute() {
		
	}
	
	public Attribute( String name, String type, String value ) {
		this.name = name;
		this.type = type;
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
}

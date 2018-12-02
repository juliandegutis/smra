package br.com.xpto.smra.to;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude( Include.NON_NULL )
@JsonIgnoreProperties( ignoreUnknown = true )
public class PlaceContext implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1435117114941131516L;

	private Double latitude;
	
	private Double longitude;
	
	private String description;
	
	private String smraCode;
	
	public PlaceContext() {
		
	}
	
	public PlaceContext(Double latitude, Double longitude, String description, String smraCode ) {
		this.latitude = latitude;
		this.longitude = longitude;
		this.description = description;
		this.smraCode = smraCode;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSmraCode() {
		return smraCode;
	}

	public void setSmraCode(String smraCode) {
		this.smraCode = smraCode;
	}
	
}

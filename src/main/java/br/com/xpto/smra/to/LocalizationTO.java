package br.com.xpto.smra.to;

import java.io.Serializable;

public class LocalizationTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5983986513336584546L;
	
	private String latitude;
	
	private String longitude;
	
	private String smraId;
	
	public LocalizationTO() {
		
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getSmraId() {
		return smraId;
	}

	public void setSmraId(String smraId) {
		this.smraId = smraId;
	}

}

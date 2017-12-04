package br.com.xpto.smra.enums;

public enum UpdateActionEnum {
	
	APPEND( "APPEND" );
	
	private String value;
	
	UpdateActionEnum( String value ) {
		this.value = value;
	}
	
	public String value() {
		return this.value;
	}
	
}

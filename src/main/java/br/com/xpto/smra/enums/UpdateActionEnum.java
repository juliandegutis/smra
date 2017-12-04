package br.com.xpto.smra.enums;

public enum UpdateActionEnum {
	
	INSERT( "APPEND" );
	
	private String value;
	
	UpdateActionEnum( String value ) {
		this.value = value;
	}
	
	public String value() {
		return this.value;
	}
	
}

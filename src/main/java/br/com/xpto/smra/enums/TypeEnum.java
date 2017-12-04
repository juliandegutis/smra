package br.com.xpto.smra.enums;


public enum TypeEnum {
	
	STRING( "string" ),
	LONG( "long" );
	
	private String value;
	
	TypeEnum( String value ) {
		this.value = value;
	}
	
	public String value() {
		return this.value;
	}
	
}

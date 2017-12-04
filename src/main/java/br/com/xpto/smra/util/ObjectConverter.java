package br.com.xpto.smra.util;

import java.util.ArrayList;
import java.util.List;

import br.com.xpto.smra.enums.TypeEnum;
import br.com.xpto.smra.enums.UpdateActionEnum;
import br.com.xpto.smra.to.Attribute;
import br.com.xpto.smra.to.ContextElement;
import br.com.xpto.smra.to.LocalizationTO;
import br.com.xpto.smra.to.OrionContextAppendRequest;

public class ObjectConverter {
	
	public static OrionContextAppendRequest appendEntity( LocalizationTO localization ) {
		
		OrionContextAppendRequest object = new OrionContextAppendRequest();
		
		List< ContextElement > contextElements = new ArrayList< ContextElement >();
		ContextElement contextElement = new ContextElement();
		
		List< Attribute > attributes = new ArrayList< Attribute >();
		
		object.setUpdateAction( UpdateActionEnum.INSERT );
		
		contextElement.setId( localization.getSmraId() );
		contextElement.setIsPattern( Constants.FALSE );
		contextElement.setType( Constants.SMRA );
		
		Attribute latitude = new Attribute( Attribute.LATITUDE, TypeEnum.STRING.value(), localization.getLatitude() );
		Attribute longitude = new Attribute( Attribute.LONGITUDE, TypeEnum.STRING.value(), localization.getLongitude() );
		
		attributes.add( latitude );
		attributes.add( longitude );
		
		contextElement.setAttributes( attributes );
		
		object.setContextElements( contextElements );
		
		return object;
		
	}
	
}

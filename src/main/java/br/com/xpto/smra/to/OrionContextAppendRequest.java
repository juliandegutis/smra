package br.com.xpto.smra.to;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import br.com.xpto.smra.enums.UpdateActionEnum;

@JsonInclude( Include.NON_NULL )
@JsonIgnoreProperties( ignoreUnknown = true )
public class OrionContextAppendRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9148872233094613893L;

	private List< ContextElement > contextElements;

	private UpdateActionEnum updateAction;

	public OrionContextAppendRequest() {

	}

	public List< ContextElement > getContextElements() {
		if ( contextElements != null ) {
			return contextElements;
		} else {
			return new ArrayList< ContextElement >();
		}

	}

	public void setContextElements( List< ContextElement > contextElements ) {
		this.contextElements = contextElements;
	}

	public UpdateActionEnum getUpdateAction() {
		return updateAction;
	}

	public void setUpdateAction( UpdateActionEnum updateAction ) {
		this.updateAction = updateAction;
	}

}

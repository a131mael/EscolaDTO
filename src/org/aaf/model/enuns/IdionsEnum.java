package org.aaf.model.enuns;

public enum IdionsEnum {

	PT_BR("Português(Brasil)"),
	ES_CAS("Espanhol(Castelhano)");
	
	private String label;
	
	IdionsEnum(String name){
		this.label = name;
	}
	
    public String getLabel() {
        return label;
    }
}

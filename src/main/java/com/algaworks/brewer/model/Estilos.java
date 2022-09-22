package com.algaworks.brewer.model;

public enum Estilos {

	AMBER_lAGER("Amber Lager"),
	DARK_LAGER("Dark Lager"),
	PALE_LAGER("Pale Lager"),
	PILSNER("Pilsner");
	
	private String descricao;
	
	Estilos(String descricao){
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
}
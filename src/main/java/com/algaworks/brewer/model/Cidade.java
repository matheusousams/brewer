package com.algaworks.brewer.model;

import org.hibernate.validator.constraints.NotBlank;

public class Cidade {

	@NotBlank(message = "Estado é obrigatório")
	private String estado;
	@NotBlank(message = "Cidade é obrigatório")
	private String cidade;
	
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
}

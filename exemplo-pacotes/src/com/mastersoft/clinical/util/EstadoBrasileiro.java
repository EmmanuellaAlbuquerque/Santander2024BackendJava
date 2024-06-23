package com.mastersoft.clinical.util;

public enum EstadoBrasileiro {
	SAO_PAULO ("SP", "São Paulo"),
	PARAIBA ("PB", "Paraíba");
	
	private String sigla;
	private String nome;
	
	private EstadoBrasileiro(String sigla, String nome) {
		this.sigla = sigla;
		this.nome = nome;
	}
	
	public String getNomeMaiusculo() {
		return nome.toUpperCase();
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}

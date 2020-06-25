package br.com.peixe.ornamental.jdbc.model;

public class Peixe {
	
	private Long id;
	private String nomeCientifico;
	private String nomeComum;
	private Double saldo;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNomeCientifico() {
		return nomeCientifico;
	}
	public void setNomeCientifico(String nomeCientifico) {
		this.nomeCientifico = nomeCientifico;
	}
	public String getNomeComum() {
		return nomeComum;
	}
	public void setNomeComum(String nomeComum) {
		this.nomeComum = nomeComum;
	}
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

}

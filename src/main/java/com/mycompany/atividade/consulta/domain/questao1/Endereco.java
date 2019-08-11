package com.mycompany.atividade.consulta.domain.questao1;

import java.io.Serializable;
import javax.persistence.Embeddable;

@Embeddable
public class Endereco implements Serializable{
	private String rua;
	private String bairro;
	private String cidade;
	private String cep;
	public Endereco(String rua, String bairro, String cidade, String cep) {
		super();
		this.rua = rua;
		this.bairro = bairro;
		this.cidade = cidade;
		this.cep = cep;
	}
	public Endereco() {
		super();
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	
	
}

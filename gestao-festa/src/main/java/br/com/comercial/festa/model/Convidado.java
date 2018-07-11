package br.com.comercial.festa.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;


@Entity
public class Convidado implements Serializable{
	
	private static final long serialVersionUID = -8282176326646817903L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private String nome;
	
	@Transient
	private boolean novo;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean isNovo() {
		return id == null;
	}

	public void setNovo(boolean novo) {
		this.novo = novo;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public Convidado(Long id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	
	}

	public Convidado() {
		super();
	}
	
	public Long getId() {
		return id;
	}
	
}

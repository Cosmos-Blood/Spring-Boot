package com.gen.bloguinhopessoal.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_tema")
public class TemaModel {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private @Id Long idTema;

	private @NotBlank String tema;
	
	@OneToMany(mappedBy = "temaRelacionado", cascade = CascadeType.REMOVE)
	@JsonIgnoreProperties({"temaRelacionado"})
	private List<PostagemModel> postagens = new ArrayList<>();

	public Long getIdTema() {
		return idTema;
	}

	public void setIdTema(Long idTema) {
		this.idTema = idTema;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	public List<PostagemModel> getPostagens() {
		return postagens;
	}

	public void setPostagens(List<PostagemModel> postagens) {
		this.postagens = postagens;
	}
	
	
}

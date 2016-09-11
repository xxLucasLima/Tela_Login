package br.com.login.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.NamedQuery;

@Entity
@Table (name="cadastro")
@NamedQuery(name="Cadastro.autenticar", query="SELECT cadastro FROM Cadastro cadastro WHERE cadastro.usuario = :usuario AND cadastro.senha = :senha")
public class Cadastro {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="cad_id")
	private Long id;
	
	@Column(name="cad_usuario", length=15, nullable = false, unique = true)
	private String usuario;
	
	@Column (name = "cad_senha", length=12, nullable = false)
	private String senha;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	

}

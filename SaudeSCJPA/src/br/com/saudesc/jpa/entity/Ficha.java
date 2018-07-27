package br.com.saudesc.jpa.entity;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

/**
 * Entity implementation class for Entity: Ficha
 *
 */
@Entity
@NamedQuery(name="Ficha.getAll",query="SELECT f FROM ficha f")
public class Ficha implements Serializable {

	 
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@NotNull
	@Length(max=20)
	private String dtCadastro;

	@NotNull
	private boolean status;

	@NotNull
	@Length(max=500)
	private String observacao;

	private static final long serialVersionUID = 1L;

	public Ficha() {
		super();
	}   
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   

	public String getDtCadastro() {
		return dtCadastro;
	}
	public void setDtCadastro(String dtCadastro) {
		this.dtCadastro = dtCadastro;
	}
	public boolean getStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}  
}




































































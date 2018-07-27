package br.com.saudesc.mb;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.saudesc.ejb.beans.interfaces.FichaDAOLocal;
import br.com.saudesc.jpa.entity.Ficha;

@ViewScoped
@ManagedBean
public class FichaMB {

	@EJB
	private FichaDAOLocal fichaDAOLocal;
	
	private int id;
	private String dtCadastro;
	private boolean status;
	private String observacao;
	
	public FichaMB() {
	}
	
	
	public void updateFicha(){
		Ficha ficha = new Ficha();
		ficha.setId(id);
		ficha.setDtCadastro(dtCadastro);
		ficha.setStatus(status);
		ficha.setObservacao(observacao);
		fichaDAOLocal.update(ficha);
	}
	
	public void getFicha(int id){
		Ficha ficha = fichaDAOLocal.getFicha(id);
		this.id = ficha.getId();
		dtCadastro = ficha.getDtCadastro();
		status = ficha.getStatus();
		observacao = ficha.getObservacao();
	}
	
	public void deleteFicha(int id){
		fichaDAOLocal.remove(id);
	}
	
	public List<Ficha> getAllFichas(){
		return fichaDAOLocal.getAllFichas();
		
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


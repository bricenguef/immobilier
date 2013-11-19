package jpa;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Clientchambre {

	@Id
	int idchambre;
	
	String typechambre;
	int numchambre;
	int superficie;
	
	
	public Clientchambre(String typechambre, int numchambre, int superficie) {
		super();
		this.typechambre = typechambre;
		this.numchambre = numchambre;
		this.superficie = superficie;
	}
	
	public int getIdchambre() {
		return idchambre;
	}
	public void setIdchambre(int idchambre) {
		this.idchambre = idchambre;
	}
	public String getTypechambre() {
		return typechambre;
	}
	public void setTypechambre(String typechambre) {
		this.typechambre = typechambre;
	}
	public int getNumchambre() {
		return numchambre;
	}
	public void setNumchambre(int numchambre) {
		this.numchambre = numchambre;
	}
	public int getSuperficie() {
		return superficie;
	}
	public void setSuperficie(int superficie) {
		this.superficie = superficie;
	}
	
	
	
	
	
	
}

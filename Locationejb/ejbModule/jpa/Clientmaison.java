package jpa;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity

public class Clientmaison {
	
	@Id
	int idmaison;
	
	String nommaison;
	String villemaison;
	String quartier;
	String lieu;
	int nummaison;
	
	public Clientmaison(String nommaison, String villemaison, String quartier,
			String lieu, int nummaison) {
		super();
		this.nommaison = nommaison;
		this.villemaison = villemaison;
		this.quartier = quartier;
		this.lieu = lieu;
		this.nummaison = nummaison;
	}
	
	public int getIdmaison() {
		return idmaison;
	}
	public void setIdmaison(int idmaison) {
		this.idmaison = idmaison;
	}
	public String getNommaison() {
		return nommaison;
	}
	public void setNommaison(String nommaison) {
		this.nommaison = nommaison;
	}
	public String getVillemaison() {
		return villemaison;
	}
	public void setVillemaison(String villemaison) {
		this.villemaison = villemaison;
	}
	public String getQuartier() {
		return quartier;
	}
	public void setQuartier(String quartier) {
		this.quartier = quartier;
	}
	public String getLieu() {
		return lieu;
	}
	public void setLieu(String lieu) {
		this.lieu = lieu;
	}
	public int getNummaison() {
		return nummaison;
	}
	public void setNummaison(int nummaison) {
		this.nummaison = nummaison;
	}
	

}

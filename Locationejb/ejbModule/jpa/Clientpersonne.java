package jpa;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity

public class Clientpersonne {
	
	@Id
	int idpersonne;
	
	String nom;
	String prenom;
	Date datenaiss;
	int telephone;
	String ville;

	public Clientpersonne(String nom, String prenom, Date datenaiss,
			int telephone, String ville) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.datenaiss = datenaiss;
		this.telephone = telephone;
		this.ville = ville;
	}
	
	public int getIdpersonne() {
		return idpersonne;
	}
	public void setIdpersonne(int idpersonne) {
		this.idpersonne = idpersonne;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Date getDatenaiss() {
		return datenaiss;
	}
	public void setDatenaiss(Date datenaiss) {
		this.datenaiss = datenaiss;
	}
	public int getTelephone() {
		return telephone;
	}
	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	
	
}

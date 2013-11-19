package jpa;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.jboss.security.integration.password.Password;


@Entity

public class Clientcompte {
	@Id
	int idcompte;
	
	String nomcompte;
	Password mdpcompte;
	
	
	public Clientcompte(String nomcompte, Password mdpcompte) {
		super();
		this.nomcompte = nomcompte;
		this.mdpcompte = mdpcompte;
	}
	
	public int getIdcompte() {
		return idcompte;
	}
	public void setIdcompte(int idcompte) {
		this.idcompte = idcompte;
	}
	public String getNomcompte() {
		return nomcompte;
	}
	public void setNomcompte(String nomcompte) {
		this.nomcompte = nomcompte;
	}
	public Password getMdpcompte() {
		return mdpcompte;
	}
	public void setMdpcompte(Password mdpcompte) {
		this.mdpcompte = mdpcompte;
	}

}

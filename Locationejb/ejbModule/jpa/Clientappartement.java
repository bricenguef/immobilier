package jpa;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Clientappartement {
	
	@Id
	int idappartement;
	
	int numappartement;
	int nbrechambre;
	int dimension;
	
	public Clientappartement(int numappartement, int nbrechambre, int dimension) {
		super();
		this.numappartement = numappartement;
		this.nbrechambre = nbrechambre;
		this.dimension = dimension;
	}
	
	
	public int getIdappartement() {
		return idappartement;
	}
	public void setIdappartement(int idappartement) {
		this.idappartement = idappartement;
	}
	public int getNumappartement() {
		return numappartement;
	}
	public void setNumappartement(int numappartement) {
		this.numappartement = numappartement;
	}
	public int getNbrechambre() {
		return nbrechambre;
	}
	public void setNbrechambre(int nbrechambre) {
		this.nbrechambre = nbrechambre;
	}
	public int getDimension() {
		return dimension;
	}
	public void setDimension(int dimension) {
		this.dimension = dimension;
	}
	
	

}

package dao;
import java.util.List;

import javax.ejb.Remote;

import jpa.Clientchambre;

@Remote
public interface GestionChambreDaoLocal {
	public void ajoutchambre(Clientchambre ch);
	public List <Clientchambre> getListClient();
	public Clientchambre recherchechambre(int id);

}

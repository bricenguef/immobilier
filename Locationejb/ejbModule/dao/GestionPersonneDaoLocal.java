package dao;
import java.util.List;
import javax.ejb.Remote;

import jpa.Clientpersonne;

@Remote
public interface GestionPersonneDaoLocal {
	public void ajoutpersonne(Clientpersonne ps);
	public Clientpersonne rechercheClient(int pk);
	public List <Clientpersonne> getListClient();
	public void deletepersonne(Clientpersonne ps);
	

}
      
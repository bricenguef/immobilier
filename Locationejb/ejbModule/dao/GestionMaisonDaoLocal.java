package dao;
import java.util.List;
import javax.ejb.Remote;

import jpa.Clientmaison;

@Remote
public interface GestionMaisonDaoLocal {
	public void ajoutmaison(Clientmaison ms);
	public Clientmaison rechercheCompte(int id);
	public List <Clientmaison> getListClient();
	public void deletemaison(Clientmaison ms);

}

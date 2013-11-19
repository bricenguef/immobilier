package dao;
import java.util.List;
import javax.ejb.Remote;

import jpa.Clientcompte;

@Remote
public interface GestionCompteDaoLocal {
	public void ajoutCompte(Clientcompte cpte);
	public Clientcompte rechercheCompte(int id);
	public List <Clientcompte> getListClient();
	public void deletecompte(Clientcompte cpte);

}

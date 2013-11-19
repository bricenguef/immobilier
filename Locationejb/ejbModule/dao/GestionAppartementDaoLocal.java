package dao;
import java.util.List;
import javax.ejb.Remote;

import jpa.Clientappartement;

@Remote
public interface GestionAppartementDaoLocal {

	public void ajoutappart(Clientappartement ap);
	public List <Clientappartement> getListClient();
	public Clientappartement rechercheapparrt(int id);
	public void deleteappart(Clientappartement ap);
}

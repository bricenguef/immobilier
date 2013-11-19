package dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import jpa.Clientappartement;

/**
 * Session Bean implementation class GestionAppartementDao
 */
@Stateless
public class GestionAppartementDao implements GestionAppartementDaoLocal {

	@PersistenceContext
    EntityManager em;
	
    public GestionAppartementDao() {
        // TODO Auto-generated constructor stub
    }
    public void ajoutappart(Clientappartement ap){
		em.persist(ap);
		}
    @SuppressWarnings("unchecked")
	public List <Clientappartement> getListClient(){
		return (List<Clientappartement>) em.createQuery("SELECT ap FROM Clientmaison ap");
}
public Clientappartement rechercheapparrt(int id){
		
		return (Clientappartement) em.find(Clientappartement.class, id);
}

public void deleteappart(Clientappartement ap){
	em.remove(em.merge(ap));
	
	}
}

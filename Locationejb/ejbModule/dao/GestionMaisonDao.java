package dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import jpa.Clientchambre;
import jpa.Clientmaison;

/**
 * Session Bean implementation class GestionMaisonDao
 */
@Stateless
public class GestionMaisonDao implements GestionMaisonDaoLocal {

	@PersistenceContext
    EntityManager em;
	public void ajoutmaison(Clientmaison ms){
		em.persist(ms);
	}
public Clientmaison rechercheCompte(int id){
		
		return (Clientmaison) em.find(Clientmaison.class, id);
}
public List <Clientmaison> getListClient(){
	return (List<Clientmaison>) em.createQuery("SELECT ms FROM Clientmaison ms");

}
public void deletemaison(Clientmaison ms){
	em.remove(em.merge(ms));
	
	} 
    public GestionMaisonDao() {
        // TODO Auto-generated constructor stub
    }

}

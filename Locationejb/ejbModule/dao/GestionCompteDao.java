package dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import jpa.Clientchambre;
import jpa.Clientcompte;
import jpa.Clientpersonne;

/**
 * Session Bean implementation class GestionCompteDao
 */
@Stateless
public class GestionCompteDao implements GestionCompteDaoLocal {

	@PersistenceContext
    EntityManager em;
	
	public void ajoutCompte(Clientcompte cpte){
		em.persist(cpte);
	}
public Clientcompte rechercheCompte(int id){
		
		return (Clientcompte) em.find(Clientcompte.class, id);
}
public List <Clientcompte> getListClient(){
	return (List<Clientcompte>) em.createQuery("SELECT cpte FROM Clientpersonne cpte");
}
public void deletecompte(Clientcompte cpte){
	em.remove(em.merge(cpte));
	
	} 
    public GestionCompteDao() {
        // TODO Auto-generated constructor stub
    }

}

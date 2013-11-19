package dao;


import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.PersistenceContext;
import javax.persistence.EntityManager;


import jpa.Clientmaison;
import jpa.Clientpersonne;

/**
 * Session Bean implementation class GestionPersonneDao
 */
@Stateless
public class GestionPersonneDao implements GestionPersonneDaoLocal {

   @PersistenceContext
    EntityManager em;
   
    public GestionPersonneDao() {
        // TODO Auto-generated constructor stub
    }
    	public void ajoutpersonne(Clientpersonne ps){
    		em.persist(ps);
	}

    		public Clientpersonne rechercheClient(int pk){
	
    			return (Clientpersonne) em.find(Clientpersonne.class, pk);
}

    		public List <Clientpersonne> getListClient(){
    			return (List<Clientpersonne>) em.createQuery("SELECT ps FROM Clientpersonne ps");
}
    		public void deletepersonne(Clientpersonne ps){
    			em.remove(em.merge(ps));
    			
    			} 
}

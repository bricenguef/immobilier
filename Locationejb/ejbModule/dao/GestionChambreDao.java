package dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import jpa.Clientchambre;

/**
 * Session Bean implementation class GestionChambreDao
 */
@Stateless
public class GestionChambreDao implements GestionChambreDaoLocal {

	@PersistenceContext
    EntityManager em;
	
	public void ajoutchambre(Clientchambre ch){
		em.persist(ch);
	}
	public List <Clientchambre> getListClient(){
		return (List<Clientchambre>) em.createQuery("SELECT ch FROM Clientmaison ch");
}
	
	public Clientchambre recherchechambre(int id){
		
		return (Clientchambre) em.find(Clientchambre.class, id);
}
	public void deletechambre(Clientchambre ch){
		em.remove(em.merge(ch));
		
		} 
    public GestionChambreDao() {
        // TODO Auto-generated constructor stub
    }

}

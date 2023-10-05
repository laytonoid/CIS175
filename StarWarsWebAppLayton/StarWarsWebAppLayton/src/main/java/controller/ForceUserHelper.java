package controller;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import model.ForceUser;

/**  
* Taylor Layton - tglayton
* CIS171 22149
* Sep 25, 2023
* Windows 10 
*/
public class ForceUserHelper {
	
	static EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("StarWarsWebAppLayton");
	
	public void insertForceUser(ForceUser fu) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
	em.persist(fu);
		em.getTransaction().commit();
		em.close();
	}
	
	public List<ForceUser> showAllForceUsers(){
		EntityManager em = emfactory.createEntityManager();
		List<ForceUser> allForceUsers = em.createQuery("SELECT f FROM ForceUser f").getResultList();
		return allForceUsers;
	}
	
	public ForceUser findForceUserByName(String forceUserName) {
	    EntityManager em = emfactory.createEntityManager();
	    em.getTransaction().begin();
	    TypedQuery<ForceUser> typedQuery = em.createQuery("SELECT fu FROM ForceUser fu WHERE fu.name = :name", ForceUser.class);
	    typedQuery.setParameter("name", forceUserName);
	    typedQuery.setMaxResults(1);
	    
	    ForceUser foundForceUser;
	    try {
	        foundForceUser = typedQuery.getSingleResult();
	    } catch (NoResultException ex) {
	        foundForceUser = null;
	    }
	   em.close();
	  return foundForceUser;
	}
	
	public ForceUser searchForForceUserById(Integer id) {
	    EntityManager em = emfactory.createEntityManager();
	    em.getTransaction().begin();
	    
	    ForceUser found = em.find(ForceUser.class, id);
	    
	    em.close();
	    return found;
	}

	public void updateForceUser(ForceUser toEdit) {
	    EntityManager em = emfactory.createEntityManager();
	    em.getTransaction().begin();
	    em.merge(toEdit); 
	    em.getTransaction().commit();
	    em.close();
	}
	
	public void deleteForceUser(ForceUser userToDelete) {
	    EntityManager em = emfactory.createEntityManager();
	    em.getTransaction().begin();
	    em.remove(em.merge(userToDelete)); 
	    em.getTransaction().commit();
	    em.close();
	}
	
}
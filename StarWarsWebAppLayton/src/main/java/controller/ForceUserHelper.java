package controller;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
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
	
	static EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("StarWars");
	
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
	
	// Add any other DAO methods as needed
}
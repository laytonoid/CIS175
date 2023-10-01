package controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.ListDetails;

/**  
* Taylor Layton - tglayton
* CIS171 22149
* Sep 29, 2023
* Windows 10 
*/

public class ListDetailsHelper {
	static EntityManagerFactory emfactory = 
Persistence.createEntityManagerFactory("ShoppingList");
	
	public void insertNewListDetails(ListDetails s) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.persist(s);
		em.getTransaction().commit();
		em.close();
	}
	
	public List<ListDetails> getLists() {
		EntityManager em = emfactory.createEntityManager();
		List<ListDetails> allDetails = em.createQuery("SELECT d FROM ListDetails d").getResultList();
		return allDetails;
	}
}
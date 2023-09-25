package controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import model.ListItem;

/**  
* Taylor Layton - tglayton
* CIS171 22149
* Sep 13, 2023
* Windows 10 
*/
public class ListItemHelper {
	static	EntityManagerFactory	emfactory	=	
			Persistence.createEntityManagerFactory("ShoppingList");

	public void insertItem(ListItem	li) {
		EntityManager	em	=	emfactory.createEntityManager();
		em.getTransaction().begin();
		em.persist(li);
		em.getTransaction().commit();
		em.close();
	}

	public	List<ListItem>	showAllItems(){
		EntityManager	em	=	emfactory.createEntityManager();
		List<ListItem>	allItems	=	em.createQuery("SELECT i FROM ListItem i").getResultList();
		return	allItems;
		}
	
	public void deleteItem(ListItem toDelete) {
	    EntityManager em = emfactory.createEntityManager();
	    em.getTransaction().begin();
	    TypedQuery<ListItem> typedQuery = em.createQuery("select li from ListItem li where li.store = :selectedStore and li.item = :selectedItem", ListItem.class);
	    // Substitute parameter with actual data from the toDelete item
	    typedQuery.setParameter("selectedStore", toDelete.getStore());
	    typedQuery.setParameter("selectedItem", toDelete.getItem());
	    // we only want one result
	    typedQuery.setMaxResults(1);
	    // get the result and save it into a new list item
	    ListItem result = typedQuery.getSingleResult();
	    // remove it
	    em.remove(result);
	    em.getTransaction().commit();
	    em.close();
	}
	
	public ListItem searchForItemById(int idToEdit) {
		EntityManager	em	=	emfactory.createEntityManager();
		//TypedQuery<ListItem> query = em.createQuery("SELECT i FROM ListItem AS i WHERE i.id = :id", ListItem.class);
		//query.setParameter("id", idToEdit);
		//ListItem toDelete = query.getSingleResult();
		//System.out.println(toDelete.toString());
		List<ListItem>	allItems	= showAllItems();
		for(ListItem item: allItems) {
		if(item.getId()==idToEdit)	{
			return item;
		}
		}
		return null;
	}

	public	void	updateItem(ListItem	toEdit)	{
//		TODO	Auto-generated	method	stub
	EntityManager	em	=	emfactory.createEntityManager();
	em.getTransaction().begin();
	em.merge(toEdit);
	em.getTransaction().commit();
	em.close();
	}

	
	public	List<ListItem>	searchForItemByStore(String	storeName)	{
//		TODO	Auto-generated	method	stub
	EntityManager	em	=	emfactory.createEntityManager();
	em.getTransaction().begin();
	TypedQuery<ListItem>	typedQuery	=	em.createQuery("select	li	from ListItem	li	where	li.store	=	:selectedStore",	ListItem.class);
	typedQuery.setParameter("selectedStore",	storeName);
	List<ListItem>	foundItems	=	typedQuery.getResultList();
	em.close();
	return	foundItems;
	}

	public	List<ListItem>	searchForItemByItem(String	itemName)	{
//		TODO	Auto-generated	method	stub
	EntityManager	em	=	emfactory.createEntityManager();
	em.getTransaction().begin();
	TypedQuery<ListItem>	typedQuery	=	em.createQuery("select	li	from	ListItem	li	where	li.item	=	:selectedItem",	ListItem.class);
	typedQuery.setParameter("selectedItem",	itemName);
	List<ListItem>	foundItems	=	typedQuery.getResultList();
	em.close();
	return	foundItems;
	}
	
	public	void	cleanUp(){
		emfactory.close();
		}
}


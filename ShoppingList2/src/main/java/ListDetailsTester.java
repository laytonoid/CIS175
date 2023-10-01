import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

import model.ListDetails;
import controller.ListDetailsHelper;
import controller.ShopperHelper;
import model.Shopper;
import model.ListItem;
import controller.ListItemHelper;
/**  
* Taylor Layton - tglayton
* CIS171 22149
* Sep 29, 2023
* Windows 10 
 * @return 
*/
public class ListDetailsTester {
	public static void main(String[] args) {
		Shopper cameron = new Shopper("Cameron");
		
		ListDetailsHelper ldh = new ListDetailsHelper();
		
		ListItem shampoo = new ListItem("Target", "Shampoo");
		ListItem brush = new ListItem("Target", "Brush");
		
		List<ListItem> cameronsItems = new			
ArrayList<ListItem>();
		cameronsItems.add(shampoo);
		cameronsItems.add(brush);
		
		ListDetails cameronsList = new ListDetails("Cameron's ShoppingList", LocalDate.now(), cameron);
		cameronsList.setListOfItems(cameronsItems);
		
		ldh.insertNewListDetails(cameronsList);
		
		List<ListDetails> allLists = ldh.getLists();
		for(ListDetails a: allLists) {
			System.out.println(a.toString());
		}
	}
}

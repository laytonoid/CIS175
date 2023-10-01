import model.ListItem;
import model.Shopper;
import controller.ShopperHelper;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**  
* Taylor Layton - tglayton
* CIS171 22149
* Sep 29, 2023
* Windows 10 
*/
public class ShoppingTester {
	
	public static void main(String[] args) {
		Shopper bill = new Shopper("Bill");
		ShopperHelper sh = new ShopperHelper();
		sh.insertShopper(bill);
		Shopper jim = new Shopper("Jim");
		sh.insertShopper(jim);
		List<Shopper> allShoppers = sh.showAllShoppers();
		for(Shopper a: allShoppers) {
			System.out.println(a.toString());
		}
	}
}
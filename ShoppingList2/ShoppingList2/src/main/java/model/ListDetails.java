package model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**  
* Taylor Layton - tglayton
* CIS171 22149
* Sep 29, 2023
* Windows 10 
*/

@Entity
public class ListDetails {
    public ListDetails() {
    }
	@Id
	@GeneratedValue
	@JoinTable
	private int id;
	private String listName;
	private LocalDate tripDate;
	@OneToMany(cascade=CascadeType.PERSIST, fetch=FetchType.EAGER)
			private List<ListItem> listOfItems;
	@ManyToOne (cascade=CascadeType.PERSIST)
			private Shopper shopper;
	
	public ListDetails(int id, String listName, LocalDate tripDate,
			Shopper shopper, List<ListItem> listOfItems) {
			//omitted for space but set them in your code 
		}
			public ListDetails(String listName, LocalDate tripDate,
			Shopper shopper, List<ListItem> listOfItems) {
			//omitted for space but set them in your code 
		}
			public ListDetails(String listName, LocalDate tripDate,
			Shopper shopper) {
			//omitted for space but set them in your code
		}
			/**
			 * @return the id
			 */
			public int getId() {
				return id;
			}
			/**
			 * @param id the id to set
			 */
			public void setId(int id) {
				this.id = id;
			}
			/**
			 * @return the listName
			 */
			public String getListName() {
				return listName;
			}
			/**
			 * @param listName the listName to set
			 */
			public void setListName(String listName) {
				this.listName = listName;
			}
			/**
			 * @return the tripDate
			 */
			public LocalDate getTripDate() {
				return tripDate;
			}
			/**
			 * @param tripDate the tripDate to set
			 */
			public void setTripDate(LocalDate tripDate) {
				this.tripDate = tripDate;
			}
			/**
			 * @return the listOfItems
			 */
			public List<ListItem> getListOfItems() {
				return listOfItems;
			}
			/**
			 * @param listOfItems the listOfItems to set
			 */
			public void setListOfItems(List<ListItem> listOfItems) {
				this.listOfItems = listOfItems;
			}
			/**
			 * @return the shopper
			 */
			public Shopper getShopper() {
				return shopper;
			}
			/**
			 * @param shopper the shopper to set
			 */
			public void setShopper(Shopper shopper) {
				this.shopper = shopper;
			}
			
	
}
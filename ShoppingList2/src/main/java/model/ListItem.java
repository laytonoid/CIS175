package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="items")
public class ListItem {
	  
	  public ListItem(String store, String item) {
	    this.store = store;
	    this.item = item;
	  }
	@Id
	@GeneratedValue
	@Column(name="ID")
	private int id;
	@Column(name="STORE")
	private String store;
	@Column(name="ITEM")
	private String item;
	
	public ListItem(){
		super();
	}
	
	public int getId() {
		return id;
	}
	
	public String getStore() {
		return store;
	}
	
	public void setStore(String store) {
		this.store = store;
	}
	
	public String getItem() {
	return item;
	}
	
	public void setItem(String item) {
	this.item = item;
	}
	
	public String returnItemDetails( ){
	return this.store + ": " + this.item;
	}
}
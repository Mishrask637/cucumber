package implementation;

import java.util.ArrayList;
import java.util.List;

public class Product {

	private String productName;
	private int price;
	
	
	
	public Product(String productName,int price)
	{
		this.price=price;
		this.productName=productName;
	}



	public String getProductName() {
		return productName;
	}



	public void setProductName(String productName) {
		this.productName = productName;
	}



	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		this.price = price;
	}
	
	
	public List<String> getProductlist()
	{
		List<String> productList = new ArrayList<>();
		productList.add("Apple Macbook Pro");
		productList.add("Windows Laptop");
		productList.add("Linux Computer");
	 	return productList;
		
	}
	
}

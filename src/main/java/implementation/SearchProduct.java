package implementation;

public class SearchProduct {

	
	public String displayProduct(Product product)
	{
		System.out.println("Inside Search product"+product.getProductName()+"   "+product.getPrice());
		if(product.getProductlist().contains(product.getProductName()))
		{
			System.out.println("Product name is "+product.getProductName());
			return product.getProductName();
		}
		
		return null;
	}
	
}

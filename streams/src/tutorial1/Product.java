package tutorial1;

public class Product {
	public int id;
	public String productName;
	public double price;
	
	public Product(int id, String productName, double price){
		this.id = id;
		this.productName = productName;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
}

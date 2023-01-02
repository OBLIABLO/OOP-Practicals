package LaptopPackage;

public class Laptop {
	
	private String modelName;
	private Double Price;
	
	public Laptop(String modelName, Double Price) {
		super();
		// TODO Auto-generated constructor stub
		this.modelName = modelName;
		this.Price = Price;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public Double getPrice() {
		return Price;
	}
	public void setPrice(Double sellingPrice) {
		this.Price = sellingPrice;
	}


}



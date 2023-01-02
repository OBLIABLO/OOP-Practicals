package LaptopPackage;

public class Laptop {
	private String brandName, modelName;
	@SuppressWarnings("unused")
	private Double sellingPrice, screenSize;
	private Integer storageCapacity;
	private Boolean isSSD;
	private OS os;

	public Laptop(String brandName, 
			String modelName, 
			Double sellingPrice, 
			Double screenSize, 
			Integer storageCapacity, 
			Boolean isSSD,
			OS os) 
	{
		this.brandName = brandName;
		this.modelName = modelName;
		this.sellingPrice = sellingPrice;
		this.screenSize = screenSize;
		this.storageCapacity = storageCapacity;
		this.isSSD = isSSD;
		this.os = os;	
	}


	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public Double getSellingPrice() {
		return sellingPrice;
	}

	public void setSellingPrice(Double sellingPrice) {
		this.sellingPrice = sellingPrice;
	}

	public Double getScreenSize() {
		return screenSize;
	}

	public void setScreenSize(Double screenSize) {
		this.screenSize = screenSize;
	}

	public Integer getStorageCapacity() {
		return storageCapacity;
	}

	public void setStorageCapacity(Integer storageCapacity) {
		this.storageCapacity = storageCapacity;
	}

	public Boolean getIsSSD() {
		return isSSD;
	}

	public void setIsSSD(Boolean isSSD) {
		this.isSSD = isSSD;
	}

	public OS getOs() {
		return os;
	}

	public void setOs(OS os) {
		this.os = os;
	}

}

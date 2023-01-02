package testSystem;

public class Appliance {

	protected String brand;

	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public Appliance() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void testOn() {
		
		System.out.println("Start Testing Appliance ");
	}
	
    public void testOff() {
    	
    	System.out.println("Stop Testing Appliance\n");
		
	}
    
	  public void test_pass() {
		  System.out.println("Passed test");
	  }
	  
	  public void test_fail() {
		  System.out.println("Failed test");
	  }
	    
   
}

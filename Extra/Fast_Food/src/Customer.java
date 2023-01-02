
public class Customer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("************Blazing Fast-Food Corner***********\n");
		FastFoodCorner shop = new FastFoodCorner("Panjim");
		System.out.println("\tWelcome to our "+shop.getLocation()+" Branch");
		shop.order();
		
	}

}

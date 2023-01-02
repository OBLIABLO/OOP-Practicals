import java.util.ArrayList;
public class Customer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("************Blazing Fast-Food Corner***********\n");
		FastFoodCorner shop = new FastFoodCorner("Panjim");
		System.out.println("\tWelcome to our "+shop.getLocation()+" Branch");
		shop.menu();
		
		ArrayList<String> snacklist = new ArrayList<String>(){
		{
			add("Shawarma");
			add("Veg_burger");
			add("Chicken_pizza");
			add("Samosa");
		 }
		};
		ArrayList<Snack> snacks = shop.order(snacklist);
		
		for(Snack snack : snacks)
			snack.is_eating();
	}

}

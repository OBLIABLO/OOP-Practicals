
import java.util.ArrayList;
public class FastFoodCorner 
{
	
	private String location;
	
	public FastFoodCorner(String location) {
		this.location = location;
		
	}

	public String getLocation() {
		return location;
		
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	public void menu() 
	{
				
				System.out.print("\n IXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXI\n");
				System.out.println(" |               M E N U                   |");
				System.out.println(" IxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxI");
				System.out.print(" |    VEG           |");
				System.out.println("\t    NON-VEG\t   |");
				System.out.println(" IxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxI");
				System.out.print(" | 1) Samosa        |");
				System.out.println("\t4) Chicken Pizza   |");
				System.out.println(" |\t\t    | \t\t\t   |");
				System.out.print(" | 2) Veda Pav      |");
				System.out.println("\t5) Shawarma\t   |");
				System.out.println(" |\t\t    | \t\t\t   |");
				System.out.print(" | 3) Veg Burger    |");
				System.out.println("\t6) Chicken Burger  |");
				System.out.println(" |\t\t    | \t\t\t   |");
				System.out.println(" IxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxI");
				System.out.println(" |           PRESS 7 TO EXIT               |");
				System.out.println(" IXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXI");
				
				
	}
	
	public Snack getSnack(String snackType)
	{
		switch(snackType)
		{
		 
		 case "Samosa":
		 return new Samosa();
		 
		 case "Vada_pav":
		 return new Vada_pav();
		 
		 case "Veg_burger":
		 return new Veg_burger();
			 
		 case "Chicken_pizza":
		 return new Chicken_pizza();
			 
		 case "Shawarma":
		 return new Shawarma();
			 
		 case "Chicken_burger":
		 return new Chicken_burger();
		 
		 default:
			 return null;
		 
			 
		}
		
	}
	
	public ArrayList<Snack> order (ArrayList<String> snackTypeList){
		ArrayList<Snack> snacks = new ArrayList<>();
		
		for(String snackType : snackTypeList)
			snacks.add(this.getSnack(snackType));
		
		return snacks;
	}
}

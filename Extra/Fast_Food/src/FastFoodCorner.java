import java.util.Scanner;
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
	
	public void order() 
	{
		try (Scanner print = new Scanner(System.in)) {
			lp : while(true) {
				
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
				
				System.out.print("\n Order => ");
			
				Integer choice = print.nextInt();
				
				switch(choice) 
				{
				
				case 1:
				System.out.println("\nOrdered Samosa");
				Snack s = new Samosa();
				s.is_eating();
				break;
				
				case 2:
				System.out.println("\nOrdered Veda Pav");
				Snack v = new Vada_pav();
				v.is_eating();
				break;
				
				case 3:
				System.out.println("\nOrdered Veg Burger");
				Snack vb = new Veg_burger();
				vb.is_eating();
				break;
				
				case 4:
				System.out.println("\nOrdered Chicken Pizza");
				Snack cp = new Chicken_pizza();
				cp.is_eating();
				break;
				
				case 5:
				System.out.println("\nOrdered Shawarma");
				Snack sw = new Shawarma();
				sw.is_eating();
				break;
				
				case 6:
				System.out.println("\nOrdered Chicken Burger");
				Snack cb = new Chicken_burger();
				cb.is_eating();
				break;
				
				case 7:
				break lp;
				
				default:
				System.out.println("\nInvalid Input");
				break;
							
				
				}
			}
		}
		
	
	}
}

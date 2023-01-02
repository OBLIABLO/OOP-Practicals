package Main;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;
import LaptopPackage.Laptop;
import LaptopPackage.LaptopDB;
import LaptopPackage.OS;

public class ClientApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 @SuppressWarnings("serial")
		HashMap<String, Laptop> Laptopmap = new HashMap<String, Laptop>()
		 {{
			 put("Apple Macbook Air 2017", new Laptop("Apple","Mackbook Air",64000.0,13.3,128,true,OS.Mac));
			 put("MSI Titan", new Laptop("MSI","Ttitan G77",654000.0,15.3,1024,true,OS.Windows));
			 put("Dell Latitude", new Laptop("Dell","Latitude",44000.0,14.3,512,true,OS.Linux));
			 
		 }};
		 
		
	 LaptopDB laptopdb = new LaptopDB(Laptopmap);
	 ArrayList<Laptop>laptopmap= laptopdb.listAllLaptops();
			 
		printLaptop(laptopmap);

	
	}
	
	public static void printLaptop(ArrayList<Laptop> K) {
		for (Laptop L: K) 
		{
			System.out.println("Brand: "+L.getBrandName());
			System.out.println("Model: "+L.getModelName());
			System.out.println("Price: "+L.getSellingPrice());
			System.out.println("ScreenSize: "+L.getScreenSize());
			System.out.println("Storage: "+L.getStorageCapacity());
			System.out.println("SSD: "+L.getIsSSD());
			System.out.println("Operating System: "+L.getOs() + "\n");		
		}
	}
}

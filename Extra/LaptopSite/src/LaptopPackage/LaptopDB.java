package LaptopPackage;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LaptopDB {
	private Map<String, Laptop> laptopmap = new HashMap<String, Laptop>();
	public LaptopDB(HashMap<String, Laptop> laptopmap) {
		
		this.laptopmap = laptopmap;
	}
	
	public ArrayList<Laptop>listAllLaptops()
	{
		ArrayList<Laptop> allLaptop = new ArrayList<Laptop>();
	    laptopmap.forEach((key,value)->{
	    	allLaptop.add(value);
	    });
		return allLaptop;
	}
	
	public ArrayList<Laptop> listLaptopsByBrand(String brandName)
	{
		ArrayList<Laptop> laptop_by_brand = new ArrayList<Laptop>();
		laptopmap.forEach((key,value)->{
			if(value.getBrandName()== brandName)
			{
				laptop_by_brand.add(value);
			}
		});
		return laptop_by_brand;
	}
	
	public ArrayList<Laptop> listLaptopsBySellingPrice(Double sellingPrice)
	{
		ArrayList<Laptop> laptop_by_sell= new ArrayList<Laptop>();
		laptopmap.forEach((key,value)->{
			if(value.getSellingPrice() > sellingPrice)
			{
				laptop_by_sell.add(value);
			}
		});
		return laptop_by_sell;
	}
	
	public ArrayList<Laptop> filterByScreenSize(Double screenSize)
	{
		ArrayList<Laptop> filter_screensize= new ArrayList<Laptop>();
		laptopmap.forEach((key,value)->{
			if(value.getScreenSize().equals(screenSize))
			{
				filter_screensize.add(value);
			}
		});
		return filter_screensize;
	}
	
	public ArrayList<Laptop> filterByStorage(Integer storage, Boolean isSSD)
	{
		ArrayList<Laptop> filter_storage= new ArrayList<Laptop>();
		return filter_storage;
	}
	
	public ArrayList<Laptop> filterByOS(OS os)
	{
		ArrayList<Laptop> filter_OS= new ArrayList<Laptop>();
		return filter_OS;
	}
	

}

import testSystem.HomeAppliance;
import testSystem.Appliance;

public class ClientApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Appliance test = new Appliance();
		HomeAppliance home = new HomeAppliance();
		
		test.testOn();
		home.switchWifiOn();
		home.switchWifiOff();
		test.test_pass();
		test.testOff();
		
	
		
        
	 

	}

}

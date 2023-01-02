package testSystem;

public class HomeAppliance extends Appliance implements WifiEnabledDevice{

	public HomeAppliance() {
		super();
		// TODO Auto-generated constructor stub
	}
 
	@Override
	public void switchWifiOn() {
		System.out.println("Home Appliance Wifi turned on and is on frequency" + this.wifiFrequrncy);
	}
	
	@Override
	public void switchWifiOff() {
		System.out.println("Home Appliance Wifi turned off");
	}
	
}

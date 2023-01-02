
public abstract class Snack {

	String name;
	
	public Snack() {
		super();
	}
	
	public String getName(String name) {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void is_eating() {
		System.out.println("is eating" + this.name);
	}
}

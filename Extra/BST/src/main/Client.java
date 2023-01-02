package main;
import LaptopPackage.Laptop;
import bst.BSTree;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BSTree tree_add = new BSTree();
		
		tree_add.addNode(new Laptop("Apple-Mackbook Air",164000.0));
		tree_add.addNode(new Laptop("MSI-Ttitan G77",554000.0));
		tree_add.addNode(new Laptop("Dell-Latitude",44000.0));
		tree_add.addNode(new Laptop("Acer-Aspire",24000.0));
		tree_add.addNode(new Laptop("HP-Ryzen",34000.0));
		tree_add.addNode(new Laptop("Lenovo-IdeaPad",36490.0));
		tree_add.addNode(new Laptop("Alienware-M15",224000.0));
		
		tree_add.printTree();
		


	}

}

package bst;

import LaptopPackage.Laptop;

public class BSTnode {
	
	private Laptop data;
	private BSTnode left, right;

	public BSTnode(Laptop data) {
		super();
		this.data = data;
	}

	public Laptop getData() {
		return data;
	}

	public void setData(Laptop data) {
		this.data = data;
	}

	public BSTnode getLeft() {
		return left;
	}

	public void setLeft(BSTnode left) {
		this.left = left;
	}

	public BSTnode getRight() {
		return right;
	}

	public void setRight(BSTnode right) {
		this.right = right;
	}
	
	

}

package bst;
import LaptopPackage.Laptop;

public class BSTree {
	
	private BSTnode root;
	
	public BSTree() {
		this.setRoot(null);
		// TODO Auto-generated constructor stub
	}
	
	public BSTnode getRoot() {
		return root;
	}

	public void setRoot(BSTnode root) {
		this.root = root;
	}
	
	public void addNode(Laptop data)
	{
		BSTnode treenode = new BSTnode(data);
		
		if(this.root == null)
		{
		this.root = treenode;
		return;
		}
		BSTnode temp = this.root;
		while(temp != null)
		{
			if(temp.getData().getPrice() > treenode.getData().getPrice())
			{
				if(temp.getLeft() == null)
				{
					temp.setLeft(treenode);
					return;
				}
				temp = temp.getLeft();
			}
			else 
			{
				if(temp.getRight() == null)
				{
					temp.setRight(treenode);
					return;
				}
				temp = temp.getRight();
				
			}
		}
	}
	
	public void printTree()
	{
		this.inorder(this.root);
	}
	
	public void inorder(BSTnode node)
	{
		if(node == null)
			return;
		
		this.inorder(node.getLeft());
		
		System.out.println("\nModel: " 
		+ node.getData().getModelName() 
		+ "\nPrice: " 
		+ node.getData().getPrice());
		
		this.inorder(node.getRight());
	}
	

	
}

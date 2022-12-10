package trees_assignment;

public class BinarySearch {

	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(50);
		bst.insert(30);
		bst.insert(10);
		bst.insert(70);
		bst.insert(60);
		bst.insert(40);
		bst.insert(80);
		
		System.out.println("Level Order Traversal : ");
		bst.levelOrder();
		System.out.println("-------------");
		
		System.out.println("In Order Traversal : ");
		bst.inOrder();
		System.out.println("-------------");
		
		System.out.println("Pre Order Traversal : ");
		bst.preOrder();
		System.out.println("-------------");
		
		System.out.println("Post Order Traversal : ");
		bst.postOrder();
		System.out.println("-------------");
		
		bst.delete(10);
		System.out.println("After deletion of node 10 :");
		bst.levelOrder();
		System.out.println("-------------");
		
		System.out.println("Is node 10 present : " + bst.find(10));
		System.out.println("Is node 70 present : "+ bst.find(70));
		
	
	}

}

package trees_assignment;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {

	public class Node{
		private int val;
		private Node leftchild;
		private Node rightChild;
		
		public Node(int value) {
			this.val = value;
		}

		@Override
		public String toString() {
			return "Node [val=" + val + "]";
		}

		
	}
	private Node root;
	
	public void insert(int value) {                                          
		var newNode = new Node(value);
		if(root == null) {
			root = newNode;
			return;
		}
		var current = root;
		while(true) {
			if(value < current.val) {
				if(current.leftchild == null) {
					current.leftchild = newNode;
					break;
				}
				current = current.leftchild;
			}
			else {
				if(current.rightChild == null) {
					current.rightChild = newNode;
					break;
				}
				current = current.rightChild;
			}
		}
	}
	
	public boolean find(int value) {                                      
		var current = root;
		while(current != null) {
			if(value < current.val) {
				current = current.leftchild;
			}
			else if(value > current.val) {
				current = current.rightChild;
			}
			else
				return true;
		}
		return false;
	}
	
	//Left-Parent-Right
	public void inOrder() {
		inOrderTraversal(root);
	}
	private void inOrderTraversal(Node root) {
		if(root == null)
			return;
		inOrderTraversal(root.leftchild);
		System.out.println(root.val);
		inOrderTraversal(root.rightChild);
	}
	
	//Parent-Left-Right
	public void preOrder() {
		preOrderTraversal(root);
	}
	private void preOrderTraversal(Node root) {									
		if(root == null)
			return;
		System.out.println(root.val);
		preOrderTraversal(root.leftchild);
		preOrderTraversal(root.rightChild);
	}
	
	//Left-Right-Parent
	public void postOrder() {
		postOrderTraversal(root);
	}
	private void postOrderTraversal(Node root) {								
		if(root == null)
			return;
		postOrderTraversal(root.leftchild);
		postOrderTraversal(root.rightChild);
		System.out.println(root.val);
	}
	
	//Level By Level Traversal
	
	public void levelOrder() {
		levelOrderTraversal(root);
	}
	private void levelOrderTraversal(Node root) {                              
		
		Queue<Node> queue = new LinkedList<>();
		queue.add(root);
		while(!queue.isEmpty()) {
			Node curr = queue.poll();
			System.out.println(curr);
			if(curr.leftchild != null) {
				queue.add(curr.leftchild);
			}
			if(curr.rightChild != null) {
				queue.add(curr.rightChild);
			}
		}
	}
	
	public void delete(int value) {                                            
		root = deleteNode(root,value);
	}
	
	private Node deleteNode(Node root , int value) {
		if(root == null)
			return root;
		
		if(value < root.val) {
			root.leftchild = deleteNode(root.leftchild,value);
		}
		else if(value > root.val) {
			root.rightChild = deleteNode(root.rightChild,value);
		}
		else {
			//no leaf nodes simply put null
			if(root.leftchild == null || root.rightChild == null) {
				return null;
			}
			//node with two children :: get minimum value from right subtree and make it the root node.
			root.val = minValue(root.rightChild);
			
			//delete the minimum value node from the binary search tree.
			root.rightChild = deleteNode(root.rightChild,root.val);
		}
		return root;
	}
	private int minValue(Node root) {
		int min = root.val;
		while(root.leftchild != null) {    //minimum value in binary search tree will be in the leftmost node
			min = root.leftchild.val;
			root = root.leftchild;
		}
		return min;
	}
	
	
}

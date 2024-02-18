import jdk.internal.misc.FileSystemOption;
import java.util.*;

public class BinaryTrees {

	static class Node{
		int data;
		Node left;
		Node right;
		
		Node(int data){
			this.data=data;
			left=null;
			right=null;
		}
		
	}
	
	static class BinaryTreeX{
		static int idx=-1;
		public static Node buildTree(int arr[]) {
			idx++;
			if(arr[idx]==-1) {
				return null;
			}
			
			Node newNode = new Node(arr[idx]);
			newNode.left= buildTree(arr);
			newNode.right=buildTree(arr);
			
			return newNode;
		}
	}
	//pre-order traversal
	public static void preOrder(Node root) {
		if(root==null) {
			System.out.print("-1 ");
			return;
		}
		System.out.print(root.data + " ");
		preOrder(root.left);
		preOrder(root.right);
	}
	
	//in-order traversal
	public static void inOrder(Node root) {
		if(root==null) {
			//System.out.print("-1 ");
			return;
		}
		
		inOrder(root.left);
		System.out.print(root.data+ " ");
		inOrder(root.right);
	}
	
	//post-order traversal
	public static void postOrder(Node root) {
		if(root==null) {
			//System.out.print("-1 ");
			return;
		}
		
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data+ " ");
	}
	
	public static void levelOrder(Node root) {
		if(root==null) {
			return;
		}
		
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		q.add(null);
		
		while(!q.isEmpty()) {
			Node currNode = q.remove();
			if(currNode==null) {
				System.out.println();
				if(q.isEmpty()) {
					break;
				}else {
					q.add(null);
				}	
			}else {
				System.out.println(currNode.data+ " ");
				if(currNode.left!=null) {
					q.add(currNode.left);
				}
				if(currNode.right!=null) {
					q.add(currNode.right);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int nodes[]= {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
		BinaryTreeX tree = new BinaryTreeX();
		Node root=tree.buildTree(nodes);
		System.out.println("root of the given tree is "+root.data);
		//preOrder(root);
		//inOrder(root);
		//postOrder(root);
		levelOrder(root);
	}

}

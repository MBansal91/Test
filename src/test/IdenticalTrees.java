package test;

import java.util.Iterator;
import java.util.Stack;

class Node1 {
	int data;
	Node left;
	Node right;
	Node1(int data){
		this.data = data;
		this.left = this.right = null;
	}
}
public class IdenticalTrees {

	Node root;
	Node root1;
	static int count = 0;
	static int count1 = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		Node root1 = new Node(1);
		root1.left = new Node(2);
		root1.right = new Node(3);
		root1.left.left = new Node(4);
		root1.left.right = new Node(5);
		root1.right.left = new Node(6);
		root1.right.right = new Node(7);
		//root1.right.right.left = new Node(8);
		IdenticalTrees trees = new IdenticalTrees();
		Stack<Integer> tree1 = new Stack<Integer>();
		Stack<Integer> tree2 = new Stack<Integer>();
		trees.preOrder(root, tree1);
		trees.preOrder(root1, tree2);
		System.out.println(trees.identicalTrees(root, root1));
		System.out.println(count);
		Boolean check = true;
		while(!tree1.isEmpty() || !tree2.isEmpty()){
			count1++;
			if(tree1.pop() == tree2.pop()){
				continue;
			} else {
				check = false;
				break;
			}
		}
		System.out.println("Both trees are identical : "+ check);
		System.out.println(count1);
	}
	
	void preOrder(Node node, Stack<Integer> tree){
		if(node != null){
			//System.out.println(node.data);
			count1++;
			tree.push(node.data);
			preOrder(node.left, tree);
			preOrder(node.right, tree);
		}
	}
	
	Boolean identicalTrees(Node node1, Node node2){
		
		Boolean check2;
		Boolean check3;
		if(node1 == null && node2 == null){
			return true;
		}
		if((node1 != null && node2 == null) || (node1 == null && node2 != null)){
			return false;
		}
		
		if((node1.left ==  null && node1.right == null) && (node2.left == null && node2.right == null)){
			count++;
			if(node1.data == node2.data) {
				return true;
			} else {
				return false;
			}
		}
		if(node1.data == node2.data){
			count++;
			check2 = identicalTrees(node1.left, node2.left);
			check3 = identicalTrees(node1.right, node2.right);
			return check2 && check3;
		} else {
			count++;
			return false;
		}
	}

}

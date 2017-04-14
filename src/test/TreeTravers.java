package test;

class Node {
	int data;
	Node left, right;
	
	public Node(int data){
		this.data = data;
		left = right = null;
	}
}
public class TreeTravers{

	Node root;
	static int heightOfTree = 0; 
	
	TreeTravers(int data){
		root = new Node(data);
	}
	
	TreeTravers() {
		root = null;
	}
	
	Node findLCA(int n1, int n2){
		return findLCA(root, n1, n2);
	}
	
	Node findLCA(Node node, int n1, int n2) {
		if (node == null) {
			return null;
		} 
		if(node.data == n1 || node.data == n2){
			return node;
		}
		
		Node left_lca = findLCA(node.left, n1, n2);
		Node right_lca = findLCA(node.right, n1, n2);
		
		if(left_lca != null && right_lca != null){
			return node;
		}
		
		return (left_lca != null)? left_lca: right_lca;
	}
	
	public static void main(String[] args) {
		
		TreeTravers travers = new TreeTravers();
		travers.root = new Node(26);
		travers.root.left = new Node(10);
		travers.root.right = new Node(3);
		travers.root.left.left = new Node(4);
		travers.root.left.right = new Node(6);
		travers.root.right.right = new Node(7);
		travers.root.right.left = new Node(3);
		travers.preOrder(travers.root);
		System.out.println("==========================");
		travers.postOrder(travers.root);
		System.out.println("==========================");
		travers.inOrder(travers.root);
		System.out.println("==========================");
		System.out.println("Leaf Nodes Count :" +travers.countLeafNodes(travers.root));
		System.out.println("==========================");
		System.out.println("Non Leaf Nodes Count :" +travers.countNonLeafNodes(travers.root));
		System.out.println("==========================");
		System.out.println("Count Hieght:" +travers.countHieght(travers.root));
		System.out.println("==========================");
		System.out.println("Common Ancestor :" +travers.findLCA(5, 3).data);
		System.out.println("==========================");
		Boolean check = false;
		if (travers.sumTree(travers.root) != 0){
			check = true;
		}
		System.out.println("Sum Tree :" + check);
		System.out.println("==========================");
		System.out.println("All Leaves are on same height :" +travers.isLeavesOnSameHeight(travers.root, 0) + heightOfTree);
	}
	
	Boolean isLeavesOnSameHeight(Node node, int level){
		Boolean left;
		Boolean right;
		if(node == null){
			return true;
		}
		if(node.right == null && node.left == null){
			if(heightOfTree == 0){
				heightOfTree = level;
			} else if(heightOfTree == level){
				return true;
			} else {
				return false;
			}
		}
		left = isLeavesOnSameHeight(node.left, level +1);
		right = isLeavesOnSameHeight(node.right, level +1);
		
		if(left && right){
			return true;
		} else {
			return false;
		}
	}
	
	int sumTree(Node node) {
		int data_right;
		int data_left;
		
		if(node == null){
			return 0;
		}
		if(node.left == null && node.right == null){
			return node.data;
		}
		
		data_right = sumTree(node.right);
		data_left = sumTree(node.left);
		
		if(node.data == (data_left + data_right)) {
			return node.data*2;
		} else {
			return 0;
		}
	}
	
	void preOrder(Node node){
		
		if(node != null){
			System.out.println(node.data);
			preOrder(node.left);
			preOrder(node.right);
			
		}
	}
	
	void postOrder(Node node){
		
		if(node != null){
			postOrder(node.left);
			postOrder(node.right);
			System.out.println(node.data);
		}
	}

	void inOrder(Node node){
	
	if(node != null){
		inOrder(node.left);
		System.out.println(node.data);
		inOrder(node.right);
		
	}
	}
	
	int countLeafNodes(Node node){
		int a;
		int b;
		if(node == null) {
			return 0;
		}
		if(node.left == null  && node.right == null){
			System.out.println("Data : "+node.data);
			return 1;
		}
		else {
			a = countLeafNodes(node.left);
			b = countLeafNodes(node.right);
			return a+b;
		}
	}
	int countNonLeafNodes(Node node){
		int a;
		int b;
		if(node == null) {
			return 0;
		}
		else if(node.left == null  && node.right == null){
			return 0;
		}
		else {
			System.out.println("Data : "+node.data);
			a = countNonLeafNodes(node.left);
			b = countNonLeafNodes(node.right);
			return (a+b+1);
		}
	}
	
	int countHieght(Node node){
		int a;
		int b;
		if(node == null) {
			return 0;
		}
		else if(node.left == null  && node.right == null){
			return 0;
		}
		else {
			System.out.println("Data : "+node.data);
			a = countHieght(node.left);
			b = countHieght(node.right);
			if(a>b)
				return a+1;
			else 
				return b+1;
		}
	}
}

package test;

public class TreeImplementation {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s1 = {"A,B","A,C","B,D"};
		TreeNode root = new TreeNode();
		root.data = null;
		TreeImplementation implementation =  new TreeImplementation();
		System.out.println(root.data);
		for(int i=0;i<s1.length;++i) {
			System.out.println("Sending s1[i]"+s1[i]);
			TreeNode node = new TreeNode();
			node.data = String.valueOf(s1[i].charAt(0));
			TreeNode child = new TreeNode();
			child.data = String.valueOf(s1[i].charAt(2));
			node.leftChild = child;
			
			root = implementation.insertNode(node, root);
			System.out.println("Recieved : "+root);
		}
	}
	
	TreeNode insertNode(TreeNode node, TreeNode root){
		if(root.data == null){
			System.out.println("Root is null");
			root = node;
		} else if( root.data != null && (root.data == node.data)) {
			if((root.leftChild.data == node.leftChild.data) ||
					((root.rightChild.data == node.leftChild.data) && root.rightChild.data != null)){
				System.out.println("Nodes repeated");
			} else {
			//	if(root.)
				
			}
		}
		return root;
	}
}

class TreeNode {
	String data;
	TreeNode leftChild;
	TreeNode rightChild;
}

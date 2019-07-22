import java.util.Scanner;

public class LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int val = s.nextInt();
		Node1 firstNode = new Node1(val);
		int next = s.nextInt();
		Node1 currNode = firstNode;
		while(next != 0) {
			Node1 nextNode = new Node1(next);
			currNode.link = nextNode;
			currNode = nextNode;
			next = s.nextInt();
		}
		currNode = firstNode;
		while(currNode != null) {
			System.out.println(currNode.data);
			currNode = currNode.link;
		}
	}

}

class Node1{
		int data;
		Node1 link;
		
		Node1(int val){
			data = val;
			link = null;
		}
		Node1(){
		}
}

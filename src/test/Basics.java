package test;

public class Basics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Basics basics = new Basics();
		System.out.println(basics.testInt(1));
		System.out.println(basics.testNull(null));
		System.out.println(basics.testByte((byte) 256));
	}
	
	int testInt(int i){
		return 10;
	}
	
	int testInt(Integer i){
		return 20;
	}
	
	int testNull(Object b){
		return 10;
	}
	
	int testNull(String b){
		return 20;
	}
	int testByte(byte b){
		return 20;
	}
}

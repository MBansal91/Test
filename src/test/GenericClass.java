package test;

public class GenericClass {
	
	int arithmetic(int a, int b, String type) {
		if(type.equalsIgnoreCase("Multiplication")) {
			return a*b;
		}
		else if(type.equalsIgnoreCase("Add")) {
			return a+b;
		}
		else if(type.equalsIgnoreCase("Subtract")) {
			return a-b;
		}
		else if(type.equalsIgnoreCase("Division")) {
			return a/b;
		}
		else 
			return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericClass genericClass = new GenericClass();
		System.out.println(genericClass.arithmetic(12, 3, "division"));
	}

}

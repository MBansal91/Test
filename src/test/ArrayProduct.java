/*
 * Given an array, return an array where each index stores the product of all numbers except the number on the index itself. 
 * Implement your solution in Java and see if your output matches the expected output!
 */
public class ArrayProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4};
		int finalArr[] = new int[arr.length];
		int product = 1;
		for(int i =0; i<arr.length;++i) {
			product = product * arr[i];
		}
		System.out.println(product);
		for(int i =0; i< arr.length;++i) {
			finalArr[i] = product/arr[i];
			System.out.println(finalArr[i]);
		}
	}

}

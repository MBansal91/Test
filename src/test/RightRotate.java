/*
 * Given an array, can you rotate its elements by one index from right to left? 
 * Implement your solution in Java and see if your code runs successfully!
 */
public class RightRotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {8,9,1,2,3,4,5,6,7};
		int lenght = arr.length;
		int firstVal = arr[0];
		for(int i =0;i<lenght-1;++i) {
			arr[i] = arr[i+1];
		}
		arr[lenght-1] = firstVal;
		for(int i = 0 ;i<arr.length;++i)
			System.out.println(arr[i]);
	}

}

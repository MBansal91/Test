/*
 * Given an array of size n, can you find the second maximum element in the array? 
 * Implement your solution in Java and see if your output matches the correct output!
 */
public class SecondMaxInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp = 0;
		int loop = 0;
		int[] arr = {8,9,1,2,3,4,5,6,7};
		for(int i =0;i< arr.length;++i) {
			for(int j =i+1;j<arr.length;++j) {
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				loop++;
			}
		}
		for(int i = 0 ;i<arr.length;++i)
			System.out.println(arr[i]);
		System.out.println(loop);
		System.out.println("Second Max: " + arr[arr.length-2]);
	}
	

}

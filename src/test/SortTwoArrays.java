
public class SortTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {10,20,30};
		int[] arr2 = {12,22,28, 40, 50, 60};
		
		int len1 = arr1.length;
		int len2 = arr2.length;
		int i = 0, j =0;
		while(i < len1 && j < len2) {
			if(arr1[i] < arr2[j]) {
				System.out.println(arr1[i]);
				i++;
			} else {
				System.out.println(arr2[j]);
				j++;
			}
			
		}
		if(i< arr1.length) {
			while(i<arr1.length) {
				System.out.println(arr1[i]);
				i++;
			}
		}
		if(j< arr2.length) {
			while(j<arr2.length) {
				System.out.println(arr2[j]);
				j++;
			}
		}
	}	

}

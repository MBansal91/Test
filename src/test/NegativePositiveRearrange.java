import java.util.ArrayList;

/*
 * Given an array, can you re-arrange its elements in such a way that the negative elements appear 
 * at one side and positive elements appear at the other? 
 * Solve this problem in Java and see if your code runs correctly!
 */
public class NegativePositiveRearrange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {-8,9,1,-2,-3,4,-5,6,-7};
		//One way sort the array. Order of n2
		//Another way
		ArrayList<Integer> positiveList = new ArrayList<Integer>();
		ArrayList<Integer> negativeList = new ArrayList<Integer>();
		for(int i =0;i<arr.length;++i) {
			if(arr[i]>=0) {
				positiveList.add(arr[i]);
				arr[i] = 0;
			} else {
				negativeList.add(arr[i]);
				arr[i] = 0;
			}
		}
		int i =0;
		int j = 0;
		int lenght = negativeList.size();
		for(Integer val: negativeList) {
			arr[i] = val;
			/*if(j<positiveList.size()) {
				arr[i+lenght-1] = positiveList.get(j);
				j++;
			}*/
			i++;
		}
		for(Integer val: positiveList) {
			arr[i] = val;
			/*if(j<positiveList.size()) {
				arr[i+lenght-1] = positiveList.get(j);
				j++;
			}*/
			i++;
		}
		for(i = 0 ;i<arr.length;++i)
			System.out.println(arr[i]);
	}

}

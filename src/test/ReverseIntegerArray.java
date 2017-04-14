package test;

import java.util.Scanner;

public class ReverseIntegerArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int length = scanner.nextInt();
		int[] arr = new int[length];
		for(int i = 0; i<length;++i){
			arr[i] = scanner.nextInt();
		}
		for(int i = length-1; i>= 0;--i){
			System.out.print(arr[i]+ " ");
		}

	}

}

package test;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int inputA  = scanner.nextInt();
		int inputB  = scanner.nextInt();
		scanner.close();
		int count = 0;
		System.out.println("Integer.toBinaryString(inputA) :"+Integer.toBinaryString(inputA));
		System.out.println("Integer.toBinaryString(inputB) :"+Integer.toBinaryString(inputB));
		String binaryA = Integer.toBinaryString(inputA);
		String binaryB = Integer.toBinaryString(inputB);
		StringBuilder builder = new StringBuilder("");
		int aLength = binaryA.length();
		int bLength = binaryB.length();
		if(aLength >= bLength) {
			int diff = aLength - bLength;
			for(int i=0; i<diff; ++i){
				builder.append("0");
			}
			binaryB = builder.append(binaryB).toString();
			
		} else if(aLength < bLength) {
			int diff = bLength - aLength;
			for(int i=0; i<diff; ++i){
				builder.append("0");
			}
			binaryA = builder.append(binaryA).toString();
			
		}
		System.out.println("binaryA : "+binaryA);
		System.out.println("binaryB : "+binaryB);
		for(int i =0; i< binaryA.length();++i){
			if(binaryA.charAt(i) != binaryB.charAt(i)){
				count++;
			}
		}
		System.out.println("count : "+count);
	}
}

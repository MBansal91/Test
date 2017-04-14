package test;

import java.util.Scanner;

public class HourGlass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int[][] array = new int[6][6];
		for(int i=0;i<6;++i){
			for(int j=0;j<6;++j){
				array[i][j] = scanner.nextInt();
			}
		}
		scanner.close();
		System.out.println(array[1].length);
		int calculateHourGlass = 0;
		int maxHourGlass = 0;
		for(int i=0;i<array.length-2;++i) {
			for(int j=0;j<array[1].length-2;++j){
				calculateHourGlass = array[i][j] + array[i][j+1] + array[i][j+2] +
						array[i+1][j+1] + array[i+2][j] +array[i+2][j+1] + array[i+2][j+2];
				if(i ==0 && j == 0){
					maxHourGlass = calculateHourGlass;
				} else {
					if(calculateHourGlass > maxHourGlass) {
						maxHourGlass = calculateHourGlass;
					}
				}
			}
		}
		System.out.println(maxHourGlass);
	}

}

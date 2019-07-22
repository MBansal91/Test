import java.util.Scanner;

public class TicTacToe {
	
	int[][][] successfulRes = {
			{
				{11,21,31},
				{12,22,32},
				{13,23,33},
				{11,22,33},
				{13,22,31},
				{21,22,23}, 
				{11,12,13},
				{31,32,33}
			}
		 };

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int[][] ticTacToe = new int[3][3];
		int i =0;
		int input=0, row, col,chance =1;
		System.out.println("Enter row col for 0, like 13 for 1st row and 3rd col: ");
		input = s.nextInt();
		while(input != 2) {
			
			row = input/10 - 1;
			col = input%10 - 1;
			System.out.println("Row: "+ row + ", Col:" +col);
			if(row >= 0 && row < 3 && col >= 0 && col < 3) {
				if(chance == 1) {
					ticTacToe[row][col] = 1;
				} else {
					ticTacToe[row][col] = 2;
				}
				checkForGameOver(ticTacToe, chance, input);
			} else {
				System.out.println("Bad input");
			}
			i++;
			if(i%2 ==0) {
				System.out.println("Enter row col for 0, like 13 for 1st row and 3rd col: ");
				input = s.nextInt();
				chance = 1;
			} else if(i%2 ==1) {
				System.out.println("Enter row col for 1, like 13 for 1st row and 3rd col: ");
				input = s.nextInt();
				chance = 2;
			}	
		}
		for(i =0;i<3;++i) {
			for(int j=0;j<3;++j) {
				System.out.print(ticTacToe[i][j] + " , ");
			}
			System.out.println();
		}
	}
	
	public static Boolean checkForGameOver(int[][] ticTacToe, int whosChance, int location){
		
		//for(int[][] dArray: successfulRes) {
			
	//	}
		return true;
	}

}

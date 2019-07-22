import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Conway {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Conway conway =new Conway();
		
		Scanner sc  = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
		int[][] a = new int[r][c];
		int[][] b = new int[r][c];
		for(int i=0;i<r;++i){
			for(int j=0;j<c;++j){
				a[i][j] =0;
			}
		}
		a[2][4] = 1;
		a[2][5] = 1;
		a[2][6] = 1;
		a[2][10] = 1;
		a[2][11] = 1;
		a[2][12] = 1;
		
		a[4][2] = 1;
		a[5][2] = 1;
		a[6][2] = 1;
		
		a[4][7] = 1;
		a[5][7] = 1;
		a[6][7] = 1;
		
		a[4][9] = 1;
		a[5][9] = 1;
		a[6][9] = 1;
		
		a[4][14] = 1;
		a[5][14] = 1;
		a[6][14] = 1;
		
		a[7][4] = 1;
		a[7][5] = 1;
		a[7][6] = 1;
		a[7][10] = 1;
		a[7][11] = 1;
		a[7][12] = 1;
		
		a[9][4] = 1;
		a[9][5] = 1;
		a[9][6] = 1;
		a[9][10] = 1;
		a[9][11] = 1;
		a[9][12] = 1;
		
		a[10][2] = 1;
		a[11][2] = 1;
		a[12][2] = 1;
		
		a[10][7] = 1;
		a[11][7] = 1;
		a[12][7] = 1;
		
		a[10][9] = 1;
		a[11][9] = 1;
		a[12][9] = 1;
		
		a[10][14] = 1;
		a[11][14] = 1;
		a[12][14] = 1;
		
		a[14][4] = 1;
		a[14][5] = 1;
		a[14][6] = 1;
		a[14][10] = 1;
		a[14][11] = 1;
		a[14][12] = 1;
		
		for(int i=0;i<r;++i) {
			for(int j=0;j<c;++j) {
				if(a[i][j] == 0)
					System.out.print("_");
				else
					System.out.print(a[i][j]);
			}
			System.out.println();
		}
		
		boolean loop = true;
		System.out.println();
		while(loop) {
			
            	for(int i=0;i<r;++i) {
        			for(int j=0;j<c;++j) {
        				int liveNodes = conway.getLiveNodes(a,i,j, r, c);
        				System.out.println("live nodes:"+i+":"+j+":"+r+":"+c+":"+liveNodes);
        				if((liveNodes < 2 || liveNodes > 3) && a[i][j]==1) {
        					b[i][j] =0;
        				} else if ((liveNodes == 2 && liveNodes == 3) && a[i][j]==1){
        					b[i][j] =1;
        				}else if (liveNodes ==3 && a[i][j]==0){
        					b[i][j] =1;
        				}
        				
        				if(b[i][j] == 0)
        					System.out.print("_");
        				else
        					System.out.print(b[i][j]);
        			}
        			System.out.println();
        		}
            	System.out.println();
            	//a = b;
            	System.out.print("Printing a:\n");
            	for(int i=0;i<r;++i) {
        			for(int j=0;j<c;++j) {
        				a[i][j] = b[i][j];
        				if(a[i][j] == 0)
        					System.out.print("_");
        				else
        					System.out.print(a[i][j]);
        			}
        			System.out.println();
        		}
            	TimeUnit.SECONDS.sleep(1);
            	System.out.flush();
            
		}

	}
	
	public int getLiveNodes(int[][] arr, int row, int col, int r, int c) {
		int count = 0;
		int loopCount = 0;
		for(int i =row-1;i<=row+1;++i) {
			for(int j=col-1;j<=col+1;++j) {
				loopCount++;
				if(i>=0 && i< r && j>=0 && j<c && loopCount !=5) {
					if(arr[i][j] == 1) {
						count++;
					}
				}
			}
		}
		return count;
	}

}

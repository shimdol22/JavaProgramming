package Chap4;

public class Array_Rotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = new int[5][5];
		int[][] b = new int[5][5];
		int row, col;
		int i=1;
		
		for(row=0;row<=4;row++) {
			for(col=0;col<=4;col++) {
				a[row][col] = i++;
			}
		}
		
		for(row=0; row<=4; row++) {
			for(col=0; col<=4; col++) {
				System.out.printf("%3d", a[row][col]);
			}
			System.out.println();
		}
		
		// 90µµ È¸Àü
		for(row=0; row<=4; row++) {
			for(col=0; col<=4; col++) {
				b[row][col] = a[col][4-row];
			}
		}
		System.out.println();
		for(row=0; row<=4; row++) {
			for(col=0; col<=4; col++) {
				System.out.printf("%3d", b[row][col]);
			}
			System.out.println();
		}
	}
}



package Chap4;

public class Make_Two_Dimension_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x =3, y=3; //가로(열), 세로(행) 값
		
		int[][] arr = new int[y][x];
		
		for(int i=0; i<arr.length; i++) {
			for(int k=0; k<arr[i].length; k++) {
				System.out.print(arr[i][k]+ " ");
			}
			System.out.println();
		}
	}

}

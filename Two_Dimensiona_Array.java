package Chap4;
import java.util.Scanner;

public class Two_Dimensiona_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("2차원 배열");
		
		int x,y; //가로, 세로
		System.out.println("가로 세로 크기를 입력하세요");
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		y = sc.nextInt();
		
		int[][] arr = new int[y][x];
		//가로 세로, 행, 열 혼동하지 말자!
		for(int i=0; i<y; i++) {
			for(int j=0; j<x; j++) {
				arr[i][j] = 10+(int)(Math.random()*90);
			}
		}
		
		//출력문
		for(int i=0; i<y; i++) {
			for(int j=0; j<x; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}

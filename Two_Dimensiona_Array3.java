package Chap4;
import java.util.Scanner;

public class Two_Dimensiona_Array3 {

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
		
		// 2차원 배열 -> 1차원배열
		System.out.println("2차원 -> 1차원");
		int[] arr_1d = new int[x*y];
		/*
		for(int i=0; i<y; i++) {
			for(int j=0; j<x; j++) {
				arr_1d[i * x + j] = arr[i][j];
			}
		}
		*/
		
		arr_1d = di2to1(arr);
		
		
		for(int i=0; i<x*y; i++) {
			System.out.print(arr_1d[i]+" ");
			if((i+1)%x==0)
				System.out.println();
		}
		/*
		//출력문
		for(int i=0; i<y; i++) {
			for(int j=0; j<x; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		*/
	}


	static int[] di2to1(int [][]a) {
		int x,y;
		y = a.length;
		x = a[0].length;
		int[] temp = new int[x*y];
		for(int i=0; i<y; i++) {
			for(int j=0; j<x; j++) {
				temp[i * x + j] = a[i][j];
			}
		}
		return temp;
	}
	}
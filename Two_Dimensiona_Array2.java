package Chap4;
import java.util.Scanner;

public class Two_Dimensiona_Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("2���� �迭");
		
		int x,y; //����, ����
		System.out.println("���� ���� ũ�⸦ �Է��ϼ���");
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		y = sc.nextInt();
		
		int[][] arr = new int[y][x];
		//���� ����, ��, �� ȥ������ ����!
		for(int i=0; i<y; i++) {
			for(int j=0; j<x; j++) {
				arr[i][j] = 10+(int)(Math.random()*90);
			}
		}
		
		// 2���� �迭 -> 1�����迭
		System.out.println("2���� -> 1����");
		int[] arr_1d = new int[x*y];
		for(int i=0; i<y; i++) {
			for(int j=0; j<x; j++) {
				arr_1d[i * x + j] = arr[i][j]; //i=0,j=0 -> 0x2+0 =0 -> arr[0][0] ���� arr_1d[0]�� ����
			}
		}
		
		for(int i=0; i<x*y; i++) {
			System.out.print(arr_1d[i]+" ");
			if((i+1)%x==0)
				System.out.println();
		}
		/*
		//��¹�
		for(int i=0; i<y; i++) {
			for(int j=0; j<x; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		*/
	}
}

package Chap4;
import java.util.Scanner;

public class Two_Dimensiona_Array {

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
		
		//��¹�
		for(int i=0; i<y; i++) {
			for(int j=0; j<x; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}

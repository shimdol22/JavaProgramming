package Chap2;

import java.util.Scanner;

public class divisor_02 {
	public static void main(String[] args) {
		System.out.print("�����Է�> ");
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for(int i=2; i<=N; i++) {
			// ���μ��� ������ ������ �ݺ�
			while(N%i==0) {
				System.out.print(i + " ");
				N = N/i;
			}
		}
	}

}

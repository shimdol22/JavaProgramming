package Chap2;

import java.util.Scanner;

public class Euclid {

	public static void main(String[] args) {
			System.out.print("�� �� �Է�> ");
			Scanner sc = new Scanner(System.in);
			int N = sc.nextInt();
			int M = sc.nextInt();
			
			//��Ŭ���� ȣ���� method
			int ans = gcd(N, M);
			System.out.println(ans);
			
			
	
		}
	static int gcd(int a, int b) {
		while(a%b!=0) {
			int r = a%b;
			a = b;
			b = r;
		}
		return b;
	}
}

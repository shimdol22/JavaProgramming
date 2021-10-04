package Chap2;

import java.util.Scanner;

public class Euclid01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("셋이상 정수의 최대공약수");
		Scanner sc = new Scanner(System.in);
		System.out.print("> ");
		int N;
		N = sc.nextInt();
		int[] data = new int[N];
		
		for(int i=0; i<N; i++) {
			data[i] = sc.nextInt();
		}
		sc.close();
		
		int ans = gcd(data[0], data[1]);
		for(int i=2; i<N; i++) {
			ans = gcd(ans, data[i]);
		}
		System.out.println(ans);
	}
	
	static int gcd(int a, int b) {
		while(a%b != 0) {
			a = a%b;
			int temp = a;
			a = b;
			b = temp;
		}
		return b;
	}
}

package Chap2;

import java.util.Scanner;

public class divisor {

	public static void main(String[] args) {
		System.out.println("숫자입력> ");
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		
		for(int i=1; i<=N/2; i++) {
			if(N % i == 0) {
				System.out.println(i);
			}
		}
	}
}

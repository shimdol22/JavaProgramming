package Chap2;

import java.util.Scanner;

public class divisor_02 {
	public static void main(String[] args) {
		System.out.print("숫자입력> ");
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for(int i=2; i<=N; i++) {
			// 소인수로 나누는 과정을 반복
			while(N%i==0) {
				System.out.print(i + " ");
				N = N/i;
			}
		}
	}

}

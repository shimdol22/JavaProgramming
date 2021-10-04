package Chap2;

import java.util.Scanner;

public class gcd {

	public static void main(String[] args) {
			System.out.print("두 수 입력> ");
			Scanner sc = new Scanner(System.in);
			int N = sc.nextInt();
			int M = sc.nextInt();
			
			int gcd =1;
			for(int i=2; i<=N; i++) {
				// 소인수로 나누는 과정을 반복
				while((N%i==0) && (M%i==0)) {
					gcd *=i;
					N = N/i;
					M = M/i;
				}
			}
			System.out.println("최대공약수:"+ gcd);
		}
	}

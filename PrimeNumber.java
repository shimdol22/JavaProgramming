package Chap1;
import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) { 
		//������ ������
		System.out.println("�����Է�> ");
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		// API
		int sqrtN = (int)Math.sqrt(N); //Java API
		
		boolean prime= true;
		
		for(int i=2; i<=sqrtN; i++) { 
			if(N % i == 0) {
				prime = false;
				break;
			} 
		} 
		if(prime) {
			System.out.println(N+"�� �Ҽ�");
		}else
			System.out.println(N+"�� �Ҽ��� �ƴ�");
	}
	
}

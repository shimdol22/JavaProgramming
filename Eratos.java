package Chap1;
import java.util.Scanner;

public class Eratos {

	public static void main(String[] args) {
		System.out.println("�����Է�> ");
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		boolean[] arr = new boolean[200];
		for(int i=2; i<=N; i++) { //�ʱ�ȭ
			arr[i] = true;
		}
		
		
		// API
		int sqrtN = (int)Math.sqrt(N);//Java API
		
		for(int i=2; i<=sqrtN; i++) { 
			if(arr[i]) { //����� �Ҽ����� ����
				for(int j=i*i; j<=N; j+=i) {
					arr[j] = false;
				}
			}
		}
		for(int i=2; i<=N; i++) {
			if(arr[i]) {
				System.out.println(i+" ");
		}
		}
	}
}
package Chap3;
import java.util.Scanner;

public class Dec2Bin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(">");
		int dec;
		Scanner sc = new Scanner(System.in);
		dec = sc.nextInt();
		sc.close();
		
		byte[] bin = new byte[100];
		int cnt=0;
		while(dec!=0) {
			bin[cnt++] = (byte)(dec%2);
			dec = dec/2;
		}
		//배열의 값을 역순으로 출력해야함
		for(int i=0; i<cnt; i++) {
			System.out.print(bin[cnt-1-i]);
		}
	}
}

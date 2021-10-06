package Chap3;
import java.util.Scanner;
public class Print_to_hex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(">");
		int data = 0;
		Scanner sc = new Scanner(System.in);
		data = sc.nextInt();
		sc.close();

		//System.out.format("%d", data); //10진수로 출력
		//System.out.format("%x", data); //16진수로 출력
		System.out.format("0x%08x", data);
	}

}

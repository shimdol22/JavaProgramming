package Chap5;
import java.util.Scanner;
public class String_pro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("> ");
		Scanner sc = new Scanner(System.in);
		String num_str;
		num_str = sc.next();
		sc.close();
		
		int sum=0;
		for(int i=0; i<num_str.length(); i++) {
			sum += num_str.charAt(i) - '0'; //아스키코드 값 0을 빼면 됨
			//sum += num_str.charAt(i); //여기까지만하면 아스키 코드 값이 입력 ex) 13의 아스키코드값
		}
		System.out.println(sum);
	}

}

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
			sum += num_str.charAt(i) - '0'; //�ƽ�Ű�ڵ� �� 0�� ���� ��
			//sum += num_str.charAt(i); //����������ϸ� �ƽ�Ű �ڵ� ���� �Է� ex) 13�� �ƽ�Ű�ڵ尪
		}
		System.out.println(sum);
	}

}

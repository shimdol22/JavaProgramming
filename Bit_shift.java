package Chap3;
import java.util.Scanner;
public class Bit_shift {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(">");
		int shift =0;
		Scanner sc = new Scanner(System.in);
		shift = sc.nextInt();
		sc.close();
		int set =0;
		
		set = set | (1<<shift);
		
		System.out.print(set);
		//System.out.format("0x%08x", set);
	}

}

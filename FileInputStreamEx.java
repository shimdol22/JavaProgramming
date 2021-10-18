package Chap12;

import java.io.*;

public class FileInputStreamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b[] = new byte[10];
		try {
			FileInputStream fin = new FileInputStream("c:\\Temp\\byte.out");
			int n = 0;
			int c = 0;
			while((c=fin.read()) != -1) {
				b[n] = (byte)c;
				n++;
			}
			System.out.println("c:\\Temp\\byte.out에서 읽은 배열을 출력합니다");
			for(int i=0; i<b.length; i++) {
				System.out.print(b[i]);
				System.out.println();
			}
			fin.close();
		}catch(Exception e) {
			System.out.println("입출력오류");
		}
	}

}

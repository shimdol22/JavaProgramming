package Chap12;

import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("파일입출력");
		FileReader fin = null;
		try {
			fin = new FileReader("c:\\windows\\system.ini"); 
			int c;
			while ((c = fin.read()) != -1) { 		
				System.out.print((char)c);
			}
			fin.close();
		}
		catch (IOException e) {
			System.out.println("입출력 오류");

	}

}
}

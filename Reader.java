package Chap12;
import java.io.*;

public class Reader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fin = new FileInputStream("c:\\Temp\\self.txt");
			InputStreamReader in = new InputStreamReader(fin, "UTF-8");
			int c;
			
			System.out.println("���ڵ� ���� ������"+in.getEncoding());
			while((c = in.read()) != -1) {
				System.out.print((char)c);
			}
			in.close();
			fin.close();
		} 
		catch(Exception e) {
			System.out.println("����� ����");
			}
	}

}

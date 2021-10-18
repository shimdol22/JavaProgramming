package Chap12;
import java.io.*;
public class FileOutputStreamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileOutputStream fout = null;
		byte b[] = {6,12,51,-1,-4};
		try {
			fout = new FileOutputStream("c:\\Temp\\byte.out");
			for(int i=0; i<b.length; i++) {
				fout.write(b[i]);
			}
			fout.close();
		}catch(Exception e) {
			System.out.println("입출력오류");
			return;
		}
		System.out.println("저장완료");
	}

}

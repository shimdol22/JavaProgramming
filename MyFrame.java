package Chap13;

import java.awt.Color;
import java.awt.Graphics;
import java.io.FileInputStream;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame extends JFrame {
	MyFrame(){
		setTitle("���� ���");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new MyPanel());
		
		setSize(400,400); // ������ ũ�⺸�� Ŀ���� 256 x 256
		setVisible(true);
	}
	class MyPanel extends JPanel{

		@Override
		protected void paintComponent(Graphics g) {
			// TODO Auto-generated method stub
			super.paintComponent(g);
			
			// 1. Binary File Read (����ó��)
			int data[] = new int[500*500];
			int	W = 256; // ������ ����ũ��
			int H = 256; // ������ ����ũ��
			int n = 0, temp;
			
			try {
				FileInputStream fin = new FileInputStream("c:\\Temp\\GIRL.dat"); //������ ����� ��ġ
				while((temp=fin.read())!=1) {
					data[n++] = temp;
				}
				fin.close();
			} catch(Exception e) {
				System.out.println("���� �б� ����");
				return;
			}
			// 2. 1���� �迭 -> 2���� �迭 (2���� �迭)
			
			int pix[][] = new int[300][300];
			for(int i=0; i<H; i++) {
				for(int j=0; j<W; j++) {
					// 0 ~ 255
					pix[i][j] = 255 - data[i*W+j];
				
				}
			}
			
			// 3. ȭ�鿡 ���� �׸��� (GUI)
			for(int i=0; i<H; i++) {
				for(int j=0; j<W; j++) {
					g.setColor(new Color(pix[i][j], pix[i][j], pix[i][j]));
					g.drawOval(10+j, 10+i, 1, 1);
				}
			}
			
			
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyFrame();
	}

}

package Chap7;


import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFlow extends JFrame {
	MyFlow(){
		//������
		setTitle("GUI �ǽ�");	
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();

		c.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 20));
		c.add(new JButton("OK")); // ctrl + shift + o
		c.add(new JButton("Cancel")); // ��ư ����� �ڵ� 
		c.add(new JButton("ignore"));
		
		c.setBackground(Color.ORANGE); //ȭ�� �� ����
		setSize(300,400); //ȭ�� ������
		setVisible(true); //true�� �ؾ� ȭ�鿡 ������
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyFlow();
	}

}

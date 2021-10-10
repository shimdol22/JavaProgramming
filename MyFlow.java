package Chap7;


import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFlow extends JFrame {
	MyFlow(){
		//생성자
		setTitle("GUI 실습");	
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();

		c.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 20));
		c.add(new JButton("OK")); // ctrl + shift + o
		c.add(new JButton("Cancel")); // 버튼 만드는 코드 
		c.add(new JButton("ignore"));
		
		c.setBackground(Color.ORANGE); //화면 색 설정
		setSize(300,400); //화면 사이즈
		setVisible(true); //true로 해야 화면에 보여짐
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyFlow();
	}

}

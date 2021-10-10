package Chap7;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyLayout extends JFrame {
	MyLayout(){
		setTitle("GridLayout Sample");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null); //디폴트 배치관리자 삭제
		
		for(int i=1; i<=9; i++) {
			JButton b = new JButton(Integer.toString(i));
			b.setSize(50, 20);
			b.setLocation(i*15, i*15);
			b.addActionListener(new MyActionLi());
			c.add(b);
		}
		
		
		//라벨 만들기
		JLabel la = new JLabel("HELLO");
		la.setLocation(130, 50);
		la.setSize(200, 20);
		c.add(la);
		
		
		setSize(300,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyLayout();
	}

}
class MyActionLi implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton b = (JButton)e.getSource();
		b.setBackground(Color.BLACK);
	}
	
}

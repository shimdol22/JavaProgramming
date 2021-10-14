package Chap8;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class IndeptListener extends JFrame {
	IndeptListener(){
		setTitle("이벤트 처리");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton b = new JButton("ACTION");
		c.add(b);
		b.addActionListener(new MyActionLi());
		
		setSize(350,150);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new IndeptListener();
	}

}

//독립클래스로 리스너 만들기
class MyActionLi implements ActionListener{

	@Override  //Source 에서 자동 오버라이딩 하자
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton b = (JButton)e.getSource();
		if(b.getText().equals("ACTION")) {
			b.setText("HELLO");
		}
	}
	
}

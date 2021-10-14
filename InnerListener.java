package Chap8;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class InnerListener extends JFrame {
	InnerListener(){
		setTitle("이벤트 처리");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton b = new JButton("ACTION");
		b.addActionListener(new MyActionLi());
		c.add(b);
		
		setSize(350,150);
		setVisible(true);
	}
	//내부 클래스
	//독립 클래스와 차이점: 내부 클래스는 해당 클래스의 메소드나 필드를 자유롭게 쓸 수 있다.
	private class MyActionLi implements ActionListener{

	@Override  //Source 에서 자동 오버라이딩 하자
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton b = (JButton)e.getSource();
		if(b.getText().equals("ACTION")) {
			b.setText("HELLO");
		}
		else {
			InnerListener.this.setTitle(b.getText());
		}
	}
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new InnerListener();
	}

}

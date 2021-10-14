package Chap8;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class InnerListener extends JFrame {
	InnerListener(){
		setTitle("�̺�Ʈ ó��");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton b = new JButton("ACTION");
		b.addActionListener(new MyActionLi());
		c.add(b);
		
		setSize(350,150);
		setVisible(true);
	}
	//���� Ŭ����
	//���� Ŭ������ ������: ���� Ŭ������ �ش� Ŭ������ �޼ҵ峪 �ʵ带 �����Ӱ� �� �� �ִ�.
	private class MyActionLi implements ActionListener{

	@Override  //Source ���� �ڵ� �������̵� ����
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

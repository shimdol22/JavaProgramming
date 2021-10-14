package Chap8;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class AnonyListener extends JFrame {
	public AnonyListener() {
		setTitle("이벤트 처리");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton b = new JButton("Action");
		c.add(b);
		
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton)e.getSource();
				if(b.getText().equals("Action")) {
					b.setText("HELLO");
				}
				else {
					b.setText("ACTION");
					setTitle(b.getText());
				}
			}
		});
		
		setSize(350,150);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new AnonyListener();
	}

}

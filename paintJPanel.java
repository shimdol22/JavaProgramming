package Chap11;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class paintJPanel extends JFrame {
	private int cnt = 0;
	private Point[] start = new Point[100];
	private Point[] end = new Point[100];
	
	paintJPanel(){
		setTitle("Graphic기반 GUI");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new MyPanel());
		
		setSize(400,200);
		setVisible(true);
	}
	class MyPanel extends JPanel{
		MyPanel(){
			setBackground(Color.YELLOW);
			
			addMouseListener(new MouseAdapter() {

				@Override
				public void mousePressed(MouseEvent e) {
					// TODO Auto-generated method stub
					super.mousePressed(e);
					start[cnt] = e.getPoint();
					
				}

				@Override
				public void mouseReleased(MouseEvent e) {
					// TODO Auto-generated method stub
					super.mouseReleased(e);
					end[cnt++] = e.getPoint();
					repaint(); // -> 화면 다시 그려 Event
				}
				
			});
		}
		@Override
		protected void paintComponent(Graphics g) {
			// TODO Auto-generated method stub
			super.paintComponent(g);
			for(int i=0; i<cnt; i++) {	
				g.setColor(Color.RED);
				g.drawLine((int)start[i].getX(), (int)start[i].getY(), (int)end[i].getX(),(int)end[i].getY());
			}

		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new paintJPanel();
	}

}

package Chap11;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GraphicsFillEx extends JFrame {
	private MyPanel panel = new MyPanel();
	public GraphicsFillEx() {
		setTitle("Graphic��� GUI");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		setSize(100,350);
		setVisible(true);
	}
	class MyPanel extends JPanel{

		@Override
		protected void paintComponent(Graphics g) {
			// TODO Auto-generated method stub
			super.paintComponent(g);
			g.setColor(Color.RED);
			g.fillRect(10, 10, 50, 50);
			g.setColor(Color.BLUE);
			g.fillOval(10, 70, 50, 50);
			g.setColor(Color.GREEN);
			g.fillRoundRect(10, 130, 50, 50, 20, 20);
			g.setColor(Color.MAGENTA);
			g.fillArc(10, 190, 50, 50, 0, 270);
			g.setColor(Color.orange);
			int[] x = {30,10,30,60};
			int[] y = {250,275,300,275};
			g.fillPolygon(x, y, 4);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GraphicsFillEx();
	}

}

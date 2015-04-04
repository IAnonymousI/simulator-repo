import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;

public class Canvas extends JPanel implements ActionListener{
	
	//Components
	private Timer time = new Timer(5, this);
	private double x = 250, y = 250, velX = 0, velY = 0, accX = 1, accY = 1;
	
	public Canvas(){
		StatusWindow2 statusWindow = new StatusWindow2();
		time.start();
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		Graphics2D red = (Graphics2D) g;
		Graphics2D blue = (Graphics2D) g;
		Graphics2D white = (Graphics2D) g;
		Ellipse2D redCircle = new Ellipse2D.Double(x, y, 10, 10);
		Ellipse2D blueCircle = new Ellipse2D.Double(x, y, 10, 10);
		Ellipse2D whiteCircle = new Ellipse2D.Double(x, y, 10, 10);
		red.fill(redCircle);
		blue.fill(blueCircle);
		white.fill(whiteCircle);
	}
	
	public void actionPerformed(ActionEvent e){
		x += velX;
		y += velY;
		if(OutOfBoundaries()){
			x -= velX;
			y -= velY;
			repaint();
		}
		else{
			repaint();
		}
	}
	
	public boolean OutOfBoundaries(){
		if(x < 0 || y < 0 || x > 500 || y > 500){
			return true;
		}
		return false;
	}
}

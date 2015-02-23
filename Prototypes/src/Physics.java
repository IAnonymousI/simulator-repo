import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;

public class Physics extends JPanel implements ActionListener, KeyListener{
	
	//Components
	
	Timer time = new Timer(5, this);
	double x = 250, y = 250, velX = 0, velY = 0, accX = 1, accY = 1;
	
	public Physics(){
		time.start();
		addKeyListener(this);
		setFocusable(true);
		setFocusTraversalKeysEnabled(false);
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.setColor(Color.WHITE);
		Graphics2D g2 = (Graphics2D) g;
		Ellipse2D circle = new Ellipse2D.Double(x, y, 10, 10);
		g2.fill(circle);
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
	public void up(){
		velX = 0;
		velY = -1;
	}
	public void down(){
		velX = 0;
		velY = 1;
	}
	public void left(){
		velX = -1;
		velY = 0;
	}
	public void right(){
		velX = 1;
		velY = 0;
	}
	
	public boolean OutOfBoundaries(){
		if(x < 200 || y < 200 || x > 500 || y > 500){
			return true;
		}
		return false;
	}
	
	public void keyPressed(KeyEvent e){
		int code = e.getKeyCode();
		if(code == KeyEvent.VK_UP){
			up();
		}
		else if(code == KeyEvent.VK_DOWN){
			down();
		}
		else if(code == KeyEvent.VK_LEFT){
			left();
		}
		else if(code == KeyEvent.VK_RIGHT){
			right();
		}
	}
	public void keyTyped(KeyEvent e){}
	public void keyReleased(KeyEvent e){
		velX = 0;
		velY = 0;
	}
}

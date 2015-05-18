package simulator;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;
import javax.swing.Timer;

public class Canvas extends JPanel implements ActionListener{
	//Components
		Timer time = new Timer(5, this);
	 	double redX, redY, redVelX, redVelY, whiteX, whiteY, whiteVelX, whiteVelY, blueX, blueY, blueVelX, blueVelY;
	 	BufferedImage bi = new BufferedImage(5, 5, BufferedImage.TYPE_INT_RGB);
	 	
	 	public Canvas(int rX, int rY, int rVX, int rVY, int wX, int wY, int wVX, int wVY, int bX, int bY, int bVX, int bVY){
	 		
	 		redX = rX;
	 		redY = rY;
	 		redVelX = rVX;
	 		redVelY = rVY;
	 		blueX = bX;
	 		blueY = bY;
	 		blueVelX = bVX;
	 		blueVelY = bVY;
	 		whiteX = wX;
	 		whiteY = wY;
	 		whiteVelX = wVX;
	 		whiteVelY = wVY;
	 		
	 		time.start();
	 		setFocusable(true);
	 		setFocusTraversalKeysEnabled(false);
	 	}
	 	
	 	public void paintComponent(Graphics g){
	 		super.paintComponent(g);
	 		
	 		
	 		setBackground(Color.BLACK);
	 		g.setColor(Color.RED);
	 		Graphics2D red = (Graphics2D) g;
	 		Ellipse2D redcircle = new Ellipse2D.Double(redX, redY, 20, 20);
	 		red.fill(redcircle);
	 		
	 		g.setColor(Color.WHITE);
	 		Graphics2D white = (Graphics2D) g;
	 		Ellipse2D whitecircle = new Ellipse2D.Double(whiteX, whiteY, 20, 20);
	 		white.fill(whitecircle);
	 		
	 		g.setColor(Color.BLUE);
	 		Graphics2D blue = (Graphics2D) g;
	 		Ellipse2D bluecircle = new Ellipse2D.Double(blueX, blueY, 20, 20);
	 		blue.fill(bluecircle);
	 	}
	 	
	 	public void actionPerformed(ActionEvent e){
			if(redX < 0 || redX > 500){
				redVelX = - redVelX;
			}
			if(redY < 0 | redY > 500){
				redVelY = -redVelY;
			}
			if(whiteX < 0 | whiteX > 500){
				whiteVelX = -whiteVelX;
			}
			if(whiteY < 0 | whiteY > 500){
				whiteVelY = -whiteVelY;
			}
			if(blueY < 0 | blueY > 500){
				blueVelX = -blueVelX;
			}
			if(blueY < 0 | blueY > 500){
				blueVelY = -blueVelY;
			}
			redX += redVelX;
			redY += redVelY;
			whiteX += whiteVelX;
			whiteY += whiteVelY;
			blueX += blueVelX;
			blueY += blueVelY;
			repaint();
	 	}
	 	
	 	
	 	public void update(){}
}

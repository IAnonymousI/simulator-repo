import javax.swing.*;
import java.awt.*;

public class Run{
	public static void main(String[] args){
		JFrame frame = new JFrame("Prototype_3");
		Canvas p = new Canvas();
		StatusWindow2 status = new StatusWindow2();
		p.setBackground(Color.BLACK);
		frame.add(p);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setSize(600, 600);
		frame.getContentPane().setBackground(Color.BLACK);
	}
}
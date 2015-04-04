import javax.swing.*;
import java.awt.*;

public class Run{
	public static void main(String[] args){
		JFrame frame = new JFrame("Canvas");
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		frame.setResizable(false);
		frame.add(new Canvas());
	}
}
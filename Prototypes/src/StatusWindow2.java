import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class StatusWindow2 extends JFrame implements ActionListener{
	
	private JButton apply = new JButton("Apply");
	
	public StatusWindow2(){
		super("StatusWindow");
		
		//Default Window Settings
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 500);
		setVisible(true);
		
		
		add(apply);
	}
	
	public final void setDesign(){
		try{
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch(Exception e){
			
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e){
	}
} 
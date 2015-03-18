import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class StatusWindow2 extends JFrame implements ActionListener{
	
	//Components
	private final JLabel[] label = {new JLabel("Red Ball"), new JLabel("Blue Ball"), new JLabel("White Ball")};
	private final String[] status = {"Position", "Velocity", "Acceleration"};
	private final JLabel[] statusLabel = new JLabel[3];
	private final JButton applyButton = new JButton("Apply");
	
	public StatusWindow2(){
		
		super("Status Window");
		setLayout(new GridLayout(5, 5, 10, 10));
		
		for(int i = 0; i <= 2; i++){
			statusLabel[i] = new JLabel(status[i]);
		}
		
		add(new JLabel());
		
		for(int i = 0; i <= 2; i++){
			add(label[i]);
		}
		
		for(int i = 0; i <= 2; i++){
			add(statusLabel[i]);
			add(new JTextField());
			add(new JTextField());
			add(new JTextField());
		}
		
		for(int i = 0; i < 3; i++){
			add(new JLabel());
		}
		add(applyButton);
		
		applyButton.addActionListener((ActionListener) this);
		
		setVisible(true);
		setSize(400, 200);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void actionPerformed(ActionEvent event){
		
	}
}
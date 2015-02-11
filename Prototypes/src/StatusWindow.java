import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class StatusWindow extends JFrame implements ActionListener{
	
	//Components
	String ip;
	private JPanel[] row = new JPanel[2];
	private JButton button = new JButton("Enter");
	private JTextField input = new JTextField("Command here...");
	private JTextArea status = new JTextArea(400, 350);
	private JScrollPane scroll = new JScrollPane(status, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
	private Font font = new Font("Andale Mono", Font.PLAIN, 12);
	
	private Dimension statusDimension = new Dimension(400, 350);
	private Dimension inputDimension = new Dimension(300, 50);
	private Dimension buttonDimension = new Dimension(80, 50);
	
	public StatusWindow(){
		
		super("Status Window");
		
		//Variables
		GridLayout grid = new GridLayout(2, 2);
		FlowLayout f1 = new FlowLayout(FlowLayout.CENTER);
		FlowLayout f2 = new FlowLayout(FlowLayout.CENTER, 1, 1);
		
		
		for(int i = 0; i < 2; i++){
			row[i] = new JPanel();
		}
		
		row[0].setPreferredSize(new Dimension(400, 350));
		row[1].setPreferredSize(new Dimension(400, 50));
		
		//Default window settings
		setSize(600, 600);
		setResizable(false);
		setDesign();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setLayout(grid);
		
		row[0].setLayout(f1);
		row[1].setLayout(f2);
		status.setEditable(false);
		status.setBackground(Color.BLACK);
		input.setBackground(Color.BLACK);
		input.setForeground(Color.WHITE);
		input.setFont(font);
		status.setPreferredSize(statusDimension);
		input.setPreferredSize(inputDimension);
		button.setPreferredSize(buttonDimension);
		
		button.addActionListener(this);
		input.addActionListener(this);
		
		status.append("Hello");
		
		row[0].add(scroll);
		row[1].add(input);
		row[1].add(button);
		add(row[0]);
		add(row[1]);
		
	}
	
	public final void setDesign(){
		try{
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch(Exception e){
			
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e){
		
		if(e.getSource() == button){
			ip = "";
			ip = input.getText();
			//Commands
			if(ip.equalsIgnoreCase("test")){
				status.append("Test has been completed.\n");
			}
			else{
				status.append("Error: Command '" + ip + "' is not a valid command.\n");
			}
		}
		else if(e.getSource() == input){
			
		}
	}
} 
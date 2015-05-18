package simulator;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Input extends JFrame implements ActionListener{
	private final JLabel[] label = {new JLabel("Red Ball"), new JLabel("Blue Ball"), new JLabel("White Ball")};
	private final String[] status = {"Position(x y)", "Velocity(x y)"};
	private final JLabel[] statusLabel = new JLabel[2];
	private final JButton applyButton = new JButton("Apply");
	private final JTextField[] posTF = new JTextField[3];
	private final JTextField[] velTF = new JTextField[3];
	private final JFrame canvas = new JFrame("Canvas");
	
	
	public Input(){
		
		super("Input Window");
		
		canvas.setSize(500, 500);
		canvas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		canvas.setVisible(true);
		canvas.add(new Canvas(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0));
		
		setLayout(new GridLayout(5, 5, 10, 10));
		
		for(int i = 0; i <= 1; i++){
			statusLabel[i] = new JLabel(status[i]);
		}
		
		for(int i = 0; i <= 2; i++){
			posTF[i] = new JTextField("50 50");
			velTF[i] = new JTextField("0 0");
		}
		
		add(new JLabel());
		
		for(int i = 0; i <= 1; i++){
			add(statusLabel[i]);
		}
		
		for(int i = 0; i <= 2; i++){
			add(label[i]);
			add(posTF[i]);
			add(velTF[i]);
		}
		
		for(int i = 0; i < 2; i++){
			add(new JLabel());
		}
		add(applyButton);
		
		applyButton.addActionListener((ActionListener) this);
		
		setVisible(true);
		setSize(400, 200);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	

	
	public String[] getPos(){
		String[] pos = {posTF[0].getText(), posTF[1].getText(), posTF[2].getText()};
		return pos;
	}
	
	public String[] getVel(){
		String[] vel = {velTF[0].getText(), velTF[1].getText(), velTF[2].getText()};
		return vel;
	}
	
	public void update(){
		canvas.add(new Canvas(Integer.parseInt(getPos()[0].split(" ")[0]), Integer.parseInt(getPos()[0].split(" ")[1]), Integer.parseInt(getVel()[0].split(" ")[0]), Integer.parseInt(getVel()[0].split(" ")[1]), Integer.parseInt(getPos()[2].split(" ")[0]), Integer.parseInt(getPos()[2].split(" ")[1]), Integer.parseInt(getVel()[2].split(" ")[0]), Integer.parseInt(getVel()[2].split(" ")[1]), Integer.parseInt(getPos()[1].split(" ")[0]), Integer.parseInt(getPos()[1].split(" ")[1]), Integer.parseInt(getVel()[1].split(" ")[0]), Integer.parseInt(getVel()[1].split(" ")[1])));
	}
	
	public void actionPerformed(ActionEvent event){
		if(event.getSource() == applyButton){
			update();
		}
	}
}

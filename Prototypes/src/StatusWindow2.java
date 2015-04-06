import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class StatusWindow2 extends JFrame implements ActionListener{
	
	//Components
	private final JLabel[] label = {new JLabel("Red Ball"), new JLabel("Blue Ball"), new JLabel("White Ball")};
	private final String[] status = {"Position(x y)", "Velocity(x y)", "Acceleration(x y)"};
	private final JLabel[] statusLabel = new JLabel[3];
	private final JButton applyButton = new JButton("Apply");
	private final JTextField[] posTF = new JTextField[3];
	private final JTextField[] velTF = new JTextField[3];
	private final JTextField[] accTF = new JTextField[3];
	
	
	public StatusWindow2(){
		
		super("Status Window");
		new Canvas(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		setLayout(new GridLayout(5, 5, 10, 10));
		
		for(int i = 0; i <= 2; i++){
			statusLabel[i] = new JLabel(status[i]);
		}
		
		for(int i = 0; i <= 2; i++){
			posTF[i] = new JTextField("0 0");
			velTF[i] = new JTextField("0 0");
			accTF[i] = new JTextField("0 0");
		}
		
		add(new JLabel());
		
		for(int i = 0; i <= 2; i++){
			add(statusLabel[i]);
		}
		
		for(int i = 0; i <= 2; i++){
			add(label[i]);
			add(posTF[i]);
			add(velTF[i]);
			add(accTF[i]);
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
	

	
	public String[] getPos(){
		String[] pos = {posTF[0].getText(), posTF[1].getText(), posTF[2].getText()};
		return pos;
	}
	
	public String[] getVel(){
		String[] vel = {velTF[0].getText(), velTF[1].getText(), velTF[2].getText()};
		return vel;
	}
	
	public String[] getAcc(){
		String[] acc = {accTF[0].getText(), accTF[1].getText(), accTF[2].getText()};
		return acc;
	}
	
	public void actionPerformed(ActionEvent event){
		if(event.getSource() == applyButton){
			new Canvas(Integer.parseInt(getPos()[0].split(" ")[0]), Integer.parseInt(getPos()[0].split(" ")[1]), Integer.parseInt(getVel()[0].split(" ")[0]), Integer.parseInt(getVel()[0].split(" ")[1]), Integer.parseInt(getPos()[2].split(" ")[0]), Integer.parseInt(getPos()[2].split(" ")[1]), Integer.parseInt(getVel()[2].split(" ")[0]), Integer.parseInt(getVel()[2].split(" ")[1]), Integer.parseInt(getPos()[1].split(" ")[0]), Integer.parseInt(getPos()[1].split(" ")[1]), Integer.parseInt(getVel()[1].split(" ")[0]), Integer.parseInt(getVel()[1].split(" ")[1]));
			
		}
	}
}
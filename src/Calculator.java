import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Calculator extends JFrame {
	
	public JButton addButton;
	public JButton subtractButton;
	public JTextField firstNumber;
	public JTextField secondNumber;
	public JTextField answer;
	public JLabel answerLabel;
	
public Calculator(){
	this.setTitle("Calculator");
	this.setSize(new Dimension (250,160));
	this.setLocation(MouseInfo.getPointerInfo().getLocation());
	this.setLayout(new FlowLayout());
	this.setResizable(false);
	this.addComponentListener(new ComponentListener(){

		@Override
		public void componentResized(ComponentEvent arg0) {}
		public void componentMoved(ComponentEvent arg0) {}
		public void componentShown(ComponentEvent arg0) {
			Calculator_Load();
		}
		public void componentHidden(ComponentEvent arg0) {}
		
		
	});
	
	this.addButton = new JButton();
	this.addButton.setText("Add");
	this.addButton.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			addButton_ActionPerformed();
		}
	});
	
	this.subtractButton = new JButton();
	this.subtractButton.setText("Subtract");
	
	this.firstNumber = new JTextField();
	this.firstNumber.setText("                                                                            ");
	
	this.secondNumber = new JTextField();
	this.secondNumber.setText("                                                                            ");
	
	this.answer = new JTextField();
	this.answer.setText("                                                                            ");
	this.answer.setEditable(false);
	
	this.answerLabel = new JLabel();
	this.answerLabel.setText("Answer: ");
	
	add(addButton);
	add(subtractButton);
	add(firstNumber);
	add(secondNumber);
	add(answerLabel);
	add(answer);
	}
private void Calculator_Load(){
	firstNumber.setText("");
	secondNumber.setText("");
	answer.setText("");
	}

private void addButton_ActionPerformed(){
	try{
		int num1, num2;
		num1 = Integer.parseInt(firstNumber.getText());
		num2 = Integer.parseInt(secondNumber.getText());
		int answer2 = num1+num2;
		answer.setText(String.valueOf(answer2));
}catch(Exception ex){
	JOptionPane.showMessageDialog(null, "Invalid numbers");

}
}
}

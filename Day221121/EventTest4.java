package Day221121;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class SimCalc extends JFrame{
	JTextField txtV1, txtV2;
	JButton btnPlus, btnMinus, btnMul, btnDiv, btnRes, btnCls;
	
	public SimCalc() {
		this.setSize(400, 150);
		this.setLocation(1200, 50);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		txtV1 = new JTextField(5);
		txtV2 = new JTextField(5);
		btnPlus = new JButton("+");
		btnMinus = new JButton("-");
		btnMul = new JButton("*");
		btnDiv = new JButton("/");
		btnRes = new JButton("Calculate");
		btnRes.setEnabled(false);
		btnCls = new JButton("CE");
		
		btnPlus.addActionListener(e->{
			if(txtV1.getText().equals("") || txtV2.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Empty Value!");
			}else {
				JOptionPane.showMessageDialog(null, Integer.toString(Integer.parseInt(txtV1.getText()) + Integer.parseInt(txtV2.getText())));
			}
		});
		btnMinus.addActionListener(e->{
			if(txtV1.getText().equals("") || txtV2.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Empty Value!");
			}else {
				JOptionPane.showMessageDialog(null, Integer.toString(Integer.parseInt(txtV1.getText()) - Integer.parseInt(txtV2.getText())));
			}
		});
		btnMul.addActionListener(e->{
			if(txtV1.getText().equals("") || txtV2.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Empty Value!");
			}else {
				JOptionPane.showMessageDialog(null, Integer.toString(Integer.parseInt(txtV1.getText()) * Integer.parseInt(txtV2.getText())));
			}
		});
		btnDiv.addActionListener(e->{
			if(txtV1.getText().equals("") || txtV2.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Empty Value!");
			}else {
				JOptionPane.showMessageDialog(null, Integer.toString(Integer.parseInt(txtV1.getText()) / Integer.parseInt(txtV2.getText())));
			}
		});
		btnCls.addActionListener(e->{
			txtV1.setText("");
			txtV2.setText("");
		});
		btnRes.addActionListener(e->{
			
		});
		
		this.add(txtV1);
		this.add(txtV2);
		this.add(btnPlus);
		this.add(btnMinus);
		this.add(btnMul);
		this.add(btnDiv);
		this.add(btnRes);
		this.add(btnCls);
		this.setVisible(true);
	}
}

public class EventTest4 {
	public static void main(String[] args) {
		new SimCalc();
	}
}

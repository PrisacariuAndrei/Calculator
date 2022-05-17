import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;


class GUI{
	private JFrame gui;
	
	static double num1, num2, rez;
	String opr;

	public GUI(){
		gui = new JFrame("Calculator");
		
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gui.setSize(600, 750);
		
		initGUI();
		try {
			String className = UIManager.getSystemLookAndFeelClassName();
			UIManager.setLookAndFeel(className);
		} catch (Exception e) {
			e.printStackTrace();
		}

		SwingUtilities.updateComponentTreeUI(gui);
		
		
		gui.setVisible(true);
		

	}

	private void initGUI() {
		gui.getContentPane().setBackground(new Color(30, 80, 200));
		gui.setLayout(null);
		
		//B0
		JButton B0 = new JButton("0");
		gui.getContentPane().add(B0);
		B0.setBounds(185,555 , 100, 100);
		B0.setFont(new Font("Arial", 70, 70));
		
		//B1
		JButton B2 = new JButton("2");
		gui.getContentPane().add(B2);
		B2.setBounds(185,425 , 100, 100);
		B2.setFont(new Font("Arial", 70, 70));		
		
		//B5
		JButton B5 = new JButton("5");
		gui.getContentPane().add(B5);
		B5.setBounds(185,295 , 100, 100);
		B5.setFont(new Font("Arial", 70, 70));	
		
		//B8
		JButton B8 = new JButton("8");
		gui.getContentPane().add(B8);
		B8.setBounds(185,165 , 100, 100);
		B8.setFont(new Font("Arial", 70, 70));
		
		//B
		JButton B1 = new JButton("1");
		gui.getContentPane().add(B1);
		B1.setBounds(55,425 , 100, 100);
		B1.setFont(new Font("Arial", 70, 70));		
		
		//B4
		JButton B4 = new JButton("4");
		gui.getContentPane().add(B4);
		B4.setBounds(55,295 , 100, 100);
		B4.setFont(new Font("Arial", 70, 70));	
		
		//B7
		JButton B7 = new JButton("7");
		gui.getContentPane().add(B7);
		B7.setBounds(55,165 , 100, 100);
		B7.setFont(new Font("Arial", 70, 70));
		
		//B9
		JButton B9 = new JButton("9");
		gui.getContentPane().add(B9);
		B9.setBounds(315,425 , 100, 100);
		B9.setFont(new Font("Arial", 70, 70));		
		
		//B6
		JButton B6 = new JButton("6");
		gui.getContentPane().add(B6);
		B6.setBounds(315,295 , 100, 100);
		B6.setFont(new Font("Arial", 70, 70));	
		
		//B3
		JButton B3 = new JButton("3");
		gui.getContentPane().add(B3);
		B3.setBounds(315,165 , 100, 100);
		B3.setFont(new Font("Arial", 70, 70));
		
		///////////
		
		//Bim
		JButton Bim = new JButton("/");
		gui.getContentPane().add(Bim);
		Bim.setBounds(445,555 , 100, 100);
		Bim.setFont(new Font("Arial", 70, 70));
		
		//Bin
		JButton Bin = new JButton("*");
		gui.getContentPane().add(Bin);
		Bin.setBounds(445,425 , 100, 100);
		Bin.setFont(new Font("Arial", 70, 70));		
		
		//Bsc
		JButton Bsc = new JButton("-");
		gui.getContentPane().add(Bsc);
		Bsc.setBounds(445,295 , 100, 100);
		Bsc.setFont(new Font("Arial", 70, 70));	
		
		//Bad
		JButton Bad = new JButton("+");
		gui.getContentPane().add(Bad);
		Bad.setBounds(445,165 , 100, 100);
		Bad.setFont(new Font("Arial", 70, 70));
		
		//Beg
		JButton Beg = new JButton("=");
		gui.getContentPane().add(Beg);
		Beg.setBounds(315,555 , 100, 100);
		Beg.setFont(new Font("Arial", 70, 70));
		
		//Bpc
		JButton Bpc = new JButton(".");
		gui.getContentPane().add(Bpc);
		Bpc.setBounds(55,555 , 100, 100);
		Bpc.setFont(new Font("Arial", 70, 70));
		
		///////////
		
		JTextArea z1 = new JTextArea();
		gui.add(z1);
		z1.setBounds(55, 15, 490, 130);
		z1.setFont(new Font("Arial", 70 , 70));
		
		z1.setEditable(false);		
			
		
		///////////Action Listener//////////
		
		B0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				z1.setText(z1.getText() + "0");	
			}});
		
		B1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				z1.setText(z1.getText() + "1");	
			}});
		
		B2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				z1.setText(z1.getText() + "2");	
			}});
		
		B3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				z1.setText(z1.getText() + "3");	
			}});
		
		B4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				z1.setText(z1.getText() + "4");	
			}});
		B5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				z1.setText(z1.getText() + "5");	
			}});
		
		B6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				z1.setText(z1.getText() + "6");	
			}});
		
		B7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				z1.setText(z1.getText() + "7");	
			}});
		
		B8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				z1.setText(z1.getText() + "8");	
			}});
		
		B9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				z1.setText(z1.getText() + "9");	
			}});
		
		Bpc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				z1.setText(z1.getText() + ".");	
			}});
	
		/////////////////////
		
		
		Bad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(z1.getText());
				z1.setText("");	
				opr = "+";	
			}});
		
		Bsc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(z1.getText());
				z1.setText("");	
				opr = "-";	
			}});
		
		Bin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(z1.getText());
				z1.setText("");	
				opr = "*";	
			}});
		
		Bim.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(z1.getText());
				z1.setText("");	
				opr = "/";	
			}});
		
		Beg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num2 = Double.parseDouble(z1.getText());
				
				if (opr == "+")
				{
					rez = num1 + num2;
					z1.setText(Double.toString(rez));
				}
				else if (opr == "-")
				{
					rez = num1 - num2;
					z1.setText(Double.toString(rez));
				}
				else if (opr == "*")
				{
					rez = num1 *num2;
					z1.setText(Double.toString(rez));
				}
				else if (opr == "/" && num2 != 0 )
				{
					rez = num1 / num2;
					z1.setText(Double.toString(rez));
				}	
			}});
		
		
	}
}

public class Calculator {

	public static void main(String[] args) {
		new GUI();

	}

}

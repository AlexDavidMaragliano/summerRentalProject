//Alex Maragliano
//Project 6
//Summer Rentals Business

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JTextField;
import java.awt.Color;

import javax.swing.*;

public class SummerRental extends JFrame implements ActionListener {
	
	FlowLayout flow = new FlowLayout();
	JLabel label = new JLabel("Choose your preferred method of floating" + "");
	JCheckBox kayak = new JCheckBox("KAYAK", false);
	JCheckBox rowboat = new JCheckBox("ROWBOAT", false);
	JCheckBox paddleboat = new JCheckBox("PADDLEBOAT", false);
	JCheckBox surfboard = new JCheckBox("SURFBOARD", false);
	JCheckBox waterbike = new JCheckBox("WATERBIKE", false);
	ButtonGroup myButton = new ButtonGroup();
	
	public SummerRental(){
		setLayout(new FlowLayout());
		label.setFont(new Font("Ariel", Font.ITALIC, 24));
		add(label);
		
		add(kayak);
		add(rowboat);
		add(paddleboat); 
		add(surfboard);
		add(waterbike);
		
		myButton.add(kayak);
		myButton.add(rowboat);
		myButton.add(paddleboat);
		myButton.add(surfboard);
		myButton.add(waterbike);
		
		kayak.addActionListener(this);
		rowboat.addActionListener(this);
		paddleboat.addActionListener(this);
		surfboard.addActionListener(this);
		waterbike.addActionListener(this);
		
		
	}
	
	public void actionPerformed(ActionEvent event){
		
		if(kayak.isSelected()) {
			int kRent = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the number of kayaks you would like to rent:"));
			double kayakPrice=10.99;
			Scanner kayakIn = new Scanner(System.in);
			double kayakTotal = kayakPrice * kRent;
			JOptionPane.showMessageDialog(null, "Total to rent " + kRent + " kayaks is $" + String.format("%.2f", kayakTotal));
		}
		
		if(rowboat.isSelected()) {
			int rbRent = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the number of rowboats you would like to rent:"));
			double rowboatPrice=5.49;
			Scanner rowboatIn = new Scanner(System.in);
			double rowboatTotal = rowboatPrice * rbRent;
			JOptionPane.showMessageDialog(null, "Total to rent " + rbRent + " rowboats is $" + String.format("%.2f", rowboatTotal));
					
		}
		
		if(paddleboat.isSelected()) {
			int pbRent = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the number of paddleboats you would like to rent:"));
			double paddleboatPrice=6.99;
			Scanner paddleboatIn = new Scanner(System.in);
			double paddleboatTotal = paddleboatPrice * pbRent;
			JOptionPane.showMessageDialog(null, "Total to rent " + pbRent + " rowboats is $" + String.format("%.2f", paddleboatTotal));
		}
		
		if(surfboard.isSelected()) {
			int sbRent = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the number of surfboards you would like to rent:"));
			double surfboardPrice=24.99;
			Scanner surfboardIn = new Scanner(System.in);
			double surfboardTotal = surfboardPrice * sbRent;
			JOptionPane.showMessageDialog(null, "Total to rent " + sbRent + " rowboats is $" + String.format("%.2f", surfboardTotal));
		}
		
		if(waterbike.isSelected()) {
			int wbRent = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the number of waterbikes you would like to rent:"));
			double waterbikePrice=125.59;
			Scanner waterbikeIn = new Scanner(System.in);
			double waterbikeTotal = waterbikePrice * wbRent;
			JOptionPane.showMessageDialog(null, "Total to rent " + wbRent + " rowboats is $" + String.format("%.2f", waterbikeTotal));
		}
		
	} //closes public void actionPerformed
	
	public static void main(String[] args) {
		
		
		SummerRental Frame = new SummerRental();
		Frame.setTitle("Summer Boat Rental");
		Frame.setSize(500, 500);
		Frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		Frame.pack();
		Frame.setVisible(true);
		


	} //closes public static void main
} //closes public class Drinks extends JFrame implements ActionListener 
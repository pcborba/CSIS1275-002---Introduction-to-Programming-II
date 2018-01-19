package com.borba;
import java.text.NumberFormat;

import javax.swing.JOptionPane;

public class PanelMain {

	public static void main(String[] args)
	{
		String custName = JOptionPane.showInputDialog("Please enter your name");
		float hrsRent = Float.parseFloat(JOptionPane.showInputDialog("How many hours do you want to rent?"));
		String bikeType = JOptionPane.showInputDialog(null, "1: Moutain, 2:7-speed, 3:Tandem Bike", "Select a bike type");
		int insurance = JOptionPane.showConfirmDialog(null, "Insurance needed?");
		int gps = JOptionPane.showConfirmDialog(null, "Bike GPS needed?");
		
		
		//System.out.println("This is the number " +num1);
		System.out.println("");
		
		
		
	}

}

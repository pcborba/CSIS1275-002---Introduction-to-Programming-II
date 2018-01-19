import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;   // Needed for Swing classes
/* Assignment 4 java 
* Group members:
* Yunjie Gao		Student ID : 300267900
* Ngoc Tuan Nguyen	Student ID : 300265666
* PAULO CESAR BORBA Student ID: 300268640
* Lambert's Vacation Rentals
* */

public class JVacationRental {
	// panel
	int costLocation =0;
	int costBedroom = 0;
	int costMeal =0;
	//-----------------------------
	// label
	JLabel lblCalc = null;
	public JVacationRental()
	{
		final int WINDOW_WIDTH = 550;   // Window width in pixels
		final int WINDOW_HEIGHT = 250;  // Window height in pixels
	  
		 // Create a window.
		  JFrame window = new JFrame();
		  
		  // Set the title.
		  window.setTitle("Lambert's Vacation Rentals");
		
		  // Set the size of the window.
		  window.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		
		  // Specify what happens when the close button is clicked.
		  window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		  
		  window.setLayout(new GridLayout(5,1));
			
		JPanel panel = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		
		// buttons locations
		JRadioButton rdparkside = new JRadioButton("Park Side");
		JRadioButton rdpoolside = new JRadioButton("Pool Side");
		JRadioButton rdlakeside = new JRadioButton("Lake Side");
		ButtonGroup grpLocation = new ButtonGroup();
		
		grpLocation.add(rdparkside);
		grpLocation.add(rdpoolside);
		grpLocation.add(rdlakeside);
		
		// buttons bedrooms
		JRadioButton rdonebed = new JRadioButton("One Bedroom");
		JRadioButton rdtwobed = new JRadioButton("Two Bedroom");
		JRadioButton rdthreebed = new JRadioButton("Three Bedroom");
		ButtonGroup grpBedroom = new ButtonGroup();
		
		grpBedroom.add(rdonebed);
		grpBedroom.add(rdtwobed);
		grpBedroom.add(rdthreebed);
		// buttons meals added
		JRadioButton rdnomeal = new JRadioButton("No meal",true);
		JRadioButton rdaddedmeal = new JRadioButton("Added meal");
		ButtonGroup grpMeal = new ButtonGroup();
		
		grpMeal.add(rdnomeal);
		grpMeal.add(rdaddedmeal);
		// label
		lblCalc = new JLabel("Total Cost: ");
		//===========================
		panel.add(rdparkside);
		panel.add(rdpoolside);
		panel.add(rdlakeside);
		
		panel2.add(rdonebed);
		panel2.add(rdtwobed);
		panel2.add(rdthreebed);
		
		panel3.add(rdnomeal);
		panel3.add(rdaddedmeal);
		
		window.add(panel);
		window.add(panel2);
		window.add(panel3);
		window.add(lblCalc);
		
		// Display the window.
		window.setVisible(true);
		// events handlers
		
		rdparkside.addActionListener(new ActionListener(){
		      @Override public void actionPerformed(ActionEvent e) {
		    	  costLocation = 600;
		    	  calcTotalCost();
		        }
		      });
		rdpoolside.addActionListener(new ActionListener(){
		      @Override public void actionPerformed(ActionEvent e) {
		    	  costLocation = 750;
		    	  calcTotalCost();
		        }
		      });
		rdlakeside.addActionListener(new ActionListener(){
		      @Override public void actionPerformed(ActionEvent e) {
		    	  costLocation = 825;
		    	  calcTotalCost();
		        }
		      });
		
		
		rdonebed.addActionListener(new ActionListener(){
		      @Override public void actionPerformed(ActionEvent e) {
		    	  costBedroom = 0;
		    	  calcTotalCost();
		        }
		      });
		rdtwobed.addActionListener(new ActionListener(){
		      @Override public void actionPerformed(ActionEvent e) {
		    	  costBedroom = 75;
		    	  calcTotalCost();
		        }
		      });
		rdthreebed.addActionListener(new ActionListener(){
		      @Override public void actionPerformed(ActionEvent e) {
		    	  costBedroom = 75*2;
		    	  calcTotalCost();
		        }
		      });
		
		rdnomeal.addActionListener(new ActionListener(){
		      @Override public void actionPerformed(ActionEvent e) {
		    	  costMeal = 0;
		    	  calcTotalCost();
		        }
		      });
		rdaddedmeal.addActionListener(new ActionListener(){
		      @Override public void actionPerformed(ActionEvent e) {
		    	  costMeal = 200;
		    	  calcTotalCost();
		        }
		      });
	}
	
	
	public void calcTotalCost()
	{
		int total = costBedroom+ costLocation +costMeal;
		lblCalc.setText("Total Cost: $" + total);
	}
	
	

	
	 public static void main(String[] args)
	   {
	     

	     JVacationRental obj = new JVacationRental();
	           
	      
	      
	   }
}



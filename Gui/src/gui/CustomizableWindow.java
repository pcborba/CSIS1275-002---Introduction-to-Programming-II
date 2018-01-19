package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class CustomizableWindow extends JFrame{

	private int WINDOW_WIDTH = 500;
	private int WINDOW_HEIGHT = 600;
	
	private JPanel northPanel;
	private JPanel southPanel;
	private JPanel centerPan;
	private JPanel westPanel;
	//private JPanel window;
	
	
	private JLabel topLabel;
	private JLabel widthLabel;
	private JLabel heightLabel;
	
	private JButton customBtn;
	
	private JRadioButton nochangeRad;
	private JRadioButton whiteRad;
	private JRadioButton blueRad;
	private JRadioButton pinkRad;
	private ButtonGroup group;
	
	private JTextField widthTxtBx;
	private JTextField heightTxtBx;
	
	private int heightConvert;
	private int widthConvert;
	
	/*
The north region of the  window contains a panel containing a message with this title: "This window can be customized by the user. Set your settings:". This message is left-aligned.  (1 point) 
The west region of the window contains a panel containing  four radio buttons labeled by "No Change", "White", "Blue", and "Pink" to select the background color of the all regions of the window (i.e. the whole window). These radio buttons are positioned vertically.  (3 points)
The center region of the window  contains a panel containing two labels, "Width" ad "Height", followed y two text fields to receive the respective dimensions of the window. Label-textfield pairs are positioned vertically.  The text fields are initialized by 500 ad 600, respectively. (3.5 points)
The south region  of the window contains a panel containing only a button which is aligned in the center, and captioned by "Customize!".  (1 point
	 */
	
	//creates north panel
	public void northBuild()
	{
		northPanel = new JPanel();
		topLabel = new JLabel("This window can be customized by the user. Set your settings:");
		
		northPanel.add(topLabel);
		northPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
	}
	
	//creates the south panel
	public void southBuild()
	{
		southPanel = new JPanel();
		customBtn = new JButton("Customize");
		
		customBtn.addActionListener(new customListener());
		
		southPanel.add(customBtn);
	}
	
	//creates the west panel
	public void westBuild()
	{
		
		westPanel = new JPanel();
		group = new ButtonGroup();
		
		pinkRad = new JRadioButton("Pink");
		nochangeRad = new JRadioButton("No change");
		blueRad = new JRadioButton("Blue");
		whiteRad = new JRadioButton("white");
		
		group.add(nochangeRad);
		group.add(pinkRad);
		group.add(blueRad);
		group.add(whiteRad);
		
		westPanel.setLayout(new GridLayout(4,1));
		
		westPanel.add(nochangeRad);
		westPanel.add(pinkRad);
		westPanel.add(blueRad);
		westPanel.add(whiteRad);
	}
	
	//creates the center panel
	public void centerBuild()
	{
		
		centerPan = new JPanel();
		
		widthTxtBx = new JTextField(5);
		heightTxtBx = new JTextField(5);
		
		heightTxtBx.setText("600");
		widthTxtBx.setText("500");
		
		widthLabel = new JLabel("Width");
		heightLabel = new JLabel("Height");
		
		centerPan.setLayout(new GridLayout(4,1));
		
		centerPan.add(widthLabel);
		centerPan.add(widthTxtBx);
		centerPan.add(heightLabel);
		centerPan.add(heightTxtBx);
	}
	
	public CustomizableWindow()
	{
		
		//window = new JPanel();
		
		centerBuild();
		northBuild();
		westBuild();
		southBuild();
		
		setTitle("Customizable Window");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setLayout(new BorderLayout());
		
		add(centerPan, BorderLayout.CENTER);
		add(southPanel, BorderLayout.SOUTH);
		add(northPanel, BorderLayout.NORTH);
		add(westPanel, BorderLayout.WEST);
		
		setVisible(true);
		
	}
	
	//part one
	
	//part two
	private class customListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e) {
			
			if(e.getSource() == customBtn)
			{
				if(nochangeRad.isSelected())
				{
					//centerPan.setBackground(Color.LIGHT_GRAY);
					//northPanel.setBackground(Color.LIGHT_GRAY);
					//southPanel.setBackground(Color.LIGHT_GRAY);
					//westPanel.setBackground(Color.LIGHT_GRAY);
				}
				else if(pinkRad.isSelected())
				{
					centerPan.setBackground(Color.PINK);
					northPanel.setBackground(Color.PINK);
					southPanel.setBackground(Color.PINK);
					westPanel.setBackground(Color.PINK);
				}
				else if(blueRad.isSelected())
				{
					centerPan.setBackground(Color.BLUE);
					northPanel.setBackground(Color.BLUE);
					southPanel.setBackground(Color.BLUE);
					westPanel.setBackground(Color.BLUE);
				}
				else if(whiteRad.isSelected())
				{
					centerPan.setBackground(Color.WHITE);
					northPanel.setBackground(Color.WHITE);
					southPanel.setBackground(Color.WHITE);
					westPanel.setBackground(Color.WHITE);
				}
				
				//catching the error
				try{
				if(heightTxtBx.getText() != "")
				{
					heightConvert = Integer.parseInt(heightTxtBx.getText());
					WINDOW_HEIGHT = heightConvert;
				}
				else
				heightConvert = WINDOW_HEIGHT;
				
				if(widthTxtBx.getText() != "")
				{
				widthConvert = Integer.parseInt(widthTxtBx.getText());
				WINDOW_WIDTH = widthConvert;
				}
				else
				widthConvert = WINDOW_WIDTH;	
				
				
				setSize(widthConvert, heightConvert);
				
				}
				catch(NumberFormatException ex)
				{
					JOptionPane.showMessageDialog(null, "you must input numbers (integers)");
				}
			}
			
		}
		
	}
	
	public static void main(String[] args)
	{
		new CustomizableWindow();
	}
	
}


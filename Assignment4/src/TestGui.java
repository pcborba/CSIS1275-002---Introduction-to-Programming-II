import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class TestGui extends JFrame {

	private final int WIN_WIDTH = 600, WIN_HEIGHT = 200;
	
	private JLabel lblTest;
	private JTextField txtTest;
	private JPanel panSouth;
	private JPanel panNorth;
	private JPanel panEast;
	private JPanel panWest;
	private JButton btnPress;
	private JButton btnRed;
	private JButton btnBlue;
	private JRadioButton btn50;
	private JRadioButton btn30;
	private ButtonGroup grpBtn;
	private int total = 0;
	
	public TestGui()
	{
		PanelSouth();
		PanelNorth();
		PanelEast();
		PanelWest();
		
		setLayout(new BorderLayout());
		setTitle("This is a test of form using GUI in JAVA");
		
		add(panSouth, BorderLayout.SOUTH);
		add(panNorth, BorderLayout.NORTH);
		add(panEast, BorderLayout.EAST);
		add(panWest);
		
		setSize(WIN_WIDTH, WIN_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	
	public void PanelSouth()
	{
		panSouth = new JPanel();
		
		btnPress = new JButton("Press here");
		
		panSouth.add(btnPress);
		
		panSouth.setLayout(new FlowLayout(FlowLayout.RIGHT) );
		
		panSouth.setBackground(Color.CYAN);
		
		btnPress.addActionListener(new CustomListener());
		
		
		//panSouth.setLayout(FlowLayout.CENTER);
		
	}
	
	public void PanelNorth()
	{
		panNorth = new JPanel();
		btnRed = new JButton("Red color");
		btnBlue = new JButton("Blue Color");
		
		
		panNorth.setLayout(new GridLayout(3,1));
		
		
		panNorth.add(btnRed, BorderLayout.WEST);
		panNorth.add(btnBlue, BorderLayout.EAST);
		
		btnRed.addActionListener(new CustomListener());
		btnBlue.addActionListener(new CustomListener());
		
		
	}
	
	public void PanelEast()
	{
		panEast = new JPanel();
		btn30 = new JRadioButton("30 cad");
		btn50 = new JRadioButton("50 cad");
		grpBtn = new ButtonGroup();
		lblTest = new JLabel("This Form is just a test");
		
		grpBtn.add(btn30);
		grpBtn.add(btn50);
		
		
		panEast.add(lblTest, new FlowLayout(FlowLayout.CENTER));
		panEast.add(btn30, new FlowLayout(FlowLayout.RIGHT));
		panEast.add(btn50, new FlowLayout(FlowLayout.CENTER));
		
		btn50.addActionListener(new CustomListener());
		btn30.addActionListener(new CustomListener());
		panEast.setBackground(Color.YELLOW);
		
	}
	
	public void PanelWest()
	{
		panWest = new JPanel();
		txtTest = new JTextField("Type a value here to improve your balance");
		
		panWest.add(txtTest);
		
	}
	
	
	private class CustomListener implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			if(e.getSource()==btnRed)
			{
				panEast.setBackground(Color.RED);
				lblTest.setForeground(Color.BLUE);
			}
			if(e.getSource()==btnBlue)
			{
				panEast.setBackground(Color.BLUE);
				lblTest.setForeground(Color.WHITE);
			}
			
			if(e.getSource()==btn50)
			{
				total += 50;
				JOptionPane.showMessageDialog(null, "Your balance is " +total);
			}
			
			if(e.getSource()==btn30)
			{
				total += 30;
				JOptionPane.showMessageDialog(null, "Your balance is " + total);
			}
			
			if(e.getSource()==btnPress)
			{
				lblTest.setText("Changing the text 1000  !!!!");
			}
			
			try
			{
				if(txtTest.getText()!="")
				{
					total += Integer.parseInt(txtTest.getText());
					JOptionPane.showMessageDialog(null, "Your balance is " + total);
					
				}
			}
			catch(NumberFormatException ex)
			{
				JOptionPane.showMessageDialog(null, "Please insert a number");
			}
		}
		
	}
	
	
	
	public static void main(String[] args)
	{
		new TestGui();
	}
	
	
}

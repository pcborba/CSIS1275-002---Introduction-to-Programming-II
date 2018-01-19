package Asgn4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import net.miginfocom.swing.MigLayout;
import javax.swing.ScrollPaneConstants;

public class Asgn4 extends JFrame{

	private JPanel contentPane;
	private JTextField txtUserName;
	private JButton btnSubmit;
	String userName ="";
	int score;
	ArrayList<String> contentQuiz = new ArrayList<String>();
	JLabel [] questions = new JLabel[5];
	JRadioButton [] answers = new JRadioButton[25];
	ButtonGroup[] groupAns = new ButtonGroup[5];
	String notAnswered ="";
	String [] answerRight= new String[5];
	int countAnswer=0;
	private JPanel panel;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					Asgn4 frame = new Asgn4();
					frame.setVisible(true);
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}
	
	public void setupComponents()
	{
		setTitle("Astrology Quiz");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 612, 698);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblName = new JLabel("Name:");
		
		txtUserName = new JTextField();
		txtUserName.setColumns(10);
		
		btnSubmit = new JButton("Submit");
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		JButton btnNewButton22 = new JButton("New button");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 576, Short.MAX_VALUE)
						.addComponent(btnSubmit, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 576, Short.MAX_VALUE))
					.addContainerGap())
				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
					.addComponent(lblName)
					.addGap(4)
					.addComponent(txtUserName, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 180, Short.MAX_VALUE)
					.addComponent(btnNewButton22)
					.addGap(144))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(3)
							.addComponent(lblName))
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(txtUserName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(btnNewButton22)))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 589, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnSubmit))
		);
		
		panel = new JPanel();
		scrollPane.setViewportView(panel);
		panel.setLayout(new MigLayout("", "[]", "[]"));
		contentPane.setLayout(gl_contentPane);
		
		try
		{

			File inFile = new File("AstrologyQuiz.txt");
			Scanner fileRead = new Scanner(inFile);
			String line="";
			while(fileRead.hasNextLine())
			{
				
				line = fileRead.nextLine();
				String newLine = "";
				
				for (int i = 0; i < line.length(); i++)
				{
			        if (line.charAt(i) != '*')
			        {  
			            newLine += line.charAt(i);
			        }
			        else
			        {
			            answerRight[countAnswer]=line;
			            countAnswer++;
			        }
			    }
				if(newLine ==""){
					contentQuiz.add(line);		
				}
				else
				{
					contentQuiz.add(newLine);	
				}
			}
		}
		catch(IOException ex)
		{
			JOptionPane.showMessageDialog(null, ex.getMessage());
		}

		int count=0;
		for (int i = 0;i<contentQuiz.size();i++)
		{
				if(i%5==0){
					questions[count] = new JLabel();
					questions[count].setText(contentQuiz.get(i));
					panel.add(questions[count], "cell 0 "+String.valueOf(i));
					groupAns[count] = new ButtonGroup();
					count++;
				}
				else
				{
					answers[i] = new JRadioButton();
					answers[i].setText(contentQuiz.get(i));
					answers[i].setActionCommand(contentQuiz.get(i));
					panel.add(answers[i], "cell 0 "+String.valueOf(i));
					groupAns[count-1].add(answers[i]);
				}
		}
	}

	public void createEvents()
	{
		btnSubmit.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				userName = txtUserName.getText();
				notAnswered ="";
				score=0;
				for(int i = 0; i<groupAns.length;i++)
				{
					if(groupAns[i].getSelection()==null)
					{
						notAnswered += String.valueOf(i+1)+" - ";						
					}
					else
					{
						if (groupAns[i].getSelection().getActionCommand().equals(answerRight[i].substring(1)))
						{
							score++;	
						}
					}
				}
				if(notAnswered!="")
				{
					JOptionPane.showMessageDialog(null, "Please select the answer for question(s) "+notAnswered.substring(0, notAnswered.length()-2));
				}else
				{
					JOptionPane.showMessageDialog(null, "Hi "+userName+ "! Your score is "+score);	
				}
			}
		});
	}

	
	/**
	 * Create the frame.
	 */
	public Asgn4() 
	{
		setupComponents();
		createEvents();
	}
}

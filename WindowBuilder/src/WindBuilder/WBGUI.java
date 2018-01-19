package WindBuilder;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.AbstractButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WBGUI extends JFrame {

	private JPanel ctpMain;
	private JTextField txtFirstName;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WBGUI frame = new WBGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	
	/**
	 * Create the frame.
	 */
	public WBGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		ctpMain = new JPanel();
		ctpMain.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(ctpMain);
		
		JLabel lblNewLabel = new JLabel("First Name");
		
		txtFirstName = new JTextField();
		txtFirstName.setColumns(10);
		
		JButton btnShowMsg = new JButton("Show message");
		btnShowMsg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Hello "+txtFirstName.getText()+" !");
			}
		});

		
		GroupLayout gl_ctpMain = new GroupLayout(ctpMain);
		gl_ctpMain.setHorizontalGroup(
			gl_ctpMain.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_ctpMain.createSequentialGroup()
					.addGap(36)
					.addComponent(lblNewLabel)
					.addGap(18)
					.addComponent(txtFirstName, GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
					.addGap(28)
					.addComponent(btnShowMsg)
					.addGap(48))
		);
		gl_ctpMain.setVerticalGroup(
			gl_ctpMain.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_ctpMain.createSequentialGroup()
					.addGap(24)
					.addGroup(gl_ctpMain.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(txtFirstName)
						.addComponent(btnShowMsg))
					.addGap(207))
		);
		ctpMain.setLayout(gl_ctpMain);
	}
}

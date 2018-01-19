import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import java.util.Scanner;

public class Swing1 {

	public static void main(String[] args) 
	{
		/*JFrame form1 = new JFrame("Form 1");
		form1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		form1.setSize(500, 300);
		form1.setVisible(true);
		
		//solicitar a primeira parcela
		String prim_parc = JOptionPane.showInputDialog("Por favor insira a primeira parcela");
		String seg_parc = JOptionPane.showInputDialog("Por favor insira a segunda parcela");
		int result = Integer.parseInt(prim_parc)+Integer.parseInt(seg_parc);
		JOptionPane.showMessageDialog(null,"O resultado final é "+result, "Resultado", JOptionPane.INFORMATION_MESSAGE);*/
		
		JFrame janela = new JFrame();
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setSize(500, 250);
		janela.setTitle("Janela criada pela segunda vez");
		
		JLabel lbl1 = new JLabel("este é o texto da primeira label");
		lbl1.setHorizontalAlignment(JLabel.CENTER);
		lbl1.setVerticalAlignment(JLabel.CENTER);
		JLabel lbl2 = new JLabel("este é o texto da segunda label");
		
		janela.add(lbl1);
		janela.add(lbl2);
		
		janela.setVisible(true);
		
		String nome = "Paulo";
		String invertName ="";
		
		for (int i = nome.length()-1; i >= 0; i--)
		{
			char a = nome.charAt(i);
			invertName += a;
		}
		
		final int MAX_STRING_LENGTH = 20;
		
		
		String inputString;
		
		System.out.println("Enter your input string");
		
		// Use the Scanner class to insert code for reading a string from the keyboard, and
		Scanner kbd = new Scanner(System.in);
		
		// store it in the inputString
		inputString = kbd.nextLine();
		
		
		char[] reverseString = new char[MAX_STRING_LENGTH];
		
		// Write code to store the inputString characters into the reverseString array in
		// reverse order
		int sizeInput = inputString.length();
		
		for (int i = 0; i < sizeInput; i--)
		{
			reverseString[i] = inputString.charAt(sizeInput-1);
		}
				
		// Insert code to print the content of the reverseString array on the console
		String toPrint = "";
		for (int i = 0; i < reverseString.length; i++)
		{
			toPrint += reverseString[i];
			System.out.println(toPrint);
		}
		
		System.out.println(toPrint);
		
		System.out.println(invertName);
				
		if (nome == "Paulo")
		{
			System.out.println("Verdade");
		}
		else
		{
			System.out.println("Falso");
		}
		
		System.out.println(nome=="Paulo"?"True":"False");

		
	}

}

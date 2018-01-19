import java.util.Scanner;
import java.io.*;
public class Arq_MundoPrograma
{

	public static void main(String[] args)
	{
		String fileName; 
		Scanner kbd = new Scanner(System.in);
		fileName = kbd.nextLine();
		
		System.out.println("Por favor digite o nome do arquivo");
		File file = new File(fileName + ".txt");

	}

}

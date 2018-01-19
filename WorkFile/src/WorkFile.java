import java.util.Scanner;
import java.io.*;

public class WorkFile {
	
	public static void main (String[] args) throws IOException
	{
		int friends;
		String friendName;
		String fileName;
		
		Scanner kbd = new Scanner(System.in);
		System.out.print("Quantos amigos você tem?");
		friends = kbd.nextInt();
		
		kbd.nextLine();
		
		System.out.print("Entre com o nome do arquivo.");
		fileName= kbd.nextLine();
		
		PrintWriter nf = new PrintWriter(fileName+".txt");
		
		for (int i = 1; i <= friends; i++)
		{
			System.out.print("Entre com o nome do seu amigo número " + i +":" );
			friendName = kbd.nextLine();
			nf.println(friendName);
		}
		
		nf.close();
		System.out.println("Dados gravados no arquivo");
	}

}

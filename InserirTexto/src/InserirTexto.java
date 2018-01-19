import java.io.*;

public class InserirTexto {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		try
		{
			BufferedWriter wr = new BufferedWriter(new FileWriter("texto.txt", true));
			wr.write("Primeira frase.");
			wr.newLine();
			wr.close();
		}
		catch(Exception e)
		{
			System.out.println("Deu um erro");
		}
		

	}

}

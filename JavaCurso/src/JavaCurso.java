import java.util.Scanner;

public class JavaCurso 
{

	public static void main(String[] args) 
	{
		Scanner kbd = new Scanner(System.in);
		//System.out.println("Digite o nome do aluno");
		//String nome = kbd.nextLine();
		//System.out.println("Digite a nota do aluno");
		//Float nota = kbd.nextFloat();
		
		//System.out.printf("A nota de %s é %20.1f :", nome, nota);
		
		//int idade = 30;
		//String valor = Integer.toString(idade);
		
		//String valor = "30.5";
		//float idade = Float.parseFloat(valor);
		
		//System.out.println(idade);
		
		
		System.out.printf("Type a number to convert to Binary, Hex and Octal:");
		int num = kbd.nextInt();
		System.out.println(Integer.toBinaryString(num));
		System.out.println(Integer.toHexString(num));
		System.out.println(Integer.toOctalString(num));
	}

}

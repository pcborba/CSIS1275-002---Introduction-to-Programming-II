package sys4soft;

import java.util.Scanner;
import java.
public class TerceiroProjeto
{

	public static void main(String[] args) 
	{
		int parc1, parc2, result;
		
		
		System.out.println("Adicionar duas parcelas.");
		
		
		Scanner kbd = new Scanner(System.in);
		
		System.out.println("Insira a prim parcela.");
		parc1 = kbd.nextInt();
		
		System.out.println("Insira a segunda parcela.");
		parc2 = kbd.nextInt();
		
		result = parc1 + parc2;
		
		System.out.printf("A adição de %d + %d é igual a %d ", parc1, parc2, result);
		
		
		
	}

}

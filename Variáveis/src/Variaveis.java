
public class Variaveis {
	
	public static void main(String[] args)
	{
		/*
		byte var1 = -128; 							// de -128 a 127
		short var2 = -32768; 						// -32768 a 32767
		int var3 = (int)-2e31;						//-2e31 a2E31
		long var4 = (long) -9223372036854775808L;  //-9,223,372,036,854,775,808 a 9,223,372,036,854,775,807
		float var5 = 2e-45F;						//2e31 a 2E-45
		double var6 = (double) 2e307D;				//2e307D a 2e-323D
		
		//variável booleana
		boolean resultado = false; 		//false ou true
		
		//variável char
		char caracter = 'a';
		
		//string
		String palavra = "texto";*/
		
		int var = 10;
		int valor = 100;
		String nome;
		System.out.println(valor);
	
		String texto1 = "";
		
		if(texto1.isEmpty())
		{
			System.out.println("Sim");
		}
		else
		{
			System.out.println("Não");
		}	
		
		String texto = "                      Frase de testes de strings Java     ";
		
		if(texto.toLowerCase().contains("java"))
		{
			System.out.println("Sim");
		}
		else
		{
			System.out.println("Não");
		}
		
		System.out.println(texto);
		System.out.println(texto.trim());
		
		String fim = texto.replace('a','-');
		System.out.println(fim);
		
	}

}

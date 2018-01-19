package Aula02;

public class Caneta 
{
	String modelo;
	String cor;
	float ponta;
	int carga;
	boolean tampada;
	
	public void rabiscar()
	{
		if(tampada == true)
		{
			System.out.println("Não posso rabiscar");
		}
		else
		{
			System.out.println("Estou rabiscando");
		}
	}
	
	public void tampar()
	{
		tampada = true;
	}
	
	public void destampar()
	{
		tampada = false;
	}

	public void status()
	{
		System.out.println("Modelo: "+this.modelo);
		System.out.println("Uma caneta "+this.cor);
		System.out.println("Ponta: "+this.ponta);
		System.out.println("Carga: "+this.carga);
		System.out.println("Esta tampada?  "+this.tampada);

	}
}

package Aula04;

public class Caneta {
	private String modelo, cor;
	private float ponta;
	private boolean tampado;
	
	
	
	public Caneta()//este é o método construtor
	{
		this.setModelo("BIC");
		this.setCor("Azul");
		this.setPonta(1f);
		tampar();
	}
	
	public Caneta(String modelo, String cor, boolean tampar)//este é o método construtor overload
	{
		this.setModelo(modelo);
		this.setCor(cor);
		if(tampar==false)
		{
			destampar();
		}
		else
		{
			tampar();
		}
	}
	
	public String getCor()
	{
		return this.cor;
	}
	
	public void setCor(String c)
	{
		this.cor = c;
	}
	
	public String getModelo()
	{
		return this.modelo;
	}
	
	public void setModelo(String m)
	{
		this.modelo = m;
	}
	
	public float getPonta()
	{
		return this.ponta;
	}
	
	public void setPonta(float p)
	{
		this.ponta = p;
	}
	
	public void tampar()
	{
		this.tampado=true;
	}
	
	public void destampar()
	{
		this.tampado=false;
	}
	public void status()
	{
		String tamp = tampado==false ?"tampada":"destampada";
		System.out.println("SOBRE A CANETA:");
		System.out.println("Modelo: "+ getModelo());
		System.out.println("Ponta: "+ getPonta());
		System.out.println("Cor: "+ getCor());
		System.out.println(tamp);
	}
	
}


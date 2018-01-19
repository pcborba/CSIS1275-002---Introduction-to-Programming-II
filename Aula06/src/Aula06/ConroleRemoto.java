package Aula06;

public class ConroleRemoto implements Controlador {
//métodos especiais
	private int volume;
	private boolean ligado, tocando;
	
	//métodos Especiais
	
	public ConroleRemoto()
	{
		this.volume = 50;
		this.ligado = false;
		this.tocando = false;
	}
	
	private int getVolume()
	{
		return this.volume;
	}
	
	private void setVolume(int v)
	{
		this.volume = v;		
	}
	
	private boolean getLigado()
	{
		return ligado;
	}
	
	private void setLigado(boolean l)
	{
		this.ligado = l;
	}
	
	private boolean getTocando()
	{
		return this.tocando;
	}
	
	private void setTocando(boolean t)
	{
		if(getTocando())
		{
			System.out.println("O controle já está tocando");
		}
		else
		{
			this.tocando =true;
		}
	}

	@Override
	public void ligar() {
		// TODO Auto-generated method stub
		this.setLigado(true);
	}

	@Override
	public void desligar() {
		// TODO Auto-generated method stub
		this.setLigado(false);
	}

	@Override
	public void abriMenu() {
		// TODO Auto-generated method stub
		System.out.println("");
		System.out.println("------MENU------");
		System.out.println("Está ligado: "+getLigado());
		System.out.println("Está tocando: "+getTocando());
		System.out.println("Volume: "+getVolume());
		int i =0;
		while (i<this.getVolume())
		{
			System.out.print("[*]");
			i+=10;
		}
		while(i<100)
		{
			System.out.print("[ ]");
			i+=10;
		}
		System.out.println("\n----------------\n");
	}

	@Override
	public void fecharMenu() {
		// TODO Auto-generated method stub
		System.out.println("Fechando menu...");
	}

	@Override
	public void maisVolume() {
		// TODO Auto-generated method stub
		if(this.getLigado())
		{
			if(this.getVolume() == 100)
			{
				System.out.println("Este dispositivo já está no maior volume possível");
			}
			else
			{
				setVolume(getVolume()+10);
			}
		}
		else
		{
			System.out.println("Este dispositivo está desligado");
		}
	}

	@Override
	public void menosVolume() {
		// TODO Auto-generated method stub
		if(this.getLigado())
		{
			if(this.getVolume()==0 || this.getLigado()==false)
			{
				System.out.println("Este dispositivo já está no menor no menor volume possível.");
			}
			else
			{
				setVolume(getVolume()-10);
			}
		}
		else
		{
			System.out.println("Este dispositivo está desligado");
		}
	}

	@Override
	public void ligarMudo() {
		// TODO Auto-generated method stub
		if(this.getLigado() && this.getVolume() >0)
		{
			setVolume(0);
		}
	}

	@Override
	public void desligarMudo() {
		// TODO Auto-generated method stub
		if(this.getLigado()&&this.getVolume()==0)
		{
			setVolume(50);
		}
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		if(this.getLigado() && !(this.getTocando()))
		{
			this.setTocando(true);
		}
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		if((this.getLigado()) && this.getTocando())
		{
			this.setTocando(false);
		}
	}
}

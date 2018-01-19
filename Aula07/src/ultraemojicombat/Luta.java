package ultraemojicombat;

import java.util.Random;

public class Luta {
	private Lutador desafiado, desafiante;
	private int rounds;
	private boolean aprovada;
		
	//construct 
	/*public Luta(Lutador desafiado, Lutador desafiante){
		this.desafiado = desafiado;
		this.desafiante = desafiante;
		
	}*/
	
	public void marcarLuta(Lutador l1, Lutador l2){
		if(l1.getCategoria()==l2.getCategoria() && l1!=l2)
		{
			System.out.println("Luta agendada!");
			this.aprovada = true;
			this.desafiado = l1;
			this.desafiante = l2;
		}
		else
		{
			System.out.println("Luta NÃO PODE SER AGENDADA POIS OS LUTADORES SÃO DE CATEGORIAS DIFERENTES OU SÃO O MESMO LUTADOR!");
			this.aprovada = false;
			this.desafiado = null;
			this.desafiante =null;
		}
	}
	
	public void lutar(){
		if(this.aprovada==true)
		{
			System.out.println("### DESAFIADO ###");
			this.desafiado.apresentar();
			System.out.println("### DESAFIANTE ###");
			this.desafiante.apresentar();
			Random aleatorio = new Random();
			int vencedor = aleatorio.nextInt(3); // 0 1 ou 2
			switch(vencedor){
				case 0: //Empate
					System.out.println("### RESULTADO ###");
					System.out.println("Empatou");
					this.desafiado.empatarLuta();
					this.desafiante.empatarLuta();
					break;
				case 1://Desafiado vence
					System.out.println("### RESULTADO ###");
					System.out.println("Vitória do "+this.desafiado.getNome());
					this.desafiado.ganharLuta();
					this.desafiante.perderLuta();
					break;
				case 2: //Desafiante vence
					System.out.println("### RESULTADO ###");
					System.out.println("Vitória do "+this.desafiante.getNome());
					this.desafiante.ganharLuta();
					this.desafiado.perderLuta();
					break;
			}
		}
		else
		{
			System.out.println("Esta luta não está aprovada!");
		}
	}
	
	//modifiers methods
	public void setDesafiado(Lutador dd)
	{
		this.desafiado = dd;
	}
	
	public Lutador getDesfiado(){
		return this.desafiado;
	}
	
	public void setDesafiante(Lutador ds)
	{
		this.desafiante = ds;
	}
	
	public Lutador getDesafiante(){
		return this.desafiante;
	}
}

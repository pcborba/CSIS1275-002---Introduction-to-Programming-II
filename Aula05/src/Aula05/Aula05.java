package Aula05;

public class Aula05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContaBanco c1 = new ContaBanco();
		c1.setDono("Jubileu");
		c1.abrirConta("CC");
		
		c1.statusAtual();
		
		ContaBanco c2 = new ContaBanco();
		c2.setDono("Anastácia");
		c2.abrirConta("CP");

		c2.statusAtual();
		
		ContaBanco c3 = new ContaBanco();
		c3.setDono("Creusa");
		c3.abrirConta("CC");

		c3.statusAtual();
		

	}

}

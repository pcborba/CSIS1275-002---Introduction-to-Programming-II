package Aula02;

public class Aula02 {

	public static void main(String[] args) {
		
		Caneta canAzul = new Caneta();
		canAzul.modelo = "BIC";
		canAzul.cor = "azul";
		canAzul.carga = 75;
		canAzul.tampar();
		canAzul.status();
		System.out.println("-----------------------------");
		System.out.println("");
		canAzul.destampar();
		canAzul.status();
		System.out.println("-----------------------------");
		System.out.println("");
		canAzul.rabiscar();

	}

}

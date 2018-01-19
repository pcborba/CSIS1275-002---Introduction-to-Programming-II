package Aula02;

public class Aula02 {

	public static void main(String[] args) {
		
		Caneta canAzul = new Caneta();

		canAzul.modelo = "BIC Cristal";
		canAzul.cor = "Azul";
		//canAzul.ponta = 0.5f;
		canAzul.carga = 80;
		//canAzul.tampada = true;
		canAzul.status();
		canAzul.destampar();
		canAzul.rabiscar();
		System.out.println("-----------------------------");
		System.out.println("");

	}

}

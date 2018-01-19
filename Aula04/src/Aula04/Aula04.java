package Aula04;

public class Aula04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Caneta c1 = new Caneta();
		c1.setModelo("Papermate");
		c1.setPonta(1.2f);
		c1.status();
		
		Caneta c2 = new Caneta();
		c2.status();
		
		Caneta c3 = new Caneta("BIC","Vermelha",false);
		c3.status();
	}

}

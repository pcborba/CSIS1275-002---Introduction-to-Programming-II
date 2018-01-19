package Aula11;

public class Aulal11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Pessoa p1 = new Pessoa();
		
		Visitante v1 = new Visitante();
		Aluno a1 = new Aluno();
		Bolsista b1 = new Bolsista();
		
		v1.setIdade(22);
		v1.setSexo('m');
		v1.setNome("Juvenal");
		System.out.println(v1.toString());
		
		a1.setIdade(16);
		a1.setSexo('f');
		a1.setNome("Maria");
		a1.setCurso("Informátia");
		a1.setMatricula(123);
		System.out.println(a1.toString());
		a1.pagarMensalidade();
		
		b1.setBolsa(.50f);
		b1.setNome("Jubileo");
		b1.setIdade(17);
		b1.setSexo('m');
		b1.setCurso("Contábeis");
		b1.pagarMensalidade();
		b1.pagarMensalidade(60);
		
		
		
		
		
	}

}

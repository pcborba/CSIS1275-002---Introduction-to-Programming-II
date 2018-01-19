package Aula10;

public class Aula10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa 		p1 = new Pessoa();
		Aluno 		p2 = new Aluno();
		Professor 	p3 = new Professor();
		Funcionario p4 = new Funcionario();
		
		p1.setNome("Pedro");
		p2.setNome("Maria");
		p3.setNome("Claúdio");
		p4.setNome("Fabiana");
		
		p1.setSexo('m');
		p2.setSexo('f');
		p3.setSexo('m');
		p4.setSexo('f');
		p1.setIdade(18);
		p2.setIdade(16);
		p3.setIdade(28);
		p4.setIdade(29);
		
		p2.setCurso("Informática");
		p3.setSalario(2050.25f);
		p4.setSetor("Estoque");
		
		System.out.println(p3.getSalario());
		p3.receberAumento(.25f);
		System.out.println(p3.getSalario());
		p4.mudarTrabalho();
		p2.cancelarMatricula();
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		System.out.println(p4.toString());
		
		

	}

}

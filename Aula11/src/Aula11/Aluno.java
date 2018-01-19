package Aula11;

public class Aluno extends Pessoa {
	private int matricula;
	private String curso;
	
	public void pagarMensalidade(){
		System.out.println("Aluno pagou mensalidade");
	}

	public void setMatricula(int m){
		this.matricula = m;
	}
	
	public int getMatricula(){
		return this.matricula;
	}
	
	public void setCurso(String c){
		this.curso = c;
	}
	
	public String getCurso(){
		return this.curso;
	}
	
}

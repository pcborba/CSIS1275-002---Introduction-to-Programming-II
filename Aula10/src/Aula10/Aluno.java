package Aula10;

public class Aluno extends Pessoa{
	private int matr;
	private String curso;
	
	public void cancelarMatricula(){
		System.out.println("Matricula será cancelada");
	}
	
	public void setMatr(int m){
		this.matr=m;
	}
	
	public int getMatr(){
		return this.matr;
	}
	
	public void setCurso(String c){
		this.curso = c;
	}
	
	public String getCurso(){
		return this.curso;
	}
}

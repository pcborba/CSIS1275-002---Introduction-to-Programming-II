package Aula10;

public class Funcionario extends Pessoa{
	private String setor;
	private boolean trabalhando;
	
	public void mudarTrabalho(){
		this.setTrabalhando(!getTrabalhando());
	}
	
	public void setSetor(String s){
		this.setor = s;
	}
	
	public String getSetor(){
		return this.setor;
	}
	
	public void setTrabalhando(boolean t){
		this.trabalhando = t;
	}

	public boolean getTrabalhando(){
		return this.trabalhando;
	}
	
}

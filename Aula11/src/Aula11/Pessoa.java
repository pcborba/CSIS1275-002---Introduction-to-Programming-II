package Aula11;

public abstract class Pessoa {
	private String nome;
	private int idade;
	private char sexo;
	
	public void felizAniversario(){
		this.setIdade(getIdade()+1);
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public void setNome(String n){
		this.nome = n;
	}
	
	public void setIdade(int i){
		this.idade = i;
	}
	
	public int getIdade(){
		return this.idade;
	}
	
	public void setSexo(char s){
		this.sexo = s;
	}
	
	public char getSexo(){
		return this.sexo;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + "]";
	}
	
	

}

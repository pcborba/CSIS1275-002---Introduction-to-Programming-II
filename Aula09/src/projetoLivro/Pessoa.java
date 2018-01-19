package projetoLivro;

public class Pessoa {
	private String nome;
	private int idade;
	private String sexo;
	
	//Construct
	public Pessoa(String nome, int idade, String sexo){
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
	}
	
	//Modifiers methods
	protected void setNome(String n){
		this.nome = n;
	}
	
	protected String getNome(){
		return this.nome;
	}
	
	protected void setIdade(int i){
		this.idade = i;
	}
	
	protected int getIdade(){
		return this.idade;
	}
	
	protected void setSexo(String s){
		this.sexo = s;
	}
	
	protected String getSexo(){
		return this.sexo;
	}
	
	//Other methods
	public void fazerAniversario(){
		this.setIdade(getIdade()+1);
		System.out.println("Feliz aniversário");
	}
	
	

}

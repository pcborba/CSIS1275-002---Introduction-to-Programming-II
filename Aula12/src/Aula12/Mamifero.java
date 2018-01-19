package Aula12;

public class Mamifero extends Animal{
	
	@Override
	public void locomover(){
		System.out.println("Correndo");
	}
	
	@Override
	public void alimentar(){
		System.out.println("Mamando");
	}
	
	@Override
	public void emitirSom(){
		System.out.println("Som de maméfero");
	}

}


public class Animal
{
	String especie, cor, nome;
	int num_patas;
	
	public void DefiniNome(String nome_in)
	{
		nome =nome_in;
	}
	
	
	public void Saltar()
	{
		System.out.println("O " + especie + " saltou!");
	}
	
	public String ApresentarAnimal()
	{
		String fim = "O nome do meu animal é " + nome;
		return fim;
	}
	

}

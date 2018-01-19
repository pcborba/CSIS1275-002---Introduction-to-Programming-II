
public class Oop
{

	public static void main(String[] args)
	{
		Animal primeiro = new Animal();
		Animal segundo = new Animal();
		primeiro.especie = "gato";
		primeiro.cor = "preto";
		primeiro.num_patas = 4;
		primeiro.Saltar();
		
		segundo.especie = "cão";
		segundo.cor = "branco";
		segundo.num_patas = 4;
		
		primeiro.DefiniNome("Bichano");
		
		Teste.metodo_static();
		
		System.out.println("O meu primeiro aniaml é um " + primeiro.especie + " "+primeiro.nome +
							" o meu segundo animal é um " + segundo.especie );
		
		System.out.println(primeiro.ApresentarAnimal());
	}

}


public class QuartoProjeto
{

	public static void main(String[] args)
	{
		System.out.println("Olá JAVA");
		ClasseAluno aluno_1 = new ClasseAluno();
		ClasseAluno aluno_2 = new ClasseAluno();
		
		aluno_1.nome = "joao";
		aluno_1.idade = 18;
		//aluno_1.DefinirSexo("masculino");
		
		aluno_2.nome = "sofia";
		aluno_2.idade = 20;
		//aluno_2.DefinirSexo("feminino");
		
		aluno_1.ApresentaAluno();
		aluno_2.ApresentaAluno();
		
		ClasseMatematica.Adicao(20, 20);
		
	}

}

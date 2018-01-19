/** Esta é a primeira classe criada utilizado o JAVA DOCS
 * para documentar as informações relacionadas a classe*/
public class ClasseAluno {
	public String nome;
	public int idade;
	
	private String _sexo;

	public void ApresentaAluno()
	{
		System.out.println("O aluno chama-se " + nome + " e tem " + 
							idade + " anos de idade e " +
							" é do sexo " + _sexo);
	}

	private void DefinirSexo(String s)
	{
		_sexo = s;
	}
}

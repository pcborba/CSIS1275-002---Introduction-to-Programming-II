package projetoLivro;

public class ProjetoLivro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Livro l[] = new Livro[2];
		Pessoa p[] =  new Pessoa[3];
		
		p[0] = new Pessoa("Maria", 45, "Mulher");
		p[1] =  new Pessoa("João", 37, "Homem");
		
		l[0] = new Livro("Livro", "Paulo Coelho",	265, p[0]);
		l[1] = new Livro("Livro 2", "Aman Pur", 320, p[1]);
		
		
		System.out.println(l[0].detalhes());
		p[0].fazerAniversario();
		l[0].abrir();
		l[0].folhear(20);
		System.out.println(l[0].detalhes());
	}

}

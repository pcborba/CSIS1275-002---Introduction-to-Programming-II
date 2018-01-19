package projetoLivro;

public class Livro implements Publicacao{
	private String titulo, autor;
	private int totPag, pagAtual;
	private boolean aberto;
	private Pessoa leitor;
	
	//construct
	public Livro(String titulo, String autor, int totPaginas, Pessoa leitor)
	{
		this.titulo = titulo;
		this.autor = autor;
		this.totPag = totPaginas;
		this.aberto = false;
		this.pagAtual = 0;
		this.leitor = leitor;
	}
	
	//Modifiers methods
	private void setTitulo(String t){
		this.titulo = t;
	}
	
	private String getTitulo(){
		return this.titulo;
	}
	
	private void setAutor(String a){
		this.autor = a;
	}
	
	private String getAutor(){
		return this.autor;
	}
	
	private void setTotalPaginas(int t){
		this.totPag = t;
	}
	
	private int getTotalPaginas(){
		return this.totPag;
	}
	
	private void setPaginaAtual(int p){
		this.pagAtual = p;
	}
	
	private int getPaginaAtual(){
		return this.pagAtual;
	}
	
	private void setAberto(boolean a){
		this.aberto = a;
	}
	
	private boolean getAberto(){
		return this.aberto;
	}
	
	private void setLeitor(Pessoa leitor){
		this.leitor = leitor;
	}
	
	private Pessoa getLeitor(){
		return this.leitor;
	}
	
	
	//Other methods
	public String detalhes(){
		return "Livro:" + "\n Título="+titulo+"\n Autor= "+autor
				+"\n Total de Páginas= "+totPag+"\n Página Atual= "+pagAtual
				+"\n Aberto= "+aberto+"\n Leitor= "+leitor.getNome()
				+"\n Idade= "+leitor.getIdade()+" anos"+"\n Sexo= "+leitor.getSexo();
	}

	
	//Abstracts methods
	@Override
	public void abrir(){
		this.aberto = true;
	}
	
	@Override
	public void fechar(){
		this.aberto=false;
	}
	
	@Override
	public void folhear(int p){
		if(p>this.getTotalPaginas())
		{
			this.setPaginaAtual(0);
		}
		else
		{
			this.setPaginaAtual(p);
		}
	}
	
	@Override
	public void avancarPag(){
		this.setPaginaAtual(getPaginaAtual()+1);
	}
	
	@Override
	public void voltarPag(){
		this.setPaginaAtual(getPaginaAtual()-1);
	}
	
}

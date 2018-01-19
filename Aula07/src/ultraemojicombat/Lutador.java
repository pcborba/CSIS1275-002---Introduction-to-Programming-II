package ultraemojicombat;

public class Lutador {
	//attributes
	private String nome, nacionalidade, categoria;
	private int idade, vitorias, derrotas, empates;
	private float altura, peso;
	
	//Construct
	public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas, int empates)
	{
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.idade = idade;
		this.altura = altura;
		setPeso(peso);
		this.vitorias = vitorias;
		this.derrotas = derrotas;
		this.empates = empates;
	}
	
	//modifiers methods
	public void setNome(String n){
		this.nome =n;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public void setNacionalidade(String nc){
		this.nacionalidade = nc;
	}
	
	public String getNacionalidade(){
		return this.nacionalidade;
	}
	
	private void setCategoria(float p){
		if(p<52.2 || p> 120.2)
		{
			this.categoria = "Inválida";
		}
		else if(p <=70.3)
		{
			this.categoria = "Leve";
		}
		else if(p <=83.9)
		{
			this.categoria = "Médio";
		}
		else
		{
			this.categoria = "Pesado";
		}
	}
	
	public String getCategoria(){
		return this.categoria;
	}
	
	public void setIdade(int i){
		this.idade = i;
	}
	
	public int getIdade(){
		return this.idade;
	}
	
	public void setVitorias(int v){
		this.vitorias = v;
	}
	
	public int getVitorias(){
		return this.vitorias;
	}
	
	public void setDerrotas(int d){
		this.derrotas = d;
	}
	
	public int getDerrotas(){
		return this.derrotas;
	}
	
	public void setEmpates(int e){
		this.empates = e;
	}
	
	public int getEmpates(){
		return this.empates;
	}
	
	public void setPeso(float p){
		this.peso = p;
		this.setCategoria(p);
	}
	
	public float getPeso(){
		return this.peso;
	}
	
	public void setAltura(float a){
		this.altura = a;
	}
	
	public float getAltura(){
		return this.altura;
	}
	//other methods
	
	public void ganharLuta(){
		this.setVitorias(getVitorias()+1);  
	}
	
	public void perderLuta(){
		this.setDerrotas(getDerrotas()+1);
	}
	
	public void empatarLuta(){
		this.setEmpates(getEmpates()+1);
	}
	
	public void apresentar(){
		System.out.println("--------------------------------------------------");
		System.out.println("Chegou a hora!!! Apresentamos o "+this.getNome() );
		System.out.println("Diretamente de "+this.getNacionalidade());
		System.out.println("com "+this.getIdade()+" anos e "+this.getAltura());
		System.out.println("pesando " +this.getPeso()+ " KG");
		System.out.println(this.getVitorias()+" vitórias");
		System.out.println(this.getDerrotas()+" derrotas");
		System.out.println(this.getEmpates()+" empates");
	}
	
	public void status(){
		System.out.println("--------------------------------------------------");
		System.out.println(this.getNome()+" é um peso "+ this.getCategoria());
		System.out.println("Ganhou "+this.getVitorias()+ " vezes");
		System.out.println("Perdeu "+this.getDerrotas()+ " vezes");
		System.out.println("Empatou "+this.getEmpates()+ " vezes");
	}

}

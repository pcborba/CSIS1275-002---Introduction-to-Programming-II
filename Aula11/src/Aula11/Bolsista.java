package Aula11;

public class Bolsista extends Aluno{
	private float bolsa;
	
	public void renovarBolsa(){
		System.out.println("Renovando bola de "+this.getNome());
	}

	@Override
	public void pagarMensalidade(){
		System.out.println("Pagar mensalidade reduzida do bolsista "+this.getNome() );
	}
	
	public void pagarMensalidade(int m){
		System.out.printf("Pagar mensalidade nova valor de $ %.2f do bolsista %s",(float)m,this.getNome() );
	}

	public float getBolsa() {
		return bolsa;
	}

	public void setBolsa(float bolsa) {
		this.bolsa = bolsa;
	}
	
	
}

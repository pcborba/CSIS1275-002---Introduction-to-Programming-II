package Aula05;

public class ContaBanco {
	
	public static int numConta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;
	
	public void statusAtual()
	{
		System.out.println("-------------------");
		System.out.println("Conta: "+this.getNumConta());
		System.out.println("");
		System.out.println("Tipo: "+this.getTipo());
		System.out.println("");
		System.out.println("Dono: "+this.getDono());
		System.out.println("");
		System.out.println("Saldo: "+this.getSaldo());
		System.out.println("");
		System.out.println("Status: "+this.getStatus());
		System.out.println("-------------------");
	}
	
	//Métodos contrutores
	public ContaBanco()
	{
		this.setSaldo(0);
		this.setStatus(false);
		
				
	}
	
	//Métodos modificadores
	public void setTipo(String tipo)
	{
		this.tipo = tipo;
	}
	
	public String getTipo()
	{
		return tipo;
	}
	
	public void setNumConta()
	{
		this.numConta += 1;
	}
	
	public int getNumConta()
	{
		return this.numConta;
	}
	
	public void setDono(String d)
	{
		this.dono = d;
	}
	
	public String getDono()
	{
		return this.dono;
	}
	public void setSaldo(float saldo)
	{
		this.saldo=saldo;
	}
	public float getSaldo()
	{
		return this.saldo;
	}
	public void setStatus(boolean s)
	{
		this.status = status;
	}
	public boolean getStatus()
	{
		return status;
	}
	
	//Métodos personalizados
	
	public void abrirConta(String t)
	{
		this.setTipo(t);
		this.setStatus(true);
		if(t == "CC")
		{
			this.setSaldo(50);
		}
		else if(t =="CP")
		{
			this.setSaldo(150);
		}
		setNumConta();
		System.out.println("Conta aberta com sucesso.");
	}
	
	public void fecharConta()
	{
		if(this.getSaldo()>0)
		{
			System.out.println("Conta não pode ser fechada, porque ainda tem saldo positivo.");
		}
		else if(this.getSaldo()<0)
		{
			System.out.println("Conta não pode ser fechada porque tem saldo negativo.");
		}
		else
		{
			this.setStatus(false);
			System.out.println("Conta fechada com sucesso");
		}
	}
	public void depositar(float v)
	{
		if (this.getStatus())
		{
			this.setSaldo(this.getSaldo()+v);
			System.out.println("Deposito realizado com sucesso");
		}
		else
		{
			System.out.println("Esta conta está desavitada, por isso não é possível depositar");
		}
	}
	
	public void sacar(float v)
	{
		if(this.getStatus())
		{
			if(getSaldo()>=v)
			{
				setSaldo(getSaldo()-v);
				System.out.println("Saque realizado na conta de "+this.getDono());
				System.out.println("Seu saldo atual é de " + getSaldo());
			}
			else
			{
				System.out.println("Saldo insuficente");
				System.out.println("Seu saldo atual é de " + getSaldo());
			}
		}
		else
		{
			System.out.println("Impossível sacar, pois a conta está desativada");
		}
	}
	
	public void pagarMensalidade()
	{
		int v;
		if(this.getTipo()=="CC")
		{
			v= 12;
		}
		else
		{
			v=20;
		}
		
		if(this.getStatus())
		{
			this.setSaldo(getSaldo()-v);
			System.out.println("Mensalidade paga com sucesso por "+this.getDono());
		}
		else
		{
			System.out.println("Impossível pagar uma conta cujo status é desativada");
		}
	}
	
	public void pagarConta()
	{
		
	}

}

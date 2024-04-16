package projeto;

public class Cliente {
	private int ID;
	private String nome;
	private	Endereco endereco;
	private String telefone;
	private String email;
	private int identidade;
	private int rg;
	private double renda;
	private boolean statusConta;
	
	public Cliente() {
		
	}
	
	
	public Cliente(int iD, String nome, Endereco endereco, String telefone, String email, int identidade, int rg,
			double renda, boolean statusConta) {
		this.ID = iD;
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.email = email;
		this.identidade = identidade;
		this.rg = rg;
		this.renda = renda;
		this.statusConta = statusConta;
	}


	public Cliente(int iD, String nome, String telefone, String email, int identidade, int rg,
			double renda, boolean statusConta) {
		this.ID = iD;
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		this.identidade = identidade;
		this.rg = rg;
		this.renda = renda;
		this.statusConta = statusConta;
	}


	public int getID() {
		return ID;
	}
	
	public String getNome() {
		return nome;
	}
	
	// terminar get e set
	
	
	
	
	
	
		
	public boolean criarConta(int ID, Conta [] lista) {   // não implementado;
		 // preciso de explicacao aqui, nao sei exatamente o que isso deve fazer.
		try {
			// no caso tenho que crtiar uma rotina aqui pra iniciar um objeto conta?
			return true;
		}catch(Exception e) {
			
			//System.out.println("Erro ao criar conta !!! ");
			return false;
		}
	}
	
	public boolean fecharConta(int ID, Conta [] lista) { // nao implementado;
		
		try 
		{
			
			return true;
			
		}catch(Exception e) 
		{
			
			return false;
			
		}
	}


	
	
	public boolean atualizarTelefone(String telefone) {
		
		return false;
		
	}
	
	public boolean atualizarEmail(String email) {
		
		return false;
		
	}
	
	
	public boolean atualizarRenda(double renda) {
		
		return false;
		
	}

	public void cadastrarEndereco() {
		endereco.cadastrarEndereco();
	}
	

	
}




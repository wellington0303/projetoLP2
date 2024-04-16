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
	
	public Cliente(String nome, int identidade, int rg ) {
		this.nome = nome;
		this.identidade = identidade;
		this.rg = rg;
	}
	
	public Cliente(int iD, String nome, Endereco endereco, String telefone, String email, int identidade, int rg,
			double renda, boolean statusConta) {
		ID = iD;
		this.nome = nome;
		this.endereco = endereco;
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

	public void setID(int iD) {
		ID = iD;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public String getEmail() {
		return email;
	}

	public int getIdentidade() {
		return identidade;
	}

	public void setIdentidade(int identidade) {
		this.identidade = identidade;
	}

	public int getRg() {
		return rg;
	}

	public void setRg(int rg) {
		this.rg = rg;
	}

	public double getRenda() {
		return renda;
	}

	public boolean isStatusConta() {
		return statusConta;
	}

	public boolean criarConta(int ID, Conta [] lista) {  

		// IMPLEMENTAR
		
		return false;
	
	}
	
	public boolean fecharConta(int ID, Conta [] lista) { 
		
		// IMPLEMENTAR
		
		return false;	
	}

	public boolean atualizarTelefone(String telefone) {
		
		// IMPLEMENTAR
		
		return false;
		
	}
	
	public boolean atualizarEmail(String email) {
		
		// IMPLEMENTAR
		
		return false;
		
	}
	
	
	public boolean atualizarRenda(double renda) {
		
		// IMPLEMENTAR
		
		return false;		
	}

	public void cadastrarEndereco() {
		endereco.cadastrarEndereco();
	}

	@Override
	public String toString() {
		return "ID = " + ID + ", Nome = " + nome + ", Telefone=" + telefone + ", Email=" + email +  ", statusConta=" + statusConta + "]";
	}
	
}




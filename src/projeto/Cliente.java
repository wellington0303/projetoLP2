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
	
		
	public boolean CriarConta() {   // não implementado;
		 // preciso de explicacao aqui, nao sei exatamente o que isso deve fazer.
		try {
			// no caso tenho que crtiar uma rotina aqui pra iniciar um objeto conta?
			return true;
		}catch(Exception e) {
			
			//System.out.println("Erro ao criar conta !!! ");
			return false;
		}
	}
	
	public boolean FecharConta(int id) { // nao implementado;
		
		try 
		{
			
			return true;
			
		}catch(Exception e) 
		{
			
			return false;
			
		}
	}
	
	public boolean AtualizarEndereco() {
		try {
			this.endereco.AtualizarEndereco();
			return true;
		}catch(Exception e) {
			return false;
		}
	}
	public int getID() {
		return ID;
	}
	
	public String getNome() {
		return nome;
	}
	public void  setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	public void setRenda(double renda) {
		this.renda = renda;
	}
	
}




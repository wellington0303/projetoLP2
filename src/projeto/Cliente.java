package projeto;

public class Cliente {
	private int ID;
	private String nome;
	private int dataNascimento;
	private	Endereco endereco;
	private String telefone;
	private String email;
	private String identidade;
	private String rg;
	private double renda;
	private boolean statusConta;
	
	public Cliente() {
		
	}
	public Cliente( String nome, int dataNascimento, String identidade, String rg ) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
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
	
	
}




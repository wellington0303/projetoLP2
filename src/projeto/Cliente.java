package projeto;

import java.util.Scanner;

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
	
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		this.ID = iD;
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

	public boolean atualizarTelefone(String telefone) {
		
		this.telefone = telefone;
		
		return false;
		
	}
	
	public boolean atualizarEmail(String email) {
		
		this.email = email;
		
		return false;
		
	}
	
	public boolean atualizarRenda(double renda) {
		
		this.renda = renda;
		
		return false;		
	}

	
	
	public void cadastrarCliente() {
		Scanner sc = new Scanner(System.in);
		Scanner sc_num = new Scanner(System.in);
		
		System.out.println("Digite o nome: ");
		this.nome = sc.nextLine();
		
		System.out.println("Digite o telefone: ");
		this.telefone = sc.nextLine();
		
		System.out.println("Digite o email: ");
		this.email = sc.nextLine();
		
		System.out.println("Digite a identidade: ");
		this.identidade = sc_num.nextInt();
		
		System.out.println("Digite o rg: ");
		this.rg = sc_num.nextInt();
		
		System.out.println("Digite a renda: ");
		this.renda = sc_num.nextDouble();
		
		endereco.cadastrarEndereco();
		
		statusConta = false;
		
		sc.close();
		sc_num.close();
	
	}
	public void printCliente() {
		System.out.println("nome: " + nome);
		
		System.out.println("telefone: " + telefone);
		
		System.out.println("email: " + email);
		
		System.out.println("identidade: " + identidade);
		
		System.out.println("rg: " + rg);
		
		System.out.println("renda: " + renda);
		
		endereco.imprimirEndereco();
	}
	

	@Override
	public String toString() {
		return "ID = " + ID + ", Nome = " + nome + ", Telefone=" + telefone + ", Email=" + email;
	}
	
}




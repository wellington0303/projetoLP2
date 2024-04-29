package projeto;

import java.util.Scanner;

public class Cliente {
	private int ID;
	private String nome;
	private Endereco endereco;
	private String telefone;
	private String email;
	private int identidade;
	private int rg;
	private double renda;	
	
	public Cliente() {
		
	}
	
	/* VER SE É NECESSÁRIO
	public Cliente(String nome, int identidade, int rg ) {
		this.nome = nome;
		this.identidade = identidade;
		this.rg = rg;
	}
	
	 */
	
	public Cliente(int iD, String nome, Endereco endereco, String telefone, String email, int identidade, int rg,
			double renda) {
		this.ID = iD;
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.email = email;
		this.identidade = identidade;
		this.rg = rg;
		this.renda = renda;
	}
	
	public int getID() {
		return ID;
	}

	public void setID(int ID) {
		this.ID = ID;
	}
	
	public String getNome() {
		return nome;
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

	public int getRg() {
		return rg;
	}

	public double getRenda() {
		return renda;
	}

	public void atualizarTelefone(String telefone) {	
		this.telefone = telefone;	
	}
	
	public void atualizarEmail(String email) {		
		this.email = email;
			
	}
	
	public void atualizarRenda(double renda) {
		this.renda = renda;
	}

	public void cadastrarCliente(int ID, Scanner sc, Scanner sc_num) {
		
		this.ID = ID;
		
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
		
		this.endereco = new Endereco();
		endereco.cadastrarEndereco(sc, sc_num);
	
	}
	
	public void imprimirCliente() {	
		System.out.println("ID: " + ID);
		System.out.println("Nome: " + nome);
		System.out.println("Telefone: " + telefone);
		System.out.println("Email: " + email);
		System.out.println("Identidade: " + identidade);
		System.out.println("RG: " + rg);	
		System.out.println("Renda: " + renda);		
		endereco.imprimirEndereco();
	}
	
	public void cadastrarEndereco(Scanner sc, Scanner sc_num) {		
		endereco.cadastrarEndereco(sc, sc_num);
	}

}




package projeto;

import java.util.Scanner;

public class Cliente {
	private String nome;
	private Endereco endereco;
	private String telefone;
	private String email;
	private int identidade;
	private int rg;
	
	Scanner sc = new Scanner(System.in);
	Scanner sc_num = new Scanner(System.in);
	
	public Cliente() {
		
	}
	
	public Cliente(String nome, Endereco endereco, String telefone, String email, int identidade, int rg) {
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.email = email;
		this.identidade = identidade;
		this.rg = rg;
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

	public void atualizarTelefone(String telefone) {	
		this.telefone = telefone;	
	}
	
	public void atualizarEmail(String email) {		
		this.email = email;	
	}
	
	public void cadastrarCliente() {
		
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
		
		this.endereco = new Endereco();
		endereco.cadastrarEndereco();
	
	}
	
	public void imprimirCliente() {	
		System.out.println("Nome: " + nome);
		System.out.println("Telefone: " + telefone);
		System.out.println("Email: " + email);
		System.out.println("Identidade: " + identidade);
		System.out.println("RG: " + rg);	
		endereco.imprimirEndereco();
	}
	
	public void cadastrarEndereco() {		
		endereco.cadastrarEndereco();
	}
}
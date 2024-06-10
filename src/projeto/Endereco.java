package projeto;

import java.util.Scanner;

public class Endereco {
	private String logradouro;
	private int numero;
	private String bairro;
	private String cidade;
	private String estado;
	private String cep;
	
	Scanner sc = new Scanner(System.in);
	Scanner sc_num = new Scanner(System.in);
	
	public Endereco () {
	}
	
	public Endereco (String logradouro, int numero, String bairro, String cidade, String estado, String cep) {
		this.logradouro = logradouro;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;
	}
	
	public String getLogradouro() {
		return logradouro;
	}

	public int getNumero() {
		return numero;
	}

	public String getBairro() {
		return bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public String getEstado() {
		return estado;
	}

	public String getCep() {
		return cep;
	}

	public void cadastrarEndereco() {
		
		System.out.println("Informe o logradouro: ");
		this.logradouro = sc.nextLine();
		
		System.out.println("Informe o bairro: ");
		this.bairro = sc.nextLine();
		
		System.out.println("Informe o cidade: ");
		this.cidade = sc.nextLine();
		
		System.out.println("Informe o estado: ");
		this.estado = sc.nextLine();
		
		System.out.println("Informe o numero: ");
		this.numero = sc_num.nextInt();
		
		System.out.println("Informe o cep: ");
		this.cep = sc.nextLine();		

	}
	
	public void imprimirEndereco() {
		System.out.println("Logradouro:  " + logradouro);
		System.out.println("Bairro:  " + bairro);
		System.out.println("Cidade:  " + cidade);
		System.out.println("Estado:  " + estado);
		System.out.println("Número:  " + numero);
		System.out.println("CEP:  " + cep);
	}
}

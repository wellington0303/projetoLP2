package projeto;

import java.util.Scanner;

public class Endereco {
	private String logradouro;
	private int numero;
	private String bairro;
	private String cidade;
	private String estado;
	private String cep;
	
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

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

public void cadastrarEndereco() {
	
		Scanner scan = new Scanner(System.in);
		Scanner scan_num = new Scanner(System.in);
		
		System.out.println("Informe o logradouro: ");
		this.logradouro = scan.nextLine();
		
		System.out.println("Informe o bairro: ");
		this.bairro = scan.nextLine();
		
		System.out.println("Informe o cidade: ");
		this.cidade = scan.nextLine();
		
		System.out.println("Informe o estado: ");
		this.estado = scan.nextLine();
		
		System.out.println("Informe o numero: ");
		this.numero = scan_num.nextInt();
		
		System.out.println("Informe o cep: ");
		this.cep = scan.nextLine();
		
		scan.close();
		scan_num.close();
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

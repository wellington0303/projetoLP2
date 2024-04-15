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
		// organizar
		System.out.println("logradouro:  " + this.logradouro);
		System.out.println("bairro:  " + this.bairro);
		System.out.println("cidade:  " + this.cidade);
		System.out.println("estado:  " + this.estado);
		System.out.println("numero:  " + this.numero);
		System.out.println("CEP:  " + this.cep);
	}
}

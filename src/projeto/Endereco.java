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
	public void AtualizarEndereco() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("informe o logradouro: ");
		this.logradouro = scan.nextLine();
		System.out.println("informe o bairro: ");
		this.bairro = scan.nextLine();
		System.out.println("informe o cidade: ");
		this.cidade = scan.nextLine();
		System.out.println("informe o estado: ");
		this.estado = scan.nextLine();
		System.out.println("informe o numero: ");
		this.numero = scan.nextInt();
		System.out.println("informe o cep: ");
		this.cep = scan.nextLine();
		
		scan.close();
	}
	public void PrintarEndereco() {
		System.out.println("logradouro:  " + this.logradouro);
		System.out.println("bairro:  " + this.bairro);
		System.out.println("cidade:  " + this.cidade);
		System.out.println("estado:  " + this.estado);
		System.out.println("numero:  " + this.numero);
		System.out.println("CEP:  " + this.cep);
	}
}

package projeto;
import java.util.Scanner;
public class Conta {
	
	protected int id;
	protected int numero;
	protected double saldo;
	protected Cliente titular;
	protected String tipo;
	protected Data dataAbertura;
	
	Conta(){
		super();
		this.id = this.titular.getID();
	}
	
	
	
	
	public Conta(int id, int numero, double saldo, Cliente titular, String tipo, Data dataAbertura) {
		super();
		this.id = id;
		this.numero = numero;
		this.saldo = saldo;
		this.titular = titular;
		this.tipo = tipo;
		this.dataAbertura = dataAbertura;
	}

	public Conta(int id, int numero, double saldo, Cliente titular, String tipo) {
		super();
		this.id = id;
		this.numero = numero;
		this.saldo = saldo;
		this.titular = titular;
		this.tipo = tipo;
	}


	public double verificarSaldo() {
		// método errado, retorna um double 
		
		if (saldo <= this.saldo) {
			return true;
		}else {
			return false;
		}
	}
	
	public void criarConta() {
		
		// acho que não é necessário
		Scanner scan = new Scanner(System.in);
		System.out.println("informe o numero da conta");
		this.numero = scan.nextInt();
		

		
		scan.close();
	}

}

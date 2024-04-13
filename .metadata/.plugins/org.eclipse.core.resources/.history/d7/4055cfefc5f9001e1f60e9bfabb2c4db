package projeto;
import java.util.Scanner;
public class Conta {
	
	protected int id;
	protected int numero;
	protected double saldo;
	protected Cliente titular;
	protected String tipo;
	protected int dataDeAbertura;
	
	Conta(){
		super();
		this.id = this.titular.getID();
	}
	public boolean VerificarSaldo(double saldo) {
		if (saldo <= this.saldo) {
			return true;
		}else {
			return false;
		}
	}
	
	public void criarConta() {
		Scanner scan = new Scanner(System.in);
		System.out.println("informe o numero da conta");
		this.numero = scan.nextInt();
		System.out.println("informe o numero da conta");

		
		scan.close();
	}

}

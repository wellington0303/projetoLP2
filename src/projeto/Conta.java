package projeto;

import java.util.Scanner;

public class Conta {
	
	protected int id;
	protected int numero;
	protected double saldo;
	protected Cliente titular;
	protected String tipo;
	protected Data dataAbertura;
	
	public Conta(){
	}
	
	public Conta(int id){
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
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Data getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(Data dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	public boolean verificarSaldo(double saldo) {
		if (saldo <= this.saldo) {
			return true;
		} else {
			return false;
		}
	}
	
	public void criarConta() {
		Scanner scan = new Scanner(System.in);
		System.out.println("informe o numero da conta");
		this.numero = scan.nextInt();
		
		scan.close();
	}
	
}

package projeto;

public class Conta {
	
	protected int ID;
	protected int numero;
	protected double saldo;
	protected Cliente titular;
	protected String tipo;
	protected Data dataAbertura;
	
	public Conta(){
	}
	
	public Conta(int id){	
		this.ID = this.titular.getID();
	}
	
	public Conta(int id, int numero, double saldo, String tipo, Data dataAbertura) {
		super();
		this.ID = id;
		this.numero = numero;
		this.saldo = saldo;
		this.tipo = tipo;
		this.dataAbertura = dataAbertura;
		this.titular = new Cliente();
		this.titular.cadastrarCliente(ID);
	}
	
	public int getID() {
		return ID;
	}

	public int getNumero() {
		return numero;
	}

	public Cliente getTitular() {
		return titular;
	}

	public String getTipo() {
		return tipo;
	}

	public Data getDataAbertura() {
		return dataAbertura;
	}

	public double verificarSaldo() {
		return saldo;
	}
	
}

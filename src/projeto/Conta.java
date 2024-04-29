package projeto;

public class Conta {
	
	protected int ID;
	protected double saldo;
	protected Cliente titular;
	protected Data dataAbertura;
	
	public Conta(){
	}
	
	/*
	 VER SE É NECESSÁRIO
	public Conta(int id){	
		this.ID = this.titular.getID();
	}
	*/
	
	public Conta(int id, double saldo,  Data dataAbertura) {
		super();
		this.ID = id;
		this.saldo = 0;
		this.titular = new Cliente();
		this.dataAbertura = dataAbertura;

	}
	
	public int getID() {
		return ID;
	}
	
	public void setID(int ID) {
		this.ID = ID;
	}
	
	public Cliente getTitular() {
		return titular;
	}

	public Data getDataAbertura() {
		return dataAbertura;
	}
 
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	public double verificarSaldo() {
		return saldo;
	}
	
}

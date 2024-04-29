package projeto;

public class Conta {
	
	protected int ID;
	protected double saldo;
	protected Cliente titular;
	protected Data dataAbertura;
	
	public Conta(){
	}
	
	public Conta(int id, Data dataAbertura) {
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
	public void imprimirData() {
		System.out.println("Data de abertura: " + dataAbertura.getDia() + "/" + dataAbertura.getMes() + "/" + dataAbertura.getAno());
	}
	
}

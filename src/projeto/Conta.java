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
		this.titular.cadastrarCliente();
	}
	
	public int getID() {
		return ID;
	}

	public void setID(int id) {
		this.ID = id;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
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

	public boolean verificarSaldo(double valor) {
		if (valor <= saldo ) {
			return true;
		}else {
			return false;
		}
	}


	
	
}

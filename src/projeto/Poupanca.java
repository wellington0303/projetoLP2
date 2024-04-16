package projeto;

public class Poupanca extends Conta {
	private double taxaJuros;
	private double jurosAcumulados;
	private Data data; 
	
	public Poupanca(){
	}
	
	public Poupanca(int id, int numero, double saldo, Cliente titular, String tipo, Data dataAbertura, double taxaJuros,
			double jurosAcumulados, Data data) {
		super(id, numero, saldo, titular, tipo, dataAbertura);
		this.taxaJuros = taxaJuros;
		this.jurosAcumulados = jurosAcumulados;
		this.data = data;
	}
	
	public double getTaxaJuros() {
		return taxaJuros;
	}

	public void setTaxaJuros(double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}

	public double getJurosAcumulados() {
		return jurosAcumulados;
	}

	public void setJurosAcumulados(double jurosAcumulados) {
		this.jurosAcumulados = jurosAcumulados;
	}

	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public boolean sacar(double valor) {
		if (super.verificarSaldo(valor)){
			super.saldo -= valor;
			return true;
		}else {
			return false;
		}
	}
	
	public boolean depositar(double valor) {
		if (valor > 0) {
			super.saldo += valor;
			return true;
		} else {
			return false;
		}
	}
	
	public double calcularJuros(Data dataBase) {
		
		//IMPLEMENTAR 
		
		return 0;
	}
}



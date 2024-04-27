package projeto;

public class Poupanca extends Conta {
	private double taxaJuros;
	private double jurosAcumulados;
	private Data data; 
	
	public Poupanca(){
	}
	
	public Poupanca(int id, int numero, double saldo, Cliente titular, String tipo, Data dataAbertura, double taxaJuros, double jurosAcumulados, Data data) {
		super(id, numero, saldo, tipo, dataAbertura);
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
		
		double taxa = 5; 
		
		if (valor + taxa <= saldo){	
			super.saldo -= valor + taxa;
			return true;
		}else {
			return false;
		}
	}
	
	public boolean depositar(double valor) {
		
		double novoValor = rendimento() * 0.5;
		
		if (novoValor > 0) {
			super.saldo += novoValor;
			return true;
		} else {
			return false;
		}
	}
	
	public int rendimento() {
		
		int data1 = super.dataAbertura.getDia() + (super.dataAbertura.getMes() * 30) + (super.dataAbertura.getMes() * 365);
		int data2 =data.getDia() + (data.getMes() * 30) + (data.getMes() * 365);
		
		int quantidadeDias = data2 - data1;
		return quantidadeDias;
				 
				
		
		
	}
}



package projeto;

public class Investimento extends Conta{
	private double taxaJuros;
	private Data dataVencimento;
	private double jurosAcumulados;
	
	public Investimento(){		
	}
	
	public Investimento(int id, int numero, double saldo, Cliente titular, String tipo, Data dataAbertura, double taxaJuros,
			Data dataVencimento, double jurosAcumulados) {
		super(id, numero, saldo, titular, tipo, dataAbertura);
		this.taxaJuros = taxaJuros;
		this.dataVencimento = dataVencimento;
		this.jurosAcumulados = jurosAcumulados;
	}

	public double getTaxaJuros() {
		return taxaJuros;
	}

	public void setTaxaJuros(double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}

	public Data getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(Data dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public double getJurosAcumulados() {
		return jurosAcumulados;
	}

	public void setJurosAcumulados(double jurosAcumulados) {
		this.jurosAcumulados = jurosAcumulados;
	}

	public boolean investir(double valor) {
		if (super.verificarSaldo(valor)){
			super.saldo -= valor;
			return true;
		}else {
			return false;
		}
	}
	public  boolean resgatar(double valor) {
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

package projeto;

public class Investimento extends Conta{
	private double taxaJuros;
	private Data data;
	private double jurosAcumulados;
	
	public Investimento(){		
	}
	
	public Investimento(int id, int numero, double saldo, Cliente titular, String tipo, Data dataAbertura, double taxaJuros,
			Data dataVencimento, double jurosAcumulados) {
		super(id, numero, saldo, tipo, dataAbertura);
		this.taxaJuros = taxaJuros;
		this.data = dataVencimento;
		this.jurosAcumulados = jurosAcumulados;
	}

	public double getTaxaJuros() {
		return taxaJuros;
	}

	public void setTaxaJuros(double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}

	public Data getDataVencimento() {
		return data;
	}

	public void setDataVencimento(Data dataVencimento) {
		this.data = dataVencimento;
	}

	public double getJurosAcumulados() {
		return jurosAcumulados;
	}

	public void setJurosAcumulados(double jurosAcumulados) {
		this.jurosAcumulados = jurosAcumulados;
	}

	public boolean investir(double valor) {

		if (valor > 0) {
			super.saldo += valor;
			return true;
		} else {
			return false;
		}
	}
		
	
	public  boolean resgatar(double valor) {
		
		if (valor + 5 <= saldo){
			super.saldo -= valor + 5;
			return true;
		}else {
			return false;
		}
	}
	
	public double calcularJuros() {

		int data1 = super.dataAbertura.getDia() + (super.dataAbertura.getMes() * 30) + (super.dataAbertura.getMes() * 365);
		int data2 =data.getDia() + (data.getMes() * 30) + (data.getMes() * 365);
		
		int quantidadeDias = data2 - data1;
		return quantidadeDias * jurosAcumulados;
		
	}

	
}

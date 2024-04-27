package projeto;

public class Investimento extends Conta{
	private double taxaJuros;
	private double rendimentoMensal;
	private Data data;
	private double jurosAcumulados;
	
	public Investimento(){		
	}
	
	public Investimento(int id, int numero, double saldo, Cliente titular, String tipo, Data dataAbertura) {
		super(id, numero, saldo, tipo, dataAbertura);
		this.taxaJuros = 15;
		this.rendimentoMensal = 1;
		this.jurosAcumulados = 0;
	}
	
	public double getTaxaJuros() {
		return taxaJuros;
	}

	public double getRendimentoMensal() {
		return rendimentoMensal;
	}

	public Data getData() {
		return data;
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
		
		double novoValor = valor + taxaJuros;

		if (novoValor <= saldo) {
			super.saldo -= novoValor;
			return true;
			
		} else {
			return false;
		}
	}
	
	public double calcularJuros() {
		
		data.infoData();
		
		int data1 = super.dataAbertura.getDia() + (super.dataAbertura.getMes() * 30) + (super.dataAbertura.getAno() * 365);
		int data2 = data.getDia() + (data.getMes() * 30) + (data.getAno()* 365);
		
		int quantidadeDias = data2 - data1;
				
	    double rendimentoDiario = (Math.pow(1 + rendimentoMensal, 1.0 / 30) - 1)/100;
	    
	    double saldoFinal = saldo * (1 + rendimentoDiario*quantidadeDias);
	    
	    this.jurosAcumulados = saldoFinal - saldo;
	    
	    return jurosAcumulados;
			
	}
	
	@Override
	public String toString() {
		return "ID = " + ID + ", Número = " + numero + ", Saldo = " + saldo + ", Titular = " + titular + ", Tipo = " + tipo;
	}
	
}

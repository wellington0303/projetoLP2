package projeto;

public class Poupanca extends Conta {
	private double taxaJuros;
	private double rendimentoMensal;
	private double jurosAcumulados;
	double limiteSaque;
	private Data data; 
	
	public Poupanca(){
	}
	
	public Poupanca(int id, int numero, double saldo, Cliente titular, String tipo, Data dataAbertura) {
		super(id, numero, saldo, tipo, dataAbertura);
		this.taxaJuros = 10;
		this.rendimentoMensal = 0.5;
		this.jurosAcumulados = 0;
		this.limiteSaque = 800;
	}

	public double getTaxaJuros() {
		return taxaJuros;
	}

	public double getRendimentoMensal() {
		return rendimentoMensal;
	}

	public double getLimiteSaque() {
		return limiteSaque;
	}

	public Data getData() {
		return data;
	}

	public boolean sacar(double valor) {
		
		double valorSaque = valor + taxaJuros;
		
		if (valorSaque <= saldo && valor <= limiteSaque){	
			super.saldo -= valorSaque;
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



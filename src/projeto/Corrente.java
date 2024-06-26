package projeto;

public class Corrente extends Conta {
	double taxaJuros;
	double limiteSaque;
	
	Corrente(){	
	}
	
	public Corrente(int id, int numero, double saldo, String tipo, Data dataAbertura) {
		super(id, numero, saldo, tipo, dataAbertura);
		this.taxaJuros = 5;
		this.limiteSaque = 1000;
	}
	
	public double getTaxaJuros() {
		return taxaJuros;
	}

	public double getLimiteSaque() {
		return limiteSaque;
	}

	public boolean sacar(double valor) {
		
		double novoValor = valor + taxaJuros;

		if (novoValor <= saldo && valor <= limiteSaque) {
			super.saldo -= novoValor;
			return true;
			
		} else {
			return false;
		}
	}

	public  boolean depositar(double valor) {
		
		if (valor > 0) {
			super.saldo += valor;
			return true;
			
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "ID = " + ID + ", Número = " + numero + ", Saldo = " + saldo + ", Titular = " + titular + ", Tipo = " + tipo;
	}
	
}


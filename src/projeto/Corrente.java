package projeto;

public class Corrente extends Conta {
	double taxaJuros;
	double limiteSaque;
	
	Corrente(){	
	}
	
	public Corrente(int id, int numero, double saldo, String tipo, Data dataAbertura, double taxaJuros,
			double limiteSaque) {
		super(id, numero, saldo, tipo, dataAbertura);
		this.taxaJuros = taxaJuros;
		this.limiteSaque = limiteSaque;
	}
	
	public double getTaxaJuros() {
		return taxaJuros;
	}

	public void setTaxaJuros(double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}

	public double getLimiteSaque() {
		return limiteSaque;
	}

	public void setLimiteSaque(double limiteSaque) {
		this.limiteSaque = limiteSaque;
	}

	public boolean sacar(double valor) {

		if (valor <= saldo) {
			super.saldo -= valor;
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


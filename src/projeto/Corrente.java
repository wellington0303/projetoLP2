package projeto;

public class Corrente extends Conta{
	private double taxaJuros;
	private double limiteSaque;
	
	Corrente(){	
	}
	
	public Corrente(int id, Data dataAbertura) {
		super(id, dataAbertura);
		this.taxaJuros = 5;
		this.limiteSaque = 1000;
	}
	
	public double getTaxaJuros() {
		return taxaJuros;
	}

	public double getLimiteSaque() {
		return limiteSaque;
	}
	@Override
	public void sacar(double valor) {
		
		double novoValor = valor + taxaJuros;

		if (novoValor <= saldo && valor <= limiteSaque) {
			super.saldo -= novoValor;
			System.out.println("Saque realizado com sucesso! Novo saldo: " + saldo);
			
		} else {
			System.out.println("Não foi possível realizar o saque!");
		}
	}
	@Override
	public void depositar(double valor) {
		
		if (valor > 0) {
			super.saldo += valor;
			System.out.println("Depósito realizado com sucesso! Novo saldo: " + saldo);
			
		} else {
			System.out.println("Não foi possível realizar o saque! O valor inserido é inválido");
		}
	}

	@Override
	public String toString() {
		return "ID = " + ID + ", Saldo = " + saldo + ", Titular = " + titular;
	}
	
}


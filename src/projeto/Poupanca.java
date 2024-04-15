package projeto;

public class Poupanca extends Conta {
	private double taxaJuros;
	private double vencimentoJuros;
	private double jurosAcumulados;
	private Data data; 
	
	Poupanca(){
	}
	
	public boolean sacar(double valor) {
		if (super.VerificarSaldo(valor)){
			super.saldo -= valor;
			return true;
		}else {
			return false;
		}
	}
	
	public boolean depositar(double valor) {
		try {
			super.saldo += valor;
			return true;
			
		}catch(Exception e) {
			return false;
		}
	}
	
	public double calcularJuros(Data dataAtual) {
		return 0;
	}
}



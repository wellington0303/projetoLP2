package projeto;

public class Poupanca extends Conta {
	private double taxaJuros;
	private double vencimentoJuros;
	private double jurosAcumulados;
	private Data data; 
	
	Poupanca(){
	}
	
	public boolean Sacar(double valor) {
		if (super.VerificarSaldo(valor)){
			super.saldo -= valor;
			return true;
		}else {
			return false;
		}
	}
	
	public  boolean Depositar(double valor) {
		try {
			super.saldo += valor;
			return true;
			
		}catch(Exception e) {
			return false;
		}
	}
}



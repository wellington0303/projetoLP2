package projeto;

public class Corrente extends Conta {
	double taxaJuros;
	double limiteSaque;
	
	Corrente(){
		
	}
	
	public boolean sacar(double valor) {
		if (super.VerificarSaldo(valor)){
			super.saldo -= valor;
			return true;
		}else {
			return false;
		}
	}
	
	public  boolean depositar(double valor) {
		try {
			super.saldo += valor;
			return true;
		}catch(Exception e) {
			return false;
		}
	}
	
}


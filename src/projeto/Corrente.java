package projeto;

public class Corrente extends Conta {
	double taxaDeJuros;
	double limiteSaque;
	
	Corrente(){
		
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
	public boolean Transferir(double valor) {  /* tenho que receber um objeto para transferencia, e esse objeto pode ser localizado pelo id. mas n da pra localizar dentro de outro objeto é necessario criar uma rotina de retirar o valor de uma conta e adicionar em outra*/
		
	}
}


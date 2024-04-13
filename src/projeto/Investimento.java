package projeto;

public class Investimento extends Conta{
	private String tipo;
	private double valor;
	private Data dataVencimento;
	private double jurosAcumulados;
	
	Investimento(){
		
	}
	public boolean Investir(double valor) {
		if (super.VerificarSaldo(valor)){
			super.saldo -= valor;
			return true;
		}else {
			return false;
		}
	}
	public  boolean Resgatar(double valor) {
		try {
			super.saldo += valor;
			return true;
			
		}catch(Exception e) {
			return false;
		}
	}
	
	/*public boolean CalcularJuros() {//
		
		
	}*/
	
}

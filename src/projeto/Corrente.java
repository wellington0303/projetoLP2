package projeto;

public class Corrente extends Conta {
	double taxaJuros;
	double limiteSaque;
	
	Corrente(){
		
	}
	
	
	
	public Corrente(int id, int numero, double saldo, Cliente titular, String tipo, Data dataAbertura, double taxaJuros,
			double limiteSaque) {
		super(id, numero, saldo, titular, tipo, dataAbertura);
		this.taxaJuros = taxaJuros;
		this.limiteSaque = limiteSaque;
	}
	
	
	public Corrente(int id, int numero, double saldo, Cliente titular, String tipo, double taxaJuros,
			double limiteSaque) {
		super(id, numero, saldo, titular, tipo);
		this.taxaJuros = taxaJuros;
		this.limiteSaque = limiteSaque;
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
		
		System.out.println("Saldo: " + saldo);
		
		saldo += valor;
		
		System.out.println("Saldo: " + saldo);
		
		return true;
		
		
		/*try {
			super.saldo += valor;
			return true;
		}catch(Exception e) {
			return false;
		}*/
	}
	
}


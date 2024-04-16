package projeto;

public class Investimento extends Conta{
	private double valor;
	private Data dataVencimento;
	private double jurosAcumulados;
	
	Investimento(){
		
	}
	
	
	
	public Investimento(int id, int numero, double saldo, Cliente titular, String tipo, double valor, double jurosAcumulados) {
		super(id, numero, saldo, titular, tipo);
		this.valor = valor;
		this.jurosAcumulados = jurosAcumulados;
	}



	public boolean investir(double valor) {
		if (super.VerificarSaldo(valor)){
			super.saldo -= valor;
			return true;
		}else {
			return false;
		}
	}
	public  boolean resgatar(double valor) {
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

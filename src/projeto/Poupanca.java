package projeto;

public class Poupanca extends Conta {
	private double taxaJuros;
	private double rendimentoMensal;
	private double limiteSaque;

	public Poupanca(){
	}
	
	public Poupanca(int id, Data dataAbertura) {
		super(id, dataAbertura);
		this.taxaJuros = 10;
		this.rendimentoMensal = 0.5;
		this.limiteSaque = 800;
	}

	public double getTaxaJuros() {
		return taxaJuros;
	}

	public double getRendimentoMensal() {
		return rendimentoMensal;
	}

	public double getLimiteSaque() {
		return limiteSaque;
	}
	@Override
	public void sacar(double valor) {
		
		double valorSaque = valor + taxaJuros;
		
		if (valorSaque <= saldo && valor <= limiteSaque){	
			super.saldo -= valorSaque;
			System.out.println("Saque realizado com sucesso! Novo saldo: " + saldo);
			
		}else {
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

	public double calcularJuros() {
		
		Data data = new Data();
		data.infoData();
		
		int data1 = super.dataAbertura.getDia() + (super.dataAbertura.getMes() * 30) + (super.dataAbertura.getAno() * 365);
		int data2 = data.getDia() + (data.getMes() * 30) + (data.getAno()* 365);
		
		int quantidadeDias = data2 - data1;
		
		if (quantidadeDias<= 0) {	 
			return 0;
			
		} else {
			 double rendimentoDiario = (Math.pow(1 + rendimentoMensal, 1.0 / 30) - 1)/100;
			 return saldo * (rendimentoDiario*quantidadeDias);
		}				   
		
	}	
	
	@Override
	public String toString() {
		return "ID = " + ID + ", Saldo = " + saldo + ", Titular = " + titular;
	}
}



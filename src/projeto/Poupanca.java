package projeto;

import java.util.Scanner;

public class Poupanca extends Conta {
	private double taxaJuros;
	private double rendimentoMensal;
	private double jurosAcumulados;
	double limiteSaque;
	private Data data; 
	
	public Poupanca(){
	}
	
	public Poupanca(int id, double saldo, Data dataAbertura) {
		super(id, saldo, dataAbertura);
		this.taxaJuros = 10;
		this.rendimentoMensal = 0.5;
		this.jurosAcumulados = 0;
		this.limiteSaque = 800;
		this.data = new Data();
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

	public Data getData() {
		return data;
	}

	public boolean sacar(double valor) {
		
		double valorSaque = valor + taxaJuros;
		
		if (valorSaque <= saldo && valor <= limiteSaque){	
			super.saldo -= valorSaque;
			return true;
			
		}else {
			return false;
		}
	}
	
	public boolean depositar(double valor) {
		
		if (valor > 0) {
			super.saldo += valor;
			return true;
			
		} else {
			return false;
		}
	}
	
	public double calcularJuros(Scanner sc_num) {
	
		data.infoData(sc_num);
		
		int data1 = super.dataAbertura.getDia() + (super.dataAbertura.getMes() * 30) + (super.dataAbertura.getAno() * 365);
		int data2 = data.getDia() + (data.getMes() * 30) + (data.getAno()* 365);
		
		int quantidadeDias = data2 - data1;
		
		if (quantidadeDias<= 0) {	 
			return 0;
			
		} else {
			 double rendimentoDiario = (Math.pow(1 + rendimentoMensal, 1.0 / 30) - 1)/100;
			    
			    double saldoFinal = saldo * (1 + rendimentoDiario*quantidadeDias);
			    		    
			    this.jurosAcumulados = saldoFinal - saldo;
			    
			    return jurosAcumulados;
		}				   
		
	}	
	
	@Override
	public String toString() {
		return "ID = " + ID + ", Saldo = " + saldo + ", Titular = " + titular;
	}
}



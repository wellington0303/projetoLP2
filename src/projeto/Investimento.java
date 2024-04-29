package projeto;

import java.util.Scanner;

public class Investimento extends Conta{
	private double taxaJuros;
	private double rendimentoMensal;
	private Data data;
	private double jurosAcumulados;
	
	public Investimento(){		
	}
	
	public Investimento(int id, Data dataAbertura) {
		super(id, dataAbertura);
		this.taxaJuros = 15;
		this.rendimentoMensal = 1;
		this.jurosAcumulados = 0;
		this.data = new Data();
	}
	
	public double getTaxaJuros() {
		return taxaJuros;
	}

	public double getRendimentoMensal() {
		return rendimentoMensal;
	}

	public Data getData() {
		return data;
	}

	public boolean investir(double valor) {
	
		if (valor > 0) {
			super.saldo += valor;
			return true;
			
		} else {
			return false;
		}
	}
		
	public  boolean resgatar(double valor) {
		
		double novoValor = valor + taxaJuros;

		if (novoValor <= saldo) {
			super.saldo -= novoValor;
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
			    
			 this.jurosAcumulados = saldo * (rendimentoDiario*quantidadeDias);    

			  return jurosAcumulados;
		}
			
	}
	
	@Override
	public String toString() {
		return "ID = " + ID + ", Saldo = " + saldo + ", Titular = " + titular;
	}
	
}

package projeto;

import java.util.Scanner;

public class Data {
	private int dia;
	private int mes;
	private int ano;
	
	public Data(){
	}
	
	public Data(int dia, int mes, int ano) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	public int getDia() {
		return dia;
	}

	public int getMes() {
		return mes;
	}

	public int getAno() {
		return ano;
	}

	public void infoData(Scanner scan) {	
		System.out.println("Informe o dia: ");
		this.dia = scan.nextInt();
		
		System.out.println("Informe o mês: ");
		this.mes = scan.nextInt();
		
		System.out.println("Informe o ano: ");
		this.ano = scan.nextInt();
		
	}

}	


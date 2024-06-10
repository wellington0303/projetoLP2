package projeto;

import java.util.Scanner;

public class Data {
	private int dia;
	private int mes;
	private int ano;
	
	Scanner scan = new Scanner(System.in);
	 
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

	public void infoData() {				
		do {
			System.out.println("Informe o dia: ");
			this.dia = scan.nextInt();
			
			System.out.println("Informe o mês: ");
			this.mes = scan.nextInt();
			
			System.out.println("Informe o ano: ");
			this.ano = scan.nextInt();
			
		} while(!validarData(dia, mes, ano));	

	}
	
	public boolean validarData(int dia, int mes, int ano) {
		 if (ano < 1) {
			 	System.out.println("Ano inválido");
	            return false; 
	        }

	        if (mes < 1 || mes > 12) {
	        	System.out.println("Mês inválido");
	            return false; 
	        }

	        if (dia < 1) {
	        	System.out.println("Dia inválido");
	            return false; 
	        }

	        boolean bissexto = (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);

	        switch (mes) {
	            case 2:
	                if (bissexto) {
	                    if (dia > 29) {
	                    	System.out.println("Dia inválido");
	                        return false;
	                    }
	                } else {
	                    if (dia > 28) {
	                    	System.out.println("Dia inválido");
	                        return false; 
	                    }
	                }
	                break;
	            case 4: case 6: case 9: case 11:
	                if (dia > 30) {
	                	System.out.println("Dia inválido");
	                    return false; 
	                }
	                break;
	            default:
	                if (dia > 31) {
	                	System.out.println("Dia inválido");
	                    return false;
	                }
	        }

	        return true;      	        
	}
	
	public void imprimirData() {
		System.out.println("Data de abertura: " + dia + "/" + mes + "/" + ano);
	}
	
}
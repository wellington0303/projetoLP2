package projeto;
import java.util.Scanner;

public class Data {
	private int dia;
	private int mes;
	private int ano;
	
	Data(){
		
	}
	
	public Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	public void informarData() {
		Scanner scan = new Scanner(System.in);
		System.out.println("informe o dia;");
		this.dia = scan.nextInt();
		System.out.println("informe o mes;");
		this.mes = scan.nextInt();
		System.out.println("informe o ano;");
		this.ano = scan.nextInt();
		
		scan.close();
	}
	
	/**
	 * 
	 * @return um vetor com de tamanho 3 com dia, mes e ano respectivamente.
	 */
	public int[] getData() {
		return new int[] {this.dia, this.mes, this.ano};
	}
}

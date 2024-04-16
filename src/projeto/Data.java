package projeto;
import java.util.Scanner;

public class Data {
	private int dia;
	private int mes;
	private int ano;
	
	Data(){
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
		Scanner scan = new Scanner(System.in);
		System.out.println("informe o dia;");
		this.dia = scan.nextInt();
		System.out.println("informe o mes;");
		this.mes = scan.nextInt();
		System.out.println("informe o ano;");
		this.ano = scan.nextInt();
		
		scan.close();
	}
}

package projeto;

import java.util.Scanner;

public class Main {
	
	public static void menuCorrente() {
		System.out.println("SELECIONE A OPÇÃO: ");
		System.out.println("1 - Criar conta");
		System.out.println("2 - Fechar conta");
		System.out.println("3 - Atualizar endereço");
		System.out.println("4 - Atualizar telefone");
		System.out.println("5 - Atualizar email");
		System.out.println("6 - Atualizar renda");
		System.out.println("7 - Verificar saldo");
		System.out.println("8 - Realizar depósito");
		System.out.println("9 - Realizar saque");
		System.out.println("10 - Realizar transferência");
		System.out.println("0 - FINALIZAR OPERAÇÕES");

	}

	public static void menuPoupança() {
		System.out.println("SELECIONE A OPÇÃO: ");
		System.out.println("1 - Criar conta");
		System.out.println("2 - Fechar conta");
		System.out.println("3 - Atualizar endereço");
		System.out.println("4 - Atualizar telefone");
		System.out.println("5 - Atualizar email");
		System.out.println("6 - Atualizar renda");
		System.out.println("7 - Verificar saldo");
		System.out.println("8 - Realizar depósito");
		System.out.println("9 - Realizar saque");
		System.out.println("10 - Calcular juros acumulados");
		System.out.println("0 - FINALIZAR OPERAÇÕES");
	}

	public static void menuInvestimento() {
		System.out.println("SELECIONE A OPÇÃO: ");
		System.out.println("1 - Criar conta");
		System.out.println("2 - Fechar conta");
		System.out.println("3 - Atualizar endereço");
		System.out.println("4 - Atualizar telefone");
		System.out.println("5 - Atualizar email");
		System.out.println("6 - Atualizar renda");
		System.out.println("7 - Verificar saldo");
		System.out.println("8 - Investir");
		System.out.println("9 - Resgatar");
		System.out.println("10 - Calcular juros acumulados");
		System.out.println("0 - FINALIZAR OPERAÇÕES");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner sc_num = new Scanner(System.in);
		
		System.out.println("Olá cliente! Para começar, digite o tipo de conta (C - corrente | P - poupança | I - Investimento)");
		char tipoConta = sc.nextLine().toUpperCase().charAt(0);
		
		int op = 0;
		
		do {
			
			switch (tipoConta) {
			
			case 'C': 
				menuCorrente();
				op = sc_num.nextInt();
				break;
				
			case 'P':
				menuPoupança();
				op = sc_num.nextInt();
				break;
				
			case 'I':
				menuInvestimento();
				op = sc_num.nextInt();
				break;
			
			default:
				System.out.println("Tipo de conta inválido.");
			} 
		
		} while (op != 0); 			
		
		sc.close();
		sc_num.close();
	}

}

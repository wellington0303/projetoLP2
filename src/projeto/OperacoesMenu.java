package projeto;

import java.util.Scanner;

public class OperacoesMenu {
		
	public void menu() {
		System.out.println("SELECIONE A OPÇÃO: ");
		System.out.println("1 - Cadastrar cliente");
		System.out.println("2 - Criar conta");
		System.out.println("3 - Fechar conta");
		System.out.println("4 - Atualizar endereço");
		System.out.println("5 - Atualizar telefone");
		System.out.println("6 - Atualizar email");
		System.out.println("7 - Atualizar renda");
		System.out.println("8 - Verificar saldo");
		System.out.println("9 - Realizar depósito (Corrente ou Poupança)");
		System.out.println("10 - Realizar saque (Corrente ou Poupança)");
		System.out.println("11 - Calcular juros acumulados (Poupança ou Investimento)");
		System.out.println("12 - Investir (Investimento)");
		System.out.println("13 - Resgatar (Investimento)");
		System.out.println("14 - Imprimir lista de clientes");
		System.out.println("0 - FINALIZAR OPERAÇÕES");
	}
	
	public int selecaoID (Conta [] listaConta, Scanner sc_num) {
		
		for (int i = 0; i< listaConta.length; i++) {
			
			if (listaConta[i] != null && listaConta[i].titular != null) {
				System.out.println("ID CONTA: " + listaConta[i].getID() + " | NOME CLIENTE: " + listaConta[i].titular.getNome());           
			} 
		}
		
		System.out.println("Digite o ID da conta: ");	
		int idSelecionado = sc_num.nextInt();
		
		idSelecionado --;
		
		while (listaConta[idSelecionado] == null) {
			
			System.out.println("ID INVÁLIDO! Digite um novo valor: ");	
			idSelecionado = sc_num.nextInt();
			
			idSelecionado --;		
		}
		
		return idSelecionado;	
	}
		
	public void imprimirListaCLientes (Conta [] listaConta) {
		
		System.out.println("------------------------------------------------------------");
		System.out.println("LISTA DE CLIENTES: ");
		System.out.println();
		
		for(int i = 0; i < listaConta.length; i++) {		
			if (listaConta[i] != null && listaConta[i].titular.getNome() != null) {
				listaConta[i].titular.imprimirCliente();
				System.out.println();           
			}							
		}		
		System.out.println("------------------------------------------------------------");
	}
		
	public boolean criarConta(Conta [] listaConta, int idControle, char tipo, Data data) {  		
		
		if (tipo == 'C') {
			Corrente novaConta = new Corrente(idControle+1, 0, data);
			listaConta[idControle] = novaConta;
			return true;
			
		} else if (tipo == 'P') {			
			Poupanca novaConta = new Poupanca(idControle+1, 0, data);
			listaConta[idControle] = novaConta;
			return true;
			
		} else if (tipo == 'I') {
			Investimento novaConta = new Investimento(idControle+1, 0, data);
			listaConta[idControle] = novaConta;
			return true;
		}		
		else {
			return false;
		}	
	}
		
	public boolean fecharConta(Conta [] listaConta, int idSelecionado) { 
		
		if (listaConta[idSelecionado] != null) {	
			
			for (int i = idSelecionado; i < listaConta.length-1; i++) {
				
				listaConta[i] = listaConta[i+1];
				if (listaConta[i] != null) {
					listaConta[i].setID(i+1);		
					if (listaConta[i].titular.getNome() != null) {
						listaConta[i].titular.setID(i+1);
					}			
				}				
			}			
			return true;
			
		} else{
			return false;
		}
	}
		
}

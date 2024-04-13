package projeto;

import java.util.Scanner;

public class Main {
	
	public static void menu() {
		System.out.println("OLÁ CLIENTE, PARA COMEÇAR, SELECIONE A OPÇÃO: ");
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
		System.out.println("11 - Realizar transferência (Corrente)");
		System.out.println("12 - Calcular juros acumulados (Poupança ou Investimento)");
		System.out.println("13 - Investir (Investimento)");
		System.out.println("14 - Resgatar (Investimento)");
		System.out.println("0 - FINALIZAR OPERAÇÕES");
	}
	
	public static int selecaoID (Cliente [] listaClientes, int quantidadeClientes, Scanner sc) {
		for (int i = 0; i< quantidadeClientes; i++) {
			if (listaClientes != null) {
				System.out.println("ID CLIENTE: " + listaClientes[i].getID() + " | NOME CLIENTE: " + listaClientes[i].getNome());
			}
		}
		
		System.out.println("Digite o ID do cliente: ");	
		int idSelecionado = sc.nextInt();
		
		idSelecionado --;
		
		return idSelecionado;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner sc_num = new Scanner(System.in);
		
		int quantidadeClientes = 100; 
		Cliente [] listaClientes = new Cliente[quantidadeClientes];
	
		int op;
		int idControle = 0;
		
		do {
			
			menu();
			op = sc_num.nextInt();
			
			switch(op) {
			
				case 0:
					System.out.println("OBRIGADO POR UTILIZAR NOSSOS SERVIÇOS! ATENDIMENTO ENCERRADO");
					break;
					
				case 1: 
					int novoID = idControle + 1;
					
					System.out.println("Digite o nome: ");
					String nome = sc.nextLine();
					
					/* System.out.println("Digite o endereço: ");
					String endereço = sc.nextLine(); */
					
					System.out.println("Digite o telefone: ");
					String telefone = sc.nextLine();
					
					System.out.println("Digite o email: ");
					String email = sc.nextLine();
					
					System.out.println("Digite a identidade: ");
					int identidade = sc_num.nextInt();
					
					System.out.println("Digite o rg: ");
					int rg = sc_num.nextInt();
					
					System.out.println("Digite a renda: ");
					double renda = sc_num.nextDouble();
				
					listaClientes[idControle] = new Cliente(); // modificar para o construtor criado
					
					idControle ++;	
					
					break;
					
				case 2:
					
					System.out.println("2 - Criar conta");	
					
					//limitado ao escopo de "case 2:"
					int idSelecionado = selecaoID(listaClientes, quantidadeClientes, sc_num);
					
					
					if (listaClientes[idSelecionado] != null) {
						
					} else {
						System.out.println("Id não cadastrado!");
					}
					
					break;
						
				case 3:
					
					System.out.println("3 - Fechar conta");
					
					
					idSelecionado = selecaoID(listaClientes, quantidadeClientes, sc_num);
					
					
					if (listaClientes[idSelecionado] != null) {
						
					} else {
						System.out.println("Id não cadastrado!");
					}
					
					
					break;
						
				case 4:
					
					System.out.println("4 - Atualizar endereço");
					
					idSelecionado = selecaoID(listaClientes, quantidadeClientes, sc_num);
					
					
					if (listaClientes[idSelecionado] != null) {
						
						
					} else {
						System.out.println("Id não cadastrado!");
					}
					
					break;
						
				case 5:
					
					System.out.println("5 - Atualizar telefone");
					
					idSelecionado = selecaoID(listaClientes, quantidadeClientes, sc_num);
					
					
					if (listaClientes[idSelecionado] != null) {		
						System.out.println("Digite o telefone: ");
						telefone = sc.nextLine();
						
						listaClientes[idSelecionado].setTelefone(telefone);	
						
						System.out.println("Operação realizada!");
						
					} else {
						System.out.println("Id não cadastrado!");
					}
									
					break;
						
				case 6:
					
					System.out.println("6 - Atualizar email");
					
					idSelecionado = selecaoID(listaClientes, quantidadeClientes, sc_num);
					
					
					if (listaClientes[idSelecionado] != null) {
						System.out.println("Digite o email: ");
						email = sc.nextLine();
						
						listaClientes[idSelecionado].setEmail(email);	
						
						System.out.println("Operação realizada!");
									
					} else {
						System.out.println("Id não cadastrado!");
					}
					
					break;
						
				case 7:
					
					System.out.println("7 - Atualizar renda");
					
					idSelecionado = selecaoID(listaClientes, quantidadeClientes, sc_num);
					
					
					if (listaClientes[idSelecionado] != null) {
						
						System.out.println("Digite a renda: ");
						renda = sc_num.nextDouble();
						
						listaClientes[idSelecionado].setRenda(renda);
						
						System.out.println("Operação realizada!");
						
					} else {
						System.out.println("Id não cadastrado!");
					}
					
					break;
						
				case 8:
					
					System.out.println("8 - Verificar saldo");
					
					idSelecionado = selecaoID(listaClientes, quantidadeClientes, sc_num);
					
					
					if (listaClientes[idSelecionado] != null) {
						
					} else {
						System.out.println("Id não cadastrado!");
					}
					
					break;
						
				case 9:
					
					System.out.println("9 - Realizar depósito (Corrente ou Poupança)");
					
					
					
					System.out.println("Digite o tipo de conta (C - corrente | P - poupança)");
					char tipoConta = sc.nextLine().toUpperCase().charAt(0);
					
					
					
					idSelecionado = selecaoID(listaClientes, quantidadeClientes, sc_num);
					
					
					if (listaClientes[idSelecionado] != null) {
						
					} else {
						System.out.println("Id não cadastrado!");
					}
					
					break;
						
				case 10:
					
					System.out.println("10 - Realizar saque (Corrente ou Poupança)");
					
					
					System.out.println("Digite o tipo de conta (C - corrente | P - poupança)");
					tipoConta = sc.nextLine().toUpperCase().charAt(0);
					
					idSelecionado = selecaoID(listaClientes, quantidadeClientes, sc_num);
					
					
					if (listaClientes[idSelecionado] != null) {
						
					} else {
						System.out.println("Id não cadastrado!");
					}
					
					break;
						
				case 11:
					
					System.out.println("11 - Realizar transferência (Corrente)");
					
					
					idSelecionado = selecaoID(listaClientes, quantidadeClientes, sc_num);
					
					
					if (listaClientes[idSelecionado] != null) {
						
					} else {
						System.out.println("Id não cadastrado!");
					}
					
					
					break;
						
				case 12:
					
					System.out.println("12 - Calcular juros acumulados (Poupança ou Investimento)");
					
					System.out.println("Digite o tipo de conta (P - poupança | I - Investimento)");
					tipoConta = sc.nextLine().toUpperCase().charAt(0);
					
					
					idSelecionado = selecaoID(listaClientes, quantidadeClientes, sc_num);
					
					
					if (listaClientes[idSelecionado] != null) {
						
					} else {
						System.out.println("Id não cadastrado!");
					}
					
					break;
						
				case 13:
					

					System.out.println("13 - Investir (Investimento)");
					
					idSelecionado = selecaoID(listaClientes, quantidadeClientes, sc_num);
					
					
					if (listaClientes[idSelecionado] != null) {
						
					} else {
						System.out.println("Id não cadastrado!");
					}
					
					break;
						
					
				case 14:
					
					System.out.println("14 - Resgatar (Investimento)");
					
					idSelecionado = selecaoID(listaClientes, quantidadeClientes, sc_num);
					
					
					if (listaClientes[idSelecionado] != null) {
						
					} else {
						System.out.println("Id não cadastrado!");
					}
					
					
					break;
						
				default:
					System.out.println("OPERAÇÃO INVÁLIDA, ESCOLHA NOVAMENTE");
					break;
			} 
			
			
			
			
			
				
			
		
		} while (op != 0); 		
		
		
		
		
		
		
		
		
		
		sc.close();
		sc_num.close();
	}

}

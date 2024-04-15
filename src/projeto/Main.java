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
		
		while (listaClientes[idSelecionado] == null) {
			
			System.out.println("ID INVÁLIDO! Digite um novo valor: ");	
			idSelecionado = sc.nextInt();
			
			idSelecionado --;
			
		}
		return idSelecionado;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Scanner sc_num = new Scanner(System.in);
		
		int quantidadeClientes = 100; 
		Cliente [] listaClientes = new Cliente[quantidadeClientes];
	
		int op, idSelecionado;
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
					
					Endereco endereco = new Endereco();
					endereco.cadastrarEndereco();
									
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
					
					boolean statusConta = false;
				
					listaClientes[idControle] = new Cliente(novoID, nome, endereco, telefone, email, identidade, rg, renda, statusConta); 
					
					idControle ++;	
					
					break;
					
				case 2:
					
					idSelecionado = selecaoID(listaClientes, quantidadeClientes, sc_num);
					
					if (listaClientes[idSelecionado].criarConta()) {
						System.out.println("Operação realizada com sucesso!");
					
					} else {
						System.out.println("Não foi possível criar a conta!");
						
					}				
					
					break;
						
				case 3:
										
					idSelecionado = selecaoID(listaClientes, quantidadeClientes, sc_num);
					
					if (listaClientes[idSelecionado].fecharConta()) {
						System.out.println("Operação realizada com sucesso!");
					
					} else {
						System.out.println("Não foi possível fechar a conta!");
						
					}	
					
					break;
							
				case 4:
					
					idSelecionado = selecaoID(listaClientes, quantidadeClientes, sc_num);
					
					listaClientes[idSelecionado].cadastrarEndereco();
					
					System.out.println("Operação realizada com sucesso!");				
					
					break;
						
				case 5:
					
					idSelecionado = selecaoID(listaClientes, quantidadeClientes, sc_num);
					
					System.out.println("Digite o telefone: ");
					telefone = sc.nextLine();
					
					if (listaClientes[idSelecionado].atualizarTelefone(telefone)) {
						System.out.println("Operação realizada com sucesso!");
					
					} else {
						System.out.println("Não foi possível atualizar o telefone!");
						
					}				
								
					break;
						
				case 6:
					
					idSelecionado = selecaoID(listaClientes, quantidadeClientes, sc_num);
					
					System.out.println("Digite o email: ");
					email = sc.nextLine();
					
					if (listaClientes[idSelecionado].atualizarEmail(email)) {
						System.out.println("Operação realizada com sucesso!");
					
					} else {
						System.out.println("Não foi possível atualizar o email");
						
					}	
					
					break; 
					
				case 7:
					
					idSelecionado = selecaoID(listaClientes, quantidadeClientes, sc_num);
					
					System.out.println("Digite a renda: ");
					renda = sc_num.nextDouble();
					
					if (listaClientes[idSelecionado].atualizarRenda(renda)) {
						System.out.println("Operação realizada com sucesso!");
					
					} else {
						System.out.println("Não foi possível atualizar a renda");
						
					}	
					
					break; 
											
					/* case 8:
					
					System.out.println("8 - Verificar saldo");
					
					idSelecionado = selecaoID(listaClientes, quantidadeClientes, sc_num);
					
					break; */
						
					/* case 9:
					
					System.out.println("9 - Realizar depósito (Corrente ou Poupança)");
					
					
					
					System.out.println("Digite o tipo de conta (C - corrente | P - poupança)");
					char tipoConta = sc.nextLine().toUpperCase().charAt(0);
					
					
					
					idSelecionado = selecaoID(listaClientes, quantidadeClientes, sc_num);
					
					break; */
						
					/* case 10:
					
					System.out.println("10 - Realizar saque (Corrente ou Poupança)");
					
					
					System.out.println("Digite o tipo de conta (C - corrente | P - poupança)");
					tipoConta = sc.nextLine().toUpperCase().charAt(0);
					
					idSelecionado = selecaoID(listaClientes, quantidadeClientes, sc_num);
					
					break; */
						
					/* case 11:
					
					System.out.println("11 - Realizar transferência (Corrente)");
					
					
					idSelecionado = selecaoID(listaClientes, quantidadeClientes, sc_num);
					
					
					break; */
						
					/* case 12:
					
					System.out.println("12 - Calcular juros acumulados (Poupança ou Investimento)");
					
					System.out.println("Digite o tipo de conta (P - poupança | I - Investimento)");
					tipoConta = sc.nextLine().toUpperCase().charAt(0);
					
					
					idSelecionado = selecaoID(listaClientes, quantidadeClientes, sc_num);
					
					break; */
						
					/* case 13:
					

					System.out.println("13 - Investir (Investimento)");
					
					idSelecionado = selecaoID(listaClientes, quantidadeClientes, sc_num);
					
					break; */
						
					
					/* case 14:
					
					System.out.println("14 - Resgatar (Investimento)");
					
					idSelecionado = selecaoID(listaClientes, quantidadeClientes, sc_num);
					
					
					break; */
						
				default:
					
					System.out.println("OPERAÇÃO INVÁLIDA, ESCOLHA NOVAMENTE");
					break;
			} 
			
		} while (op != 0); 		
				
		sc.close();
		sc_num.close();
	}

}

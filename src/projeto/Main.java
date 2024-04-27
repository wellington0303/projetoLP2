package projeto;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Scanner sc_num = new Scanner(System.in);
		
		int op, idSelecionado = 0, idControle = 0, quantidadeClientes = 100; 
		boolean operacao = false;
		OperacoesMenu opcoes = new OperacoesMenu();
		
		Cliente [] listaClientes = new Cliente[quantidadeClientes];
		Conta [] listaContas = new Conta[quantidadeClientes];
		
		do {
			
			opcoes.menu();
			op = sc_num.nextInt();
				
			if (op != 0 && op != 1 && op<14) {
				idSelecionado = opcoes.selecaoID(listaClientes, quantidadeClientes, sc_num);
			}
			
			
			switch(op) {
			
				case 0:
					
					System.out.println("OBRIGADO POR UTILIZAR NOSSOS SERVIÇOS! ATENDIMENTO ENCERRADO");
					break;
					
				case 1: 
					
					listaClientes[idControle] = new Cliente();
					listaClientes[idControle] = listaClientes[idControle].cadastrarCliente(idControle, sc, sc_num);				
					System.out.println("Operação realizada com sucesso!");
					
					idControle ++;	
					
					break; 
					
				case 2:
					
					if (listaClientes[idSelecionado].criarConta(idSelecionado, listaContas)) {
						System.out.println("Operação realizada com sucesso!");
					} else {
						System.out.println("Não foi possível criar a conta!");			
					}						
					break;
						
				case 3:				
			
					if (listaClientes[idSelecionado].fecharConta(idSelecionado, listaContas)) {
						System.out.println("Operação realizada com sucesso!");			
					} else {
						System.out.println("Não foi possível fechar a conta!");				
					}					
					break;
							
				case 4:
					
					listaClientes[idSelecionado].cadastrarEndereco(sc, sc_num);
					System.out.println("Operação realizada com sucesso!");						
					break;
						
				case 5:
					
					System.out.println("Digite o telefone: ");
					String telefone = sc.nextLine();
					
					if (listaClientes[idSelecionado].atualizarTelefone(telefone)) {
						System.out.println("Operação realizada com sucesso!");	
					} else {
						System.out.println("Não foi possível atualizar o telefone!");				
					}												
					break;
						
				case 6:
										
					System.out.println("Digite o email: ");
					String email = sc.nextLine();
					
					if (listaClientes[idSelecionado].atualizarEmail(email)) {
						System.out.println("Operação realizada com sucesso!");	
					} else {
						System.out.println("Não foi possível atualizar o email");				
					}					
					break; 
					
				case 7:
					
					System.out.println("Digite a renda: ");
					double renda = sc_num.nextDouble();
					
					if (listaClientes[idSelecionado].atualizarRenda(renda)) {
						System.out.println("Operação realizada com sucesso!");
					} else {
						System.out.println("Não foi possível atualizar a renda");		
					}				
					break; 
											
				case 8:
														
					double valorSaldo = listaContas[idSelecionado].verificarSaldo();
					System.out.println("O saldo disponível é de " + valorSaldo + " reais.");			
					break;
					
				case 9:
					
					System.out.println("Digite o valor que deseja depositar: ");
					double valorDeposito = sc_num.nextDouble();
					
					if (listaContas[idSelecionado] instanceof Corrente || listaContas[idSelecionado] instanceof Poupanca) {	
						
						if (listaContas[idSelecionado] instanceof Corrente) {
							Corrente lista = (Corrente)listaContas[idSelecionado];
							operacao = lista.depositar(valorDeposito);
						} else {
							Poupanca lista = (Poupanca)listaContas[idSelecionado];
							operacao = lista.depositar(valorDeposito); 	
						}
									
						if (operacao) {
						    System.out.println("Operação realizada com sucesso!");  
						} else {
							System.out.println("Não foi possível realizar o depósito!");
						}
						
					} else {
					    System.out.println("Tipo de conta inválido para depósito!");
					}
					break;
														
				case 10:
					
					System.out.println("Digite o valor que deseja sacar: ");
					double valorSaque = sc_num.nextDouble();
					
					if (listaContas[idSelecionado] instanceof Corrente || listaContas[idSelecionado] instanceof Poupanca) {
										
						if (listaContas[idSelecionado] instanceof Corrente) {
							Corrente lista = (Corrente)listaContas[idSelecionado];
							operacao = lista.sacar(valorSaque);
						} else {
							Poupanca lista = (Poupanca)listaContas[idSelecionado];
							operacao = lista.sacar(valorSaque);
						}
															
						if (operacao) {
						    System.out.println("Operação realizada com sucesso!");   
						} else {
							System.out.println("Não foi possível realizar o depósito!");
						}
						
					} else {
					    System.out.println("Tipo de conta inválido para saque!");
					}
					break; 
					
				case 11:
																
					if (listaContas[idSelecionado] instanceof Investimento || listaContas[idSelecionado] instanceof Poupanca) {
						double valorJuros;
						
						Data dataBase = new Data();
						dataBase.infoData(sc_num);
											    	
					    if (listaContas[idSelecionado] instanceof Investimento) {
							Investimento lista = (Investimento)listaContas[idSelecionado];
							valorJuros = lista.calcularJuros(dataBase);
						} else {
							Poupanca lista = (Poupanca)listaContas[idSelecionado];
							valorJuros = lista.calcularJuros(dataBase);
						}
					    System.out.println("O valor total dos juros até a data indicada é de " + valorJuros + " reais");	        
					    
					} else {
					    System.out.println("Tipo de conta inválido para calcular os juros!");
					}
					break; 
						
				case 12:
					
					System.out.println("Digite o valor que deseja investir: ");
					double valorInvestimento = sc_num.nextDouble();
					
					if (listaContas[idSelecionado] instanceof Investimento) {
						Investimento lista = (Investimento)listaContas[idSelecionado];
						
					    if (lista.investir(valorInvestimento)) {
					        System.out.println("Operação realizada com sucesso!");
					    } else {
					        System.out.println("Não foi possível realizar o investimento!");
					    }
					    
					} else {
					    System.out.println("Tipo de conta inválido para investimento");
					}
					break;

				case 13:
					
					System.out.println("Digite o valor que deseja resgatar: ");
					double valorResgate = sc_num.nextDouble();
									
					if (listaContas[idSelecionado] instanceof Investimento) {
						Investimento lista = (Investimento)listaContas[idSelecionado];
						
					    if (lista.resgatar(valorResgate)) {
					        System.out.println("Operação realizada com sucesso!");     
					    } else {
					        System.out.println("Não foi possível realizar o resgate!");
					    }
					    
					} else {
					    System.out.println("Tipo de conta inválido para o resgate");
					}
					break;
					
				case 14:
					
					opcoes.imprimirListaCLientes(listaClientes, quantidadeClientes);
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

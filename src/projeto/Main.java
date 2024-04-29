package projeto;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Scanner sc_num = new Scanner(System.in);
		
		int op, idSelecionado = 0, idControle = 0, quantidadeClientes = 100; 
		boolean operacao = false;
		OperacoesMenu opcoes = new OperacoesMenu();
		
		Conta [] listaContas = new Conta[quantidadeClientes];
			
		listaContas[0] = new Corrente(1, 0, new Data (1,1,2001));
		listaContas[0].setTitular(new Cliente(1,"Fulano 1", new Endereco("Rua A", 123, "Bairro X", "Cidade Y", "Estado Z", "12345-678"), "123456789", "fulano1@example.com", 123456, 789012, 1000.00));

		listaContas[1] = new Poupanca(2, 0, new Data (1,1,2002));
		listaContas[1].setTitular(new Cliente(2,"Fulano 2", new Endereco("Rua B", 456, "Bairro Y", "Cidade Z", "Estado W", "98765-432"), "987654321", "fulano2@example.com", 654321, 210987, 2000.00));
			
		listaContas[2] = new Investimento(3, 0, new Data (1,1,2003));
		listaContas[2].setTitular(new Cliente(3,"Fulano 3", new Endereco("Rua C", 789, "Bairro Z", "Cidade X", "Estado V", "54321-876"), "135792468", "fulano3@example.com", 246813, 579135, 3000.00));
		
		do {
			
			opcoes.menu();
			op = sc_num.nextInt();
				
			if (op != 0 && op !=2 && op<14 && op != 1) {
				idSelecionado = opcoes.selecaoID(listaContas, sc_num);
			} 
					
			switch(op) {
			
				case 0:
					
					System.out.println("OBRIGADO POR UTILIZAR NOSSOS SERVIÇOS! ATENDIMENTO ENCERRADO");
					break;
									
				case 1: 
					
					if(listaContas[0] == null) {
						System.out.println("É necessário criar uma conta antes de cadastrar o cliente");
						
					} else {				
						
						idSelecionado = opcoes.selecaoID(listaContas, sc_num);
						listaContas[idSelecionado].titular.cadastrarCliente(idSelecionado+1,sc, sc_num);		
						System.out.println("Operação realizada com sucesso!");
					}								
					break;
								
				case 2:
					
					System.out.println("SELECIONE O TIPO: ");
					System.out.println("C - Corrente");
					System.out.println("P - Poupança");
					System.out.println("I - Investimento");
					char tipo = sc.nextLine().toUpperCase().charAt(0);
					
					System.out.println("DIGITE A DATA DE ABERTURA: ");
					Data dataAbertura = new Data();
					dataAbertura.infoData(sc_num);			
										
					if (opcoes.criarConta(listaContas, idControle,tipo, dataAbertura)) {
						System.out.println("Operação realizada com sucesso!");
					} else {
						System.out.println("Não foi possível criar a conta!");			
					}
					idControle ++;					
					break;
						
				case 3:				
			
					if (opcoes.fecharConta(listaContas, idSelecionado)) {
						System.out.println("Operação realizada com sucesso!");			
					} else {
						System.out.println("Não foi possível fechar a conta!");				
					}					
					break;
							 
				case 4:
					
					listaContas[idSelecionado].titular.cadastrarEndereco(sc, sc_num);
					System.out.println("Operação realizada com sucesso!");						
					break;
						
				case 5:
					
					System.out.println("Digite o telefone: ");
					String telefone = sc.nextLine();
					
					listaContas[idSelecionado].titular.atualizarTelefone(telefone);
					break;
						
				case 6:
										
					System.out.println("Digite o email: ");
					String email = sc.nextLine();
					
					listaContas[idSelecionado].titular.atualizarEmail(email);
					break;
					
				case 7:
					
					System.out.println("Digite a renda: ");
					double renda = sc_num.nextDouble();
					
					listaContas[idSelecionado].titular.atualizarRenda(renda);
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
											    	
					    if (listaContas[idSelecionado] instanceof Investimento) {
							Investimento lista = (Investimento)listaContas[idSelecionado];
							valorJuros = lista.calcularJuros(sc_num);
						} else {
							Poupanca lista = (Poupanca)listaContas[idSelecionado];
							valorJuros = lista.calcularJuros(sc_num);
						}
					    System.out.printf("O valor total dos juros até a data indicada é de %.2f reais \n", valorJuros);        
					    
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
					
					opcoes.imprimirListaCLientes(listaContas);
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

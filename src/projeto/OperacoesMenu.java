package projeto;

import java.util.Scanner;

public class OperacoesMenu {

	Scanner sc_num = new Scanner(System.in);

	public void menu() {
		System.out.println("SELECIONE A OPÇÃO: ");
		System.out.println("0 - FINALIZAR OPERAÇÕES");
		System.out.println("1 - Criar conta");
		System.out.println("2 - Cadastrar cliente");
		System.out.println("3 - Fechar conta");
		System.out.println("4 - Buscar conta");
		System.out.println("5 - Atualizar cadastro");
		System.out.println("6 - Verificar saldo");
		System.out.println("7 - Realizar depósito/investimento");
		System.out.println("8 - Realizar saque/resgate");
		System.out.println("9 - Calcular juros acumulados (Poupança ou Investimento)");
		System.out.println("10 - Imprimir lista de clientes");
	}

	public int selecaoID(Conta[] listaConta) {

		System.out.println("Digite o ID da conta: ");
		int idSelecionado = sc_num.nextInt();
		idSelecionado--;
		
		while (idSelecionado < 0 || idSelecionado > listaConta.length) {		
			System.out.println("ID fora dos limites! Digite um novo valor: ");	
			idSelecionado = sc_num.nextInt();
			idSelecionado --;		
		}
		return idSelecionado;
	}

	public void imprimirListaCLientes(Conta[] listaConta) {

		System.out.println("------------------------------------------------------------");
		System.out.println("LISTA DE CLIENTES: ");
		System.out.println();

		for (int i = 0; i < listaConta.length; i++) {
			if (listaConta[i] != null && listaConta[i].titular.getNome() != null) {
				listaConta[i].titular.imprimirCliente();
				listaConta[i].dataAbertura.imprimirData();
				System.out.println();
			}
		}
		System.out.println("------------------------------------------------------------");

	}
	public void criarConta(Conta[] listaConta) {
        System.out.println("SELECIONE O TIPO: \n1 - Corrente \n2 - Poupança \n3 - Investimento");
        int tipo = sc_num.nextInt();
        if (tipo == 1) {
            new Corrente().criarConta(listaConta, tipo);
        } else if (tipo == 2) {
            new Poupanca().criarConta(listaConta, tipo);
        } else if (tipo == 3) {
            new Investimento().criarConta(listaConta, tipo);
        } else {
            System.out.println("Tipo de conta inválido!");
        }
    }

    public void realizarDeposito(Conta[] listaConta, int idSelecionado) {
        System.out.println("Digite o valor que deseja depositar: ");
        double valorDeposito = sc_num.nextDouble();
        listaConta[idSelecionado].depositar(valorDeposito);
    }

    public void realizarSaque(Conta[] listaConta, int idSelecionado) {
        System.out.println("Digite o valor que deseja sacar: ");
        double valorSaque = sc_num.nextDouble();
        listaConta[idSelecionado].sacar(valorSaque);
    }

    public void calcularJuros(Conta[] listaConta, int idSelecionado) {
        if (listaConta[idSelecionado] instanceof Investimento) {
            Investimento lista = (Investimento) listaConta[idSelecionado];
            System.out.printf("O valor total dos juros até a data indicada é de %.2f reais \n", lista.calcularJuros());
        } else if (listaConta[idSelecionado] instanceof Poupanca) {
            Poupanca lista = (Poupanca) listaConta[idSelecionado];
            System.out.printf("O valor total dos juros até a data indicada é de %.2f reais \n", lista.calcularJuros());
        } else {
            System.out.println("Tipo de conta inválido para calcular os juros!");
        }
    }
}

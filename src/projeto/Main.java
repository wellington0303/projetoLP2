package projeto;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc_num = new Scanner(System.in);

		int tamanho = 100, op, idSelecionado = 0;
		Conta[] listaConta = new Conta[tamanho];
		OperacoesMenu opcoes = new OperacoesMenu();

		do {
			opcoes.menu();
			op = sc_num.nextInt();
			if (op > 1 && op < 10) {
				idSelecionado = opcoes.selecaoID(listaConta);
				if (listaConta[idSelecionado] == null) {
					System.out.println("ID não encontrado!");
					continue;
				}
			}
			switch (op) {
			case 0:
				System.out.println("Obrigado por utilizar nossos serviços! Atendimento encerrado");
				break;
			case 1:
				opcoes.criarConta(listaConta);
				break;
			case 2:
				listaConta[idSelecionado].cadastrarCliente(listaConta, idSelecionado);
				break;
			case 3:
				listaConta[idSelecionado].fecharConta(listaConta, idSelecionado);
				break;
			case 4:
				listaConta[idSelecionado].buscarConta(listaConta, idSelecionado);
				break;
			case 5:
				listaConta[idSelecionado].atualizarCadastro(listaConta, idSelecionado);
				break;
			case 6:
				System.out.println("Saldo da conta: " + listaConta[idSelecionado].verificarSaldo());
				break;
			case 7:
				opcoes.realizarDeposito(listaConta, idSelecionado);
				break;
			case 8:
				opcoes.realizarSaque(listaConta, idSelecionado);
				break;
			case 9:
				opcoes.calcularJuros(listaConta, idSelecionado);
				break;
			case 10:
				opcoes.imprimirListaCLientes(listaConta);
				break;
			default:
				System.out.println("Operação inválida, escolha novamente!");
				break;
			}
		} while (op != 0);
		sc_num.close();
	}
}
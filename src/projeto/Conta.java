package projeto;

import java.util.Scanner;

public abstract class Conta implements DataAccessObject {

	protected int ID;
	protected double saldo;
	protected Cliente titular;
	protected Data dataAbertura;
	private static int numeroConta = 0;

	Scanner sc = new Scanner(System.in);
	Scanner sc_num = new Scanner(System.in);

	public Conta() {
	}

	public Conta(int id, Data dataAbertura) {
		super();
		this.ID = id;
		this.saldo = 0;
		this.titular = new Cliente();
		this.dataAbertura = dataAbertura;

	}

	public int getID() {
		return ID;
	}

	public void setID(int ID) {
		this.ID = ID;
	}

	public Cliente getTitular() {
		return titular;
	}

	public Data getDataAbertura() {
		return dataAbertura;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public double verificarSaldo() {
		return saldo;
	}

	public abstract void sacar(double valor);

	public abstract void depositar(double valor);

	@Override
	public void cadastrarCliente(Conta[] listaConta, int idSelecionado) {
		if (listaConta[idSelecionado].titular.getNome() == null) {
			listaConta[idSelecionado].titular.cadastrarCliente();
		} else {
			System.out.println("Já existe um cliente cadastrado nessa conta!");
		}
	}

	@Override
	public void criarConta(Conta[] listaConta, int tipo) {

		System.out.println("Digite a data de abertura: ");
		Data dataAbertura = new Data();
		dataAbertura.infoData();

		if (tipo == 1) {
			Corrente novaConta = new Corrente(numeroConta + 1, dataAbertura);
			listaConta[numeroConta] = novaConta;
			numeroConta++;
			System.out.println("Conta corrente criada!");

		} else if (tipo == 2) {
			Poupanca novaConta = new Poupanca(numeroConta + 1, dataAbertura);
			listaConta[numeroConta] = novaConta;
			numeroConta++;
			System.out.println("Conta poupança criada!");

		} else if (tipo == 3) {
			Investimento novaConta = new Investimento(numeroConta + 1, dataAbertura);
			listaConta[numeroConta] = novaConta;
			numeroConta++;
			System.out.println("Conta investimento criada!");
		} else {
			System.out.println("Tipo de conta inválido!");
		}
	}

	@Override
	public void fecharConta(Conta[] listaConta, int idSelecionado) {
		for (int i = idSelecionado; i < listaConta.length - 1; i++) {
			listaConta[i] = listaConta[i + 1];
			if (listaConta[i] != null) {
				listaConta[i].setID(i + 1);
			}
		}
		numeroConta--;
		System.out.println("Conta fechada!");
	}

	@Override
	public void buscarConta(Conta[] listaConta, int idSelecionado) {
		System.out.println("Conta encontrada:");
		if (listaConta[idSelecionado].titular.getNome() != null) {
			listaConta[idSelecionado].titular.imprimirCliente();
		} 
	}

	@Override
	public void atualizarCadastro(Conta[] listaConta, int idSelecionado) {
		if (listaConta[idSelecionado].titular.getNome() == null) {
			System.out.println("Não existe um cliente cadastrado nessa conta!");
		} else {
			System.out.println("SELECIONE O QUE DESEJA ATUALIZAR: ");
			System.out.println("1 - Endereço");
			System.out.println("2 - Telefone");
			System.out.println("3 - Email");
			int op = sc_num.nextInt();

			if (op == 1) {
				listaConta[idSelecionado].titular.cadastrarEndereco();
			} else if (op == 2) {
				System.out.println("Digite o telefone: ");
				listaConta[idSelecionado].titular.atualizarTelefone(sc.nextLine());
			} else if (op == 3) {
				System.out.println("Digite o email: ");
				listaConta[idSelecionado].titular.atualizarEmail(sc.nextLine());
			} else {
				System.out.println("Operação inválida!");
			}
		}
	}
}

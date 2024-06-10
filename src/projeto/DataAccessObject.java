package projeto;

public interface DataAccessObject {
	public void cadastrarCliente(Conta[] listaConta, int idSelecionado);
	public void criarConta(Conta[] listaConta, int tipo);
	public void fecharConta(Conta[] listaConta, int idSelecionado);	
	public void buscarConta(Conta[] listaConta, int idSelecionado);
	public void atualizarCadastro(Conta[] listaConta, int idSelecionado);
}

package projeto;

import java.util.Scanner;

public class ID {
		
	public int selecaoID (Cliente [] listaClientes, int quantidadeClientes, Scanner sc) {
		
		for (int i = 0; i< quantidadeClientes; i++) {
			
			if (listaClientes[i] != null) {
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

}

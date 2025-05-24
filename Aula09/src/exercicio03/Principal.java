package exercicio03;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	//Utilizamos atributos estáticos para serem acessados pelos métodos estáticos.
	static Scanner scanner = new Scanner(System.in);
	static ArrayList<Filme> filmes = new ArrayList<Filme>();
	
	public static void main(String[] args) {
		int opcao = -1;
		
		do {
			limparTela();
			System.out.println("Opções");
			System.out.println("1 - Adicionar filme");
			System.out.println("2 - Remover filme");
			System.out.println("3 - Listar filmes");
			System.out.println("4 - Editar filme");
			System.out.println("0 - Sair\n");
			
			System.out.println("Digite a opção:");
			opcao = scanner.nextInt();

			//O nextInt() consome apenas o número, ele não consome o "enter".
			// Utilizamos o nextLine() para consumir o "enter" que ficou na fila.
			scanner.nextLine();

			switch (opcao) {
				case 1: adicionarFilme();
						break;
				case 2: excluirFilme();
						break;
				case 3: listarFilmes();
						break;
				case 4: editarFilme();
						break;
				case 0: System.out.println("Sair");
						break;
				default: System.out.println("Inválido");
			}
			
		}while (opcao != 0);
		
		scanner.close();
	}
	
	private static void adicionarFilme() {
		limparTela();
		System.out.println("Adicionar filme \n");

		System.out.println("Título:");
		String titulo = scanner.nextLine();
		
		System.out.println("Duração: ");
		int duracao = scanner.nextInt();
		
		filmes.add(new Filme(titulo, duracao));
		limparTela();
		System.out.println("Filme adicionado com sucesso!\n");
		System.out.println("Pressione enter para continuar.");
		scanner.nextLine();
	}

	private static void excluirFilme() {
		limparTela();
		System.out.println("Excluir filme \n");

		System.out.println("Código:");
		int codigo = scanner.nextInt();
		
		//O nextInt() consome apenas o número, ele não consome o "enter".
		// Utilizamos o nextLine() para consumir o "enter" que ficou na fila.
		scanner.nextLine();
		int indice = codigo - 1;
		
		if (indice >= 0 && indice < filmes.size()) {
			filmes.remove(indice);
			limparTela();
			System.out.println("Filme removido com sucesso!\n");
		} else {
			System.out.println("Código inválido.");
		}
		
		System.out.println("Pressione enter para continuar.");
		scanner.nextLine();
	}

	private static void listarFilmes() {
		limparTela();
		System.out.println("Lista de filmes:\n");

		if (filmes.size() == 0) {
			System.out.println("Nenhum filme cadastrado.");
		} else {
			for(int i = 0; i < filmes.size(); i++) {
				Filme filme = filmes.get(i);
				//ajustando para não mostrar o índice 0.
				int codigo = i + 1;

				System.out.println(codigo + " - " + filme.getTitulo() + " (" + filme.getDuracao() + " minutos)");
			}
		}

		System.out.println("\nPressione enter para continuar.");
		scanner.nextLine();
	}

	private static void editarFilme() {
		limparTela();
		System.out.println("Editar filme \n");

		System.out.println("Código:");
		int codigo = scanner.nextInt();
		
		//O nextInt() consome apenas o número, ele não consome o "enter".
		// Utilizamos o nextLine() para consumir o "enter" que ficou na fila.
		scanner.nextLine();
		int indice = codigo - 1;
		
		if (indice >= 0 && indice < filmes.size()) {
			System.out.println("Título:");
			String titulo = scanner.nextLine();

			System.out.println("Duração: ");
			int duracao = scanner.nextInt();
			//O nextInt() consome apenas o número, ele não consome o "enter".
			// Utilizamos o nextLine() para consumir o "enter" que ficou na fila.
			scanner.nextLine();

			filmes.get(indice).setTitulo(titulo);
			filmes.get(indice).setDuracao(duracao);
			limparTela();
			System.out.println("Filme atualizado com sucesso!\n");
		} else {
			System.out.println("Código inválido.");
		}
		
		System.out.println("Pressione enter para continuar.");
		scanner.nextLine();		
	}

	//Método para limpar a tela do terminal.
	private static void limparTela(){
		try	{
			//Se for no windows, utiliza o cls.
			if (System.getProperty("os.name").contains("Windows")) {
				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			} else {
				//Nos demais SO, utiliza esse código ANSI.
				//Não funciona no eclipse, intelij e netbeans.
				System.out.print("\033[H\033[2J");
				System.out.flush();
			}
		} catch (final Exception e) {
			System.out.println("Erro: "+e.getMessage());
		}
	}
}
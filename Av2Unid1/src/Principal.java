import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Evento> eventos = new ArrayList<Evento>();

    public static void main(String[] args) {
        int opcao = 0;

        do{

            System.out.println("Menu");
            System.out.println("1 - Cadastrar evento");
            System.out.println("2 - Listar eventos");
            System.out.println("3 - Excluir evento");
            System.out.println("0 - Sair \n");

            System.out.println("Opção:");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    adicionar();                    
                    
                    break;

                case 2:
                    listar();
                    
                    break;

                case 3:
                    excluir();
                    break;

                default:
                    System.out.println("Inválido.");
                    break;
            }


        } while (opcao != 0);

    }

    public static void adicionar(){
        System.out.println("Nome:");
        String nome = scanner.nextLine();

        System.out.println("Data:");
        String data = scanner.nextLine();

        System.out.println("Preço:");
        Double preco = scanner.nextDouble();

        System.out.println("Presencial (1) ou Remoto (2)?:");
        int tipo = scanner.nextInt();
        scanner.nextLine();

        boolean presencial = tipo==1?true:false;

        Evento evento = new Evento(nome, data, preco, presencial);

        eventos.add(evento);

        System.out.println("Evento adicionado com sucesso!\n");

    }

    public static void excluir(){
        System.out.println("Excluir evento");
        System.out.println("Código do evento:");
        int codigo = scanner.nextInt();
        scanner.nextLine();

        eventos.remove(codigo-1);

        System.out.println("Evento excluído com sucesso.\n");
    }

    public static void listar(){
        System.out.println("\nListar eventos");

        for(int i=0; i<eventos.size(); i++){
            int codigo = i+1;
            Evento ev = eventos.get(i);
            System.out.println(codigo + " - " + ev.getNome() + "(" + ev.getData() + ")");
        }
        System.out.println("");
    }
}
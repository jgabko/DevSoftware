import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Agenda minhaAgenda = new Agenda();

        while (true) {
            System.out.println("\n1 - Adicionar Contato");
            System.out.println("2 - Buscar Contato");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = leitor.nextInt();
            leitor.nextLine(); 

            if (opcao == 1) {
                System.out.print("Digite o nome do contato: ");
                String nome = leitor.nextLine();
                System.out.print("Digite o telefone do contato: ");
                String telefone = leitor.nextLine();
                minhaAgenda.adicionarContato(new Contato(nome, telefone));
            } else if (opcao == 2) {
                System.out.print("Digite o nome a buscar: ");
                String nomeBusca = leitor.nextLine();
                minhaAgenda.buscarContato(nomeBusca);
            } else if (opcao == 3) {
                System.out.println("Saindo...");
                break;
            } else {
                System.out.println("Opção inválida!");
            }
        }
        leitor.close();
    }
}

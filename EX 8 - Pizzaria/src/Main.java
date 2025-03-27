
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i = 0;
        int resposta;
        Pizza pizza = new Pizza();
        Pedido[] pedidos = new Pedido[40];

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("1. Fazer Pedido\n2. Cancelar Pedido\n3. Consultar Pedido\n4. Relatório\n5. Sair");
            resposta = scanner.nextInt();
            scanner.nextLine();

            switch (resposta) {
                case 1 -> {
                    System.out.println("Deseja ver o cardápio ou criar o próprio pedido?\n1. Cardápio\n2. Criar próprio pedido");
                    int respostaPedido = scanner.nextInt();
                    scanner.nextLine();

                    if (respostaPedido == 1) {
                        pizza.Cardapio();
                        System.out.println("Deseja finalizar pedido?\n1. Sim\n2. Não");
                        int respostaCardapio = scanner.nextInt();
                        scanner.nextLine();

                        if (respostaCardapio == 1) {
                            pedidos[i] = new Pedido();
                            pedidos[i].Finalizar_Pedido(pizza.Get_Valor(), pizza);
                            i++;
                        } else {
                            System.out.println("Cancelando processo...");
                        }
                    } else if (respostaPedido == 2) {
                        pizza.Criar_P();
                        System.out.println("Deseja finalizar pedido?\n1. Sim\n2. Não");
                        int respostaP = scanner.nextInt();
                        scanner.nextLine();

                        if (respostaP == 1) {
                            pedidos[i] = new Pedido();
                            pedidos[i].Finalizar_Pedido(pizza.Get_Valor(), pizza);
                            i++;
                        } else {
                            System.out.println("Cancelando processo...");
                        }
                    } else {
                        System.out.println("Resposta inválida!");
                    }
                }
                case 2 -> {
                    if (i > 0) {
                        pedidos[i - 1].Cancelar_Pedido();
                    } else {
                        System.out.println("Nenhum pedido para cancelar.");
                    }
                }
                case 3 -> {
                    if (i > 0) {
                        pedidos[i - 1].Consultar_Pedido();
                    } else {
                        System.out.println("Nenhum pedido para consultar.");
                    }
                }
                case 4 -> mostrarRelatorio(i, pedidos);
                case 5 -> System.out.println("Saindo...");
                default -> System.out.println("Resposta inválida...");
            }
        } while (resposta != 5);

        scanner.close();
    }

    static void mostrarRelatorio(int count, Pedido[] pedidos) {
        if (count == 0) {
            System.out.println("Sem pedidos para fazer relatório.\n");
        } else {
            int soma = 0;
            for (int i = 0; i < count; i++) {
                soma += pedidos[i].valor;
            }
            int media = soma / count;
            System.out.printf("\nNúmero total de pedidos: %d\n", count);
            System.out.printf("Soma do preço de todos os pedidos: %d\n", soma);
            System.out.printf("Média dos pedidos: %d\n", media);
        }
    }
}

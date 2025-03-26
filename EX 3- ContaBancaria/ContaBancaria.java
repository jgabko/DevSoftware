import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner leitor = new Scanner(System.in);

            // Solicitando os dados da conta bancária ao usuário
            System.out.print("Digite o número da conta: ");
            int numeroConta = leitor.nextInt();
            leitor.nextLine(); // Consumir quebra de linha

            System.out.print("Digite o nome do titular da conta: ");
            String nomeTitular = leitor.nextLine();

            System.out.print("Digite o saldo inicial: ");
            double saldoInicial = leitor.nextDouble();

            // Criando o objeto ContaBancaria
            ContaBancaria conta = new ContaBancaria(numeroConta, nomeTitular, saldoInicial);

            // Loop para interações com o usuário
            int opcao;
            do {
                System.out.println("\nEscolha uma opção:");
                System.out.println("1 - Depositar");
                System.out.println("2 - Sacar");
                System.out.println("3 - Consultar Saldo");
                System.out.println("4 - Exibir Informações da Conta");
                System.out.println("0 - Sair");
                System.out.print("Opção: ");
                opcao = leitor.nextInt();

                switch (opcao) {
                    case 1:
                        System.out.print("Digite o valor para depósito: ");
                        double valorDeposito = leitor.nextDouble();
                        conta.depositar(valorDeposito);
                        break;
                    case 2:
                        System.out.print("Digite o valor para saque: ");
                        double valorSaque = leitor.nextDouble();
                        conta.sacar(valorSaque);
                        break;
                    case 3:
                        System.out.println("Saldo Atual: " + conta.getSaldo());
                        break;
                    case 4:
                        conta.exibirInfo();
                        break;
                    case 0:
                        System.out.println("Encerrando...");
                        break;
                    default:
                        System.out.println("Opção inválida.");
                }
            } while (opcao != 0);

            leitor.close();
        }
    }

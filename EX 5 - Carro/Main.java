import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner leitor = new Scanner(System.in);

        // Coletando dados do usuário
        System.out.print("Digite a marca do carro: ");
        String marca = leitor.nextLine();

        System.out.print("Digite o modelo do carro: ");
        String modelo = leitor.nextLine();

        System.out.print("Digite o ano do carro: ");
        int ano = leitor.nextInt();
        leitor.nextLine(); // Consumir quebra de linha

        System.out.print("Digite a placa do carro: ");
        String placa = leitor.nextLine();

        // Criando um objeto Carro
        Carro meuCarro = new Carro(marca, modelo, ano, placa);

        // Exibir informações iniciais
        System.out.println("\nInformações do carro:");
        meuCarro.exibirInfo();

        // Testando aceleração e frenagem
        System.out.print("\nDigite o valor para acelerar: ");
        int acelerar = leitor.nextInt();
        meuCarro.acelerar(acelerar);

        System.out.print("\nDigite o valor para frear: ");
        int frear = leitor.nextInt();
        meuCarro.frear(frear);

        // Exibir informações finais
        System.out.println("\nEstado final do carro:");
        meuCarro.exibirInfo();
    }
}

public class ContaBancaria {
    // Atributos privados (Encapsulamento)
    private int numeroConta;
    private String nomeTitular;
    private double saldo;

    // Construtor para inicializar os atributos
    public ContaBancaria(int numeroConta, String nomeTitular, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldo = saldoInicial;
    }

    // Método para depositar valor
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito realizado com sucesso.");
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    // Método para sacar valor
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
        }
    }

    // Método para retornar o saldo atual
    public double getSaldo() {
        return saldo;
    }

    // Método para exibir as informações da conta
    public void exibirInfo() {
        System.out.println("\nNúmero da Conta: " + numeroConta);
        System.out.println("Nome do Titular: " + nomeTitular);
        System.out.println("Saldo Atual: " + saldo);
    }
}

public class Carro {

        private String marca;
        private String modelo;
        private int ano;
        private String placa;
        private int velocidadeAtual;

        // Construtor
        public Carro(String marca, String modelo, int ano, String placa) {
            this.marca = marca;
            this.modelo = modelo;
            this.ano = ano;
            this.placa = placa;
            this.velocidadeAtual = 0; // Inicializa com velocidade 0
        }
        //metodo para acelerar
        public void acelerar(int incremento) {
            if (incremento > 0) {
                velocidadeAtual += incremento;
                System.out.println("O carro acelerou para " + velocidadeAtual + " km/h.");
            } else {
                System.out.println("Valor inválido para acelerar.");
            }
        }

        // Metodo para frear
        public void frear(int decremento) {
            if (decremento > 0 && velocidadeAtual - decremento >= 0) {
                velocidadeAtual -= decremento;
                System.out.println("O carro reduziu para " + velocidadeAtual + " km/h.");
            } else {
                System.out.println("Não é possível reduzir essa quantidade.");
            }
        }

        // Metodo para exibir informações do carro
        public void exibirInfo() {
            System.out.println("Marca: " + marca);
            System.out.println("Modelo: " + modelo);
            System.out.println("Ano: " + ano);
            System.out.println("Placa: " + placa);
            System.out.println("Velocidade Atual: " + velocidadeAtual + " km/h");
        }
    }


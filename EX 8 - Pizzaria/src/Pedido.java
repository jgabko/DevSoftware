

import java.util.Scanner;

public class Pedido {

    String tamanho;
    String massa;
    String molho;
    String[] queijo = new String[2];
    String[] carne = new String[2];
    String[] ingredientes = new String[3];
    int valor;
    boolean active_sts;
    String destino;
    int check;

    public void Finalizar_Pedido(int valor, Pizza pizza) {

        Scanner scanner = new Scanner(System.in);
        this.valor = valor;
        check=Traduzir(pizza);
        this.active_sts = true;
        System.out.println("Qual endereço de entrega:");
        this.destino = scanner.nextLine();
    }

    public void Cancelar_Pedido() {
        this.active_sts = false;
        System.out.println("Pedido Cancelado");
    }
    public void Consultar_Pedido(){
      if(check==0) {
          System.out.println("----------------------");
          System.out.println("Tamanho:" + tamanho);
          System.out.println("Massa:" + massa);
          System.out.println("Molho:" + molho);
          for (int i = 0; i < 2; i++) {
              System.out.println("Queijo(" + i + "):" + queijo[i]);
          }
          for (int i = 0; i < 2; i++) {
              System.out.println("Carne(" + i + "):" + carne[i]);
          }
          for (int i = 0; i < 2; i++) {
              System.out.println("Ingredientes(" + i + "):" + ingredientes[i]);
          }
          System.out.println("----------------------");
          System.out.println("Status do Pedido:" + active_sts);
          System.out.println("----------------------");
          System.out.println("Endereço:" + destino);
          System.out.println("----------------------");
          System.out.println("Valor:" + valor);
          System.out.println("----------------------");
      }else{
          System.out.println("Erro no sistema");
      }

    }

    public int Traduzir(Pizza pizza) {

        switch (pizza.id_tamanho) {
            case 1:
                this.tamanho = "P";
                break;

            case 2:
                this.tamanho = "M";
                break;

            case 3:
                this.tamanho = "G";
                break;
            case 4:
                this.tamanho = "GG";
                break;

            default:
                System.out.println("Erro");
                break;
        }

        switch (pizza.id_massa) {
            case 1:
                this.massa = "Tradicional";
                break;
            case 2:
                this.massa = "Integral";
                break;
            default:
                System.out.println("Erro");
                break;

        }
        switch (pizza.id_molho) {
            case 1:
                this.molho = "Tomate";
                break;

            case 2:
                this.molho = "Tomate e Pimenta";
                break;

            case 3:
                this.molho = "Pesto";
                break;
            default:
                System.out.println("Erro");
                break;
        }
        for (int i = 0; i < 2; i++) {

            switch (pizza.id_queijo[i]) {

                case 1:
                    this.queijo[i] = "Parmesão";
                    break;

                case 2:
                    this.queijo[i] = "Mussarela";
                    break;

                case 3:
                    this.queijo[i] = "Gorgonzola";
                    break;

                case 4:
                    this.queijo[i] = "Catupiry";
                    break;
                case 0:
                    this.queijo[i] = "Sem queijo";
                    break;
                default:
                    System.out.println("Erro");
                    break;


            }
            switch (pizza.id_carnes[i]) {

                case 1:
                    this.carne[i] = "Presunto";
                    break;
                case 2:
                    this.carne[i] = "Pepperoni";
                    break;

                case 3:
                    this.carne[i] = "Lombo";
                    break;
                case 4:
                    this.carne[i] = "Frango";
                    break;

                case 5:
                    this.carne[i] = "Bacon";
                    break;
                case 0:
                    this.carne[i] = "Sem carne";
                    break;

                default:
                    System.out.println("Erro");
                    break;
            }
        }
        for (int i = 0; i < 3; i++) {
            switch (pizza.id_ingredientes[i]) {

                case 1:
                    this.ingredientes[i] = "tomate";
                    break;
                case 2:
                    this.ingredientes[i] = "Palmito";
                    break;
                case 3:
                    this.ingredientes[i] = "Ovo";
                    break;
                case 4:
                    this.ingredientes[i] = "Milho";
                    break;
                case 5:
                    this.ingredientes[i] = "Cogumelo";
                    break;
                case 6:
                    this.ingredientes[i] = "Cebola";
                    break;
                case 7:
                    this.ingredientes[i] = "Azeitona";
                    break;
                case 0:
                    this.ingredientes[i] = "Sem Ingrediente";
                    break;
                default:
                    System.out.println("Erro");
                    break;
            }
        }
    return 0;
    }



}

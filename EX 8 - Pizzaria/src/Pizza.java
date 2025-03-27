import java.util.Scanner;


public class Pizza {

    int id_massa;
    int[] id_ingredientes=new int[3];
    int id_tamanho;
    int valor;
    int id_molho;
    int[] id_queijo=new int[2];
    int[] id_carnes=new int[2];


    public void Criar_P(){
    Scanner scanner= new Scanner(System.in);
    System.out.println("----------------------------");
    System.out.println("Escolha o Tamanho da Pizza\n1-P\n2-M\n3-G\n4-GG");
    this.id_tamanho= scanner.nextInt();

    System.out.println("Escolha a Massa da Pizza\n1-Tradicional\n2-Integral");
    this.id_massa= scanner.nextInt();

    System.out.println("Escolha o Molho da Pizza\n1-Tomate\n2-Tomate e Pimenta\n3-Presto");
    this.id_molho= scanner.nextInt();

        for(int i =0;i<2;i++){

            System.out.println("Escolha até 2 queijos - queijo n("+(i)+")");
            System.out.println("0-sem queijo n("+(i+1)+")\n1-Parmesão\n2-Mussarela\n3-Gorgonzola\n4-Catupiry");
            this.id_queijo[i]= scanner.nextInt();

        }

    for(int i =0;i<3;i++){

        System.out.println("Escolha até 3 ingredientes-ingrediente n("+i+")");
        System.out.println("0-sem ingrediente\n1-tomate\n2-Palmito\n3-Ovo\n4-Milho\n5-Cogumelo\n6-Cebola\n7-Azeitona");
        this.id_ingredientes[i]=scanner.nextInt();

    }
        for(int i =0;i<2;i++){

            System.out.println("Escolha até 2 carnes- carne n("+i+")");
            System.out.println("0-sem carne\n1-Presunto\n2-Pepperoni\n3-Lombo\n4-Frango\n5-Bacon");
            this.id_carnes[i]=scanner.nextInt();

        }

        this.valor=Valor_P(id_tamanho);






    }
    public int Valor_P(int id_tamanho){

        return switch (id_tamanho) {
            case 1 -> 25;
            case 2 -> 35;
            case 3 -> 45;
            case 4 -> 55;
            default -> {
                System.out.println("Erro");
                yield -1;
            }
        };



    }
    public int Get_Valor(){

    return this.valor;
    }


    public void Cardapio() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cardapio:\nEscolha sua opção:");
        System.out.println("1. Pepperoni M ");
        System.out.println("2. Frango e Bacon G");
        System.out.println("3. Portuguesa G");
        int resposta = scanner.nextInt();

        switch (resposta) {

            case 1:
                this.id_tamanho=2;
                this.id_massa = 1;
                this.id_molho = 1;
                this.id_queijo[0] = 2;
                this.id_ingredientes[0] = 0;
                this.id_carnes[0] = 2;
                this.valor = Valor_P(2);
                break;


            case 2:
                this.id_tamanho=3;
                this.id_massa = 1;
                this.id_molho = 2;
                this.id_queijo[0] = 2;
                this.id_queijo[1] = 4;
                this.id_carnes[0] = 4;
                this.id_carnes[1] = 5;
                this.valor = Valor_P(3);
                break;


            case 3:
                this.id_tamanho=3;
                this.id_massa = 1;
                this.id_molho = 1;
                this.id_queijo[0] = 2;
                this.id_ingredientes[0] = 3;
                this.id_ingredientes[1] = 6;
                this.id_ingredientes[2] = 7;
                this.id_carnes[0] = 1;
                this.valor = Valor_P(3);
                break;

            default:
                System.out.println("Opção inválida");
                break;
        }
    }





}


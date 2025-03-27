
import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    private static ArrayList<Produto> produtosArr =new ArrayList<>();
    private static Scanner scanner =new Scanner(System.in);

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int exit1=0;

        do {
            System.out.println("|------------[MENU]----------------|");
            System.out.println("|1.Registrar Produto               |");
            System.out.println("|2.Modificar Produto               |");
            System.out.println("|3.Controle de Estoque de Produtos |");
            System.out.println("|4.Gerar Relatório                 |");
            System.out.println("|5.Remover Produto                 |");
            System.out.println("|6.Mostrar Produtos                |");
            System.out.println("|7.Sair                            |");
            System.out.println("|----------------------------------|");
            int reposta_m = scanner.nextInt();

            switch (reposta_m) {

                case 1:

                    RegistrarProduto();
                    break;
                case 2:

                    ModificarProduto();
                    break;

                case 3:

                    ModificarEstoque();
                    break;
                case 4:

                    Relatorio();
                    break;

                case 5:

                    removerProduto();
                    break;

                case 6:

                    Display();
                    break;

                case 7:
                    System.out.println("Saindo....");
                    exit1=6;
                    break;
                default:
                    System.out.println("error opção invalida main");
                    break;

            }
        }while (exit1!=6);


    }
    private static void RegistrarProduto(){
        System.out.println("Nome do Produto:");
        String nome= scanner.nextLine();

        System.out.println("Código do Produto:");
        int code= scanner.nextInt();
        scanner.nextLine();
        System.out.println("Valor do Produto:");
        float valor= scanner.nextFloat();
        scanner.nextLine();
        System.out.println("Quantidade do Produto:");
        int quantidade = scanner.nextInt();
        scanner.nextLine();
        Produto produto=new Produto();
        produto.Produto_C(nome,code,valor,quantidade);
        produtosArr.add(produto);
    }
    private static void ModificarProduto(){
        System.out.println("Digite o código do produto:");
        int codigo_busca = scanner.nextInt();
        scanner.nextLine();
        int index_busca=-1;
        for(int i=0;i<produtosArr.size();i++){
            if(produtosArr.get(i).Get_code() == codigo_busca) {
                index_busca=i;

            }
        }

        if (index_busca == -1) {
            System.out.println("Produto não encontrado");
            return;
        }


            int exit2 = 0;
            Produto produto= produtosArr.get(index_busca);
            do {
                System.out.println("|------------[MENU]----------------|");
                System.out.println("|1.Alterar Nome                    |");
                System.out.println("|2.Alterar código                  |");
                System.out.println("|3.Alterar valor                   |");
                System.out.println("|4.sair                            |");
                System.out.println("|----------------------------------|");
                int resposta = scanner.nextInt();
                scanner.nextLine();

                switch (resposta) {

                    case 1:
                        System.out.println("Atualize nome:");
                        String novo_nome = scanner.nextLine();
                        produto.Set_nome(novo_nome);
                        break;
                    case 2:
                        System.out.println("Atualize código:");
                        int novo_codigo = scanner.nextInt();
                        scanner.nextLine();
                        produto.Set_Code(novo_codigo);
                        break;

                    case 3:
                        System.out.println("Atualize valor:");
                        float novo_valor = scanner.nextFloat();
                        scanner.nextLine();
                        produto.Set_Valor(novo_valor);
                        break;
                    case 4:
                        System.out.println("voltando...");
                        exit2 = 4;
                        break;
                    default:
                        System.out.println("Erro opção de modificar produto inválida");
                }

            } while (exit2 != 4);










    }
    private static void ModificarEstoque(){

        System.out.println("Digite o código do produto:");
        int codigo_busca = scanner.nextInt();
        scanner.nextLine();
        int index_busca=-1;

        for(int i=0;i<produtosArr.size();i++){
            if(produtosArr.get(i).Get_code() == codigo_busca){

                index_busca=i;


            }

            }

        if (index_busca == -1) {
            System.out.println("Produto não encontrado");
            return;
        }

            Produto produto= produtosArr.get(index_busca);
            System.out.println("Qual é a nova quantidade em estoque do produto:");
            int nova_quantidade=scanner.nextInt();
            scanner.nextLine();
            produto.Set_qntd(nova_quantidade);



        }

        private static void removerProduto(){

            System.out.println("Digite o código do produto:");
            int codigo_busca = scanner.nextInt();
            int index_busca=-1;

            for(int i=0;i<produtosArr.size();i++){

                if(produtosArr.get(i).Get_code() == codigo_busca){

                    index_busca= i;
                    System.out.println("Produto Removido");

                }

            }
            if (index_busca == -1) {
                System.out.println("Produto não encontrado");
                return;
            }

            Produto produto_r =produtosArr.get(index_busca);
            produtosArr.remove(produto_r);



        }

        private static void Display(){
            System.out.println("1.Mostrar todos os produtos");
            System.out.println("2.Mostrar último produto registrado");
            int resposta = scanner.nextInt();
            int tamanho=produtosArr.size();

            switch (resposta){

                case 1:
                    if(tamanho>0) {
                        for (Produto produto : produtosArr) {
                            produto.Texto();
                        }
                    }else{
                        System.out.println("Sem produtos registrados");
                    }
                    break;
                case 2:
                    if(tamanho>0) {
                        Produto produto_d = produtosArr.get(tamanho - 1);
                        produto_d.Texto();
                    }else{
                        System.out.println("Sem produtos registrados");
                    }
                    break;

                default:
                    System.out.println("erro opção de display inválida");
                    break;

            }



        }

        private static void Relatorio(){

            int tamanho=produtosArr.size();

            if(tamanho>0) {
                for (Produto produto : produtosArr) {
                    produto.Relatorio_Texto();
                }
            }else{
                System.out.println("Sem produtos registrados");
            }




        }

    }

import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        Livro[] lib = new Livro[100];
        boolean exit = false;



    while(!exit){

        System.out.println("--Deseja Cadastrar um novo Livro?---\n1.Sim\n2.Display\n"+"3.exit\n");
        int resposta = scanner.nextInt();

        switch(resposta){
            case(1):  lib[count]= new Livro();
                count = lib[count].Create(count,lib);
                    break;
            case(2):
                lib[count-1].Display(lib,count);
                break;

            case(3):
                System.out.println("exting...");
                exit=true;
                break;

        }


    }

    }
}
import java.util.Scanner;

public class Livro {
    String nome;
    String autor;
    int ano;



    public void Display(Livro[] lib,int count){
        System.out.print("\n");
        for(int i=0;i<count;i++){
            System.out.print("\nAutor:"+lib[i].autor+"\n"+"Livro:"+lib[i].nome+"\n"+"Ano:"+lib[i].ano+"\n");
        }
        System.out.print("\n");
    }
    public int Store(int count,Livro[] lib){


            lib[count] = this;
            return count+1;

    }
    public int Create(int count,Livro[] lib){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nome do Livro:");
        this.nome = scanner.nextLine();
        System.out.println("Nome do Autor:");
        this.autor = scanner.nextLine();
        System.out.println("Ano do livro:");
        this.ano = scanner.nextInt();

        return Store(count,lib);





    }



}





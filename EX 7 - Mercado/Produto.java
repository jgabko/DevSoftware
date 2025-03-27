public class Produto {

    String nome;
    int code;
    float valor;
    int quantidade;

    public void Produto_C(String nome,int code,float valor,int quantidade){

        this.nome=nome;
        this.code=code;
        this.valor=valor;
        this.quantidade=quantidade;
    }
    public String Get_nome(){
        return this.nome;
    }
    public void Set_nome(String nome){
        this.nome=nome;
    }
    public int Get_code(){
        return this.code;
    }
    public void Set_Code(int code){
        this.code=code;
    }
    public float Get_valor(){
        return this.valor;
    }
    public void Set_Valor(float valor){
        this.valor=valor;
    }
    public int Get_qntd(){
        return this.quantidade;
    }
    public void Set_qntd(int quantidade){
        this.quantidade=quantidade;
    }

    public void Texto(){
        System.out.println("-------------------------------------------------------------");
        System.out.println("Produto: " + this.Get_nome());
        System.out.println("Código:  " + this.Get_code());
        System.out.printf("Valor:   %.2f\n", this.Get_valor());
        System.out.println("Estoque: " + this.Get_qntd());
        System.out.println("-------------------------------------------------------------");

    }

    public void Relatorio_Texto(){
        float valor_total= this.Get_valor()*this.Get_qntd();

        System.out.println("-------------------------------------------------------------");
        System.out.printf("Produto: %s\n", this.Get_nome());
        System.out.printf("Código:  %d\n", this.Get_code());
        System.out.printf("Valor unidade: %.2f\n", this.Get_valor());
        System.out.printf("Valor total:  %.2f\n", valor_total);
        System.out.printf("Estoque: %d\n", this.Get_qntd());
        System.out.println("-------------------------------------------------------------");


    }

}

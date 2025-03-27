import java.util.Scanner;

public class Calculadora {

 static public float op(float a, float b, int op){

     return switch (op) {
         case 1 -> add(a, b);
         case 2 -> sub(a, b);
         case 3 -> mult(a, b);
         case 4 -> div(a, b);
         default -> -1;
     };

 }
 public void calc(){
    Scanner scanner = new Scanner(System.in);
    System.out.print("NUM A:");
    float a= scanner.nextInt();
    System.out.print("\nNUM B:");
    float b= scanner.nextInt();
    System.out.print("\nESCOLHA A OP\n1.add\n2.sub\n3.mult\n4.div\n->");
    int op= scanner.nextInt();
    float out;
    out=op(a,b,op);
    System.out.printf("Resultado: %.2f",out);







}
static public float add(float a,float b){
     return a + b;

}

static public float sub(float a,float b){

     return a - b;
}
static public float div(float a , float b){
     return a/b;
}
static public float mult(float a , float b){
     return a*b;

}
}
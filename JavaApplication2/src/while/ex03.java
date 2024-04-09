
import java.util.Scanner;
public class ex03 {
    public static void main(String[]args){
        int I=0;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Digite um número:");
        int N=teclado.nextInt();
        
        while(I<=N){
            System.out.println("\nNúmeros Pares:\n"+I);
            I=I+2;
        }
        
        I=I-I;
        I=I+1;
        while (I<=N) {
            System.out.println("\nNúmeros impares:\n"+I);
            I=I+2;
        }
    }
}

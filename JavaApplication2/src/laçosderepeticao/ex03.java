
import java.util.Scanner;

public class ex03{
    public static void main(String[]args){
        float M=0;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Primeira nota:");
        float N1=teclado.nextFloat();
        System.out.println("Segunda nota:");
        float N2=teclado.nextFloat();

        while(N1<=10 && N2<=10){
            M=(N1+N2)/2;
            System.out.println("Sua média é:"+M);
        }
        System.out.println("Digite um valor válido.");
    }
}
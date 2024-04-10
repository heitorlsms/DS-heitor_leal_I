package laçosderepeticao;
import java.util.Scanner;

public class ex01{
    public static void main(String[]args){
        float div=0;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Primeiro valor:");
        float N1=teclado.nextInt();
        System.out.println("Segundo valor:");
        float N2=teclado.nextInt();
        while(N2==0){
            System.out.println("Por favor um valor diferente de zero.");
            System.out.println("Segundo valor:");
            float N3=teclado.nextInt();
            N2=N3;
        }
            
            div=N1/N2;
            System.out.println("O resultado da divisão de "+N1+" por "+N2+" será: "+div);
    }
}
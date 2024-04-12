package laçosderepeticao;
import java.util.Scanner;
public class ex011 {
    public static void main(String[]args){
        int I=1;
        int T=0;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Digite um valor(entre 1 e 10):");
        int N=teclado.nextInt();
        while(N<1 && N>10){
            System.out.println("Digite outro valor(entre 1 e 10):");
            N=teclado.nextInt();
        }
        while(I>=1 && I<=10){
            T=N*I;
            System.out.println(N+" x "+I+"= "+T);
            I++;
        }
    }
}


import java.util.Scanner;
public class ex08{
    public static void main(String[]args){

        Scanner teclado=new Scanner(System.in);
        System.out.println("Digite um valor(maior que 0):");
        int N=teclado.nextInt();
        System.out.println("Os valores entre 1 e "+N+" sao:");
            for(int I=1;I>=1 && I<=N; I++){
                System.out.println(I);
            }
        }
        
    }

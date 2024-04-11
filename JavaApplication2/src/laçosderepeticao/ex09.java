package laçosderepeticao;
import java.util.Scanner;
public class ex09{
    public static void main(String[]args){
        Scanner teclado=new Scanner(System.in);
        System.out.println("Digite um valor:");
        int N=teclado.nextInt();
        while(N==0){
            System.out.println("Valor invalido, por favor, digite outro.");
            System.out.println("O novo valor de sera:");
            N=teclado.nextInt();
            }
            System.out.println("Os valores entre 1 e "+N+" sao:");
            for(int I=1;I>=1 && I<=N; I++){
                System.out.println(I);
        }
    }
           
}
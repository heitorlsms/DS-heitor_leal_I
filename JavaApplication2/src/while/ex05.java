import java.util.Scanner;
public class ex05 {
    public static void main(String[]args){
        int I=0;
        float M=0;
        int Mi=0;
        Scanner teclado=new Scanner(System.in);
        while(I<10){
            I=I+1;
            System.out.println(I+" Número:");
            float N=teclado.nextFloat();
            if(N>M){
                M=N;
                Mi=I;
            }
            else{
                M=M;
                Mi=Mi;
            }
        }
        System.out.println("O maior número é: "+M+" e está na posicão:"+Mi);
    }
}

import java.util.Scanner;
public class ex06 {
    public static void main(String[] args) {
        int I=0;
        float M=0;
        float M2=0;
        Scanner teclado=new Scanner(System.in);
        while(I<10){
            I=I+1;
            System.out.println(I+" Número:");
            float N=teclado.nextFloat();
            if(N>M){
                M2=M;
                M=N;
            }
            else if(N>M2) {
                M2=N;
            } 
            else {
                M2=M2;
                M=M;
                
                }
            
        }
        System.out.println("O maior número é: "+M);
        System.out.println("O segundo maior número é: "+M2);
    }
}


import java.util.Scanner;
public class ex13 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int P=0;
        int U=1;
        int Nf=0;
        int I=1;
        
        System.out.println("Digite o n esimo termo:");
        int E=teclado.nextInt();
    
        Nf=P+U;
        System.out.println(Nf);

        while(I<=E){
            System.out.println(Nf);
            P=U;
            U=Nf;
            Nf=P+U;
            I++;
        }
    }
}

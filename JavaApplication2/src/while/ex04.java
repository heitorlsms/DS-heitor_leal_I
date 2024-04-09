import java.util.Scanner;
public class ex04 {
    public static void main(String[]args){
        int I=0;
        float SN=0;
        float M=0;
        float MA=0;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Quantos alunos existem em sua sala? ");
        int A=teclado.nextInt();

        while(I<A){
            I=I+1;
            System.out.println("\nNotas aluno"+I);
            System.out.println("Primeira nota:");
            float N1=teclado.nextFloat();
            System.out.println("Segunda nota:");
            float N2=teclado.nextFloat();
            MA=(N1+N2)/2;
            System.out.println("Média do aluno "+I+" é: "+MA);
            SN=SN+N1+N2;

        }
        M=SN/A;
        System.out.println("\nMédia da classe é: "+M);
    }
}

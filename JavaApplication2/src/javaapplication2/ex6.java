package javaapplication2;
import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        int Pb=0;
        int Pn=0;
        int Pv=0;
    Scanner teclado = new Scanner(System.in);
    System.out.println("Número de eleitores:");
    int E = teclado.nextInt();
    System.out.println("Votos branco:");
    int B = teclado.nextInt();
    System.out.println("Votos nulos:");
    int N = teclado.nextInt();
    System.out.println("Votos válidos:");
    int V = teclado.nextInt();

    Pb = (B*100)/E;
    Pn = (N*100)/E;
    Pv = (V*100)/E;
    System.out.println("A porcentagem de votos brancos é:"+Pb);
    System.out.println("A de votos nulos é:"+Pn);
    System.out.println("E a de votos válido é:"+Pv);
   
    }
}

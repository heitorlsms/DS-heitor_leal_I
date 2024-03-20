package javaapplication1;
import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        int Pb=0;
        int Pn=0;
        int Pv=0;
    Scanner teclado = new Scanner(System.in);
    System.out.println("Número de eleitores:");
    int E = nextInt();
    System.out.println("Votos branco:");
    int B = nextInt();
    System.out.println("Votos nulos:");
    int N = nextInt();
    System.out.println("Votos válidos:");
    int V = nextInt();

    Pb = (B*100)/E;
    Pn = (N*100)/E;
    Pv = (V*100)/E;
    System.out.println("A porcentagem de votos brancos é:"+Pb",de votos nulos é:"+Pn"e a de votos válido é:"+Pv);
   
    }
}

package ifeswitch;
import java.util.Scanner;

public class ex7 {
    public static void main(String[] args){   

        float N=0; 

        float Sn=0; 

    Scanner teclado = new Scanner (System.in); 

    System.out.println("Digite seu sálario antigo:"); 
    float Sa = teclado.nextFloat();

    System.out.println("Digite o percentual de reajuste:"); 

    float P = teclado.nextFloat(); 

    N=(P*100)/Sa; 

    Sn=Sa+N; 

 

    System.out.println("O valor do novo salário é:"+Sn); 

    } 

} 
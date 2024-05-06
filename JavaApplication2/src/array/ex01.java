

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class ex01 {

    public static void main(String[] args) {
        // Entender o Arrays
        int numero [] = new int[10];
        int M=1;
        Scanner teclado = new Scanner (System.in);
        
        //recebendo Numeros
        for (int i=0; i<10;i++)
        {
            System.out.println("Digite um Numero: ");
            numero[i] = teclado.nextInt();
            if(numero[i]<M){
                M=numero[i];
            }
        }
        System.out.println("Menor valor:"+M);
        // Imprimir valores do Vetor
              
    }
    
}
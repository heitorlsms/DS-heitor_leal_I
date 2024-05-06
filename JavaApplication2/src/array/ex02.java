import java.util.Scanner;

/**
 *
 * @author pc
 */
public class ex02 {

    public static void main(String[] args) {
        // Entender o Arrays
        int numero [] = new int[10];
        int M=1;
        int P=0;
        int i=0;
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("Digite um Numero: ");
        numero[i] = teclado.nextInt();
        M = numero[i];
        i++;
        //recebendo Numeros
        while(i<10)
        {
            
            System.out.println("Digite um Numero: ");
            numero[i] = teclado.nextInt();
            
            if(numero[i]<M){
                M=numero[i];
            }
            i++;
        }
        System.out.println("Menor valor:"+M);
        // Imprimir valores do Vetor
        System.out.println("\nDigite um valor que esteja no vetor:");
        P=teclado.nextInt();
        i=0;
        while(i<10){
            
            if(P==numero[i]){
                System.out.println("Este número está na posição:"+i);
            }
            i++;
        }
        if(P!=numero[i]){
            System.out.println("Valor não encontrado no vetor.Por favor, digite outro número:");
            P=teclado.nextInt();
        }
    }
}

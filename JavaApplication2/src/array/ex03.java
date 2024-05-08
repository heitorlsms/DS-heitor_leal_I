import java.util.Scanner;

/**
 *
 * @author pc
 */
public class ex03 {

    public static void main(String[] args) {
        // Entender o Arrays
        int numero [] = new int[6];
        int vetor = 0;
        int i=0;
        Scanner teclado = new Scanner (System.in);
        
        //recebendo Numeros
        while(i<6)
        {
            System.out.println("Digite um Numero: ");
            numero[i] = teclado.nextInt();
            i++;
        
              
        }
        vetor=numero[0]; 
        numero[0]=numero[5];
        vetor=numero[5];
            
        vetor=numero[1];
        numero[1]=numero[4];
        vetor=numero[4];
        
        vetor=numero[2];
        numero[2]=numero[3];
        vetor=numero[3];
        

        i=0;
        while(i<6){
            System.out.println("\nOs valores trocados são:"+numero[i]);
            i++;
        }
    }
}
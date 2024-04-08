
package ifeswitch;
import java.util.Scanner;
/**
 *
 * @author Aluno CA
 */
public class ex10 {
     public static void main(String[] args){
         Scanner teclado = new Scanner(System.in);
         System.out.println("Nome:");
         String N = teclado.next();
         System.out.println("Altura:");
         double A = teclado.nextDouble();
         System.out.println("Sexo(M ou F):");
         String S = teclado.next();
         if(S.equals("M")){
             double P=(72.7*A)-58;
             System.out.println(N+",seu peso ideal é:"+P);
         }
         else if(S.equals("F")){
             double P=(62.1*A)-44.7;
             System.out.println(N+",seu peso ideal é :"+P);
         }
      
}
}
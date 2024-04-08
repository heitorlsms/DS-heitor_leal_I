package ifeswitch;
import java.util.Scanner;
/**
 *
 * @author Aluno CA
 */
public class ex11 
{
     public static void main(String[] args)
     {
        double D = 0;
        double V = 0;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Tipo de combustivel(A-álcool, G-gasolina):");
        String C = teclado.next();
        System.out.println("Quantos litros?");
        float L = teclado.nextFloat();

        if(C.equals("A")){
            if(L<=20){
                D=(3*L)/100;
                V=(L*2.90)- D;
                System.out.println("O valor a ser pago é de:"+V);
            }
            else if (L>20){
                D=(5*L)/100;
                V=(L*2.90)-D;
                System.out.println("O valor a ser pago é de:"+V);
            }
            else {
                System.out.println("Valor inválido.");
            }
        }
        else if(C.equals("G"))
        {
            if(L<=20)
            {
                D=(4*L)/100;
                V=(L*3.30)-D;
                System.out.println("O valor a ser pago é de:"+V);
            }
            else if(L >20)
            {
                D=(6*L)/100;
                V=(L*3.30)-D;
                System.out.println("O valor a ser pago é de:"+V);
                
            }
            else {
                System.out.println("Valor inválido.");
                }
        }
           
    }
}


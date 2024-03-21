package javaapplication2;
import java.util.Scanner;
/**
 *
 * @author Aluno CA
 */
public class ex10 {
     public static void main(String[] args){
        float D = 0;
        float V = 0;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Tipo de combustivel(A-álcool, G-gasolina):");
        String C = teclado.nextLine();
        System.out.println("Quantos litros?");
        int L=teclado.nextInt;

        if(C =="A"){
            if(L<=20){
                D=(3*L)/100;
                V=(L*2.90)-D;
                System.out.println("O valor a ser pago é de:"+V);;
            }
            else if (L>20){
                D=(5*L)/100;
                V=(L*2.90)-D;
                System.out.println("O valor a ser pago é de:"+V);
            }
        }
        else if(C == "G"){
            if(L<=20){
                D=(4*L)/100;
                V=(L*3.30)-D;
                System.out.println("O valor a ser pago é de:"+V);
        }
            else if(L>20){
                D=(6*L)/100;
                V=(L*3.30)-D;
                System.out.println("O valor a ser pago é de:"+V);
            }
     }
}
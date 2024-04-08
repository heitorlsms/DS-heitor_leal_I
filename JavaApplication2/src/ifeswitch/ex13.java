/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifeswitch;
import java.util.Scanner;
/**
 *
 * @author CAMARGO
 */
public class ex13 {
   public static void main(String[] args) {
       float M=0;
       Scanner teclado=new Scanner(System.in);
       System.out.println("Pimeira nota:");
       float N1=teclado.nextFloat();
       System.out.println("Segunda nota:");
       float N2=teclado.nextFloat();
       M=(N1+N2)/2;
       
       switch((int)M)
       {
           case 0:
           case 1:
           case 2:
           case 3:
           case 4:
               System.out.println("Reprovcado");
               break;
           case 5:
           case 6:
           case 7:
               System.out.println("Exame");
               break;
           case 8:
           case 9:
           case 10:
           System.out.println("Aprovado");
           break;
           default:
             System.out.println("Valor inválido");
       }
    }
}

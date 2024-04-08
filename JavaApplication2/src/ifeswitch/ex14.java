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
public class ex14 {
     public static void main(String[] args) {
         
         float M=0;
         float Sub=0;
         float P=0;
         float D=0;
         
         Scanner teclado= new Scanner (System.in);
         System.out.println("Primeiro número:");
         float num1=teclado.nextFloat();
         System.out.println("Segundo número:");
         float num2=teclado.nextFloat();
         System.out.println("\n Escolha um desse número:\n [1] Média entre os números digitados\n "
                 + "[2]Diferença entre os números\n "
                 + "[3]Produtos entre os números digitados\n "
                 + "[4]Divisão do primeiro pelo segundo");
         int I=teclado.nextInt();
         
         switch (I)
         {
             case 1:
                 M=(num1 + num2)/2;
                 System.out.println("Média:"+M);
                 break;
             case 2:
                 Sub=num1-num2;
                 System.out.println("Diferença:"+Sub);
                 break;
             case 3:
                 P=num1*num2;
                 System.out.println("Produto:"+P);
                 break;
             case 4:
                 D=num1/num2;
                 System.out.println("Divisão:"+D);
                 break;
             default:
                 System.out.println("Índice inválido");
         }
     }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;
import java.util.Scanner;
/**
 *
 * @author Aluno CA
 */
public class ex9 {
     public static void main(String[] args){
         float Vc=0;
         float Sn=0;
         float Ct=0;
         Scanner teclado = new Scanner(System.in);
         System.out.println("Número de carros vendidos:");
         int Nc = teclado.nextInt();
         System.out.println("Valor total das vendas:");
         float Vt = teclado.nextFloat();
         System.out.println("Salário fixo:");
         float S = teclado.nextFloat();
         System.out.println("Comissão por cada carro vendido:");
         float C = teclado.nextFloat();
         
         Vc=(Vt*5)/100;
         Ct=Nc*C;
         Sn=Vc+Ct+S;
         System.out.println("O valor total de seu salário é:"+Sn);
         
         
         
    
}
}
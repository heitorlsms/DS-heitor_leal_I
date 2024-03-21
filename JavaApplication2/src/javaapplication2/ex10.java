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
public class ex10 {
     public static void main(String[] args){
         double P=0;
         Scanner teclado = new Scanner(System.in);
         System.out.println("Nome:");
         String N = teclado.nextLine();
         System.out.println("Altura:");
         float A = teclado.nextFloat();
         System.out.println("Sexo(M ou F):");
         String S = teclado.nextLine();
         if(S == "M"){
             P=(72.7*A)-58;
             System.out.println(N+",seu peso ideal é:"+P);
         }
         else if(S=="F"){
             P=(62.1*A)-44.7;
             System.out.println(N+",seu peso ideal é:"+P);
         }
         else{
             System.out.println("Sexo inválido.");
         }
}
}
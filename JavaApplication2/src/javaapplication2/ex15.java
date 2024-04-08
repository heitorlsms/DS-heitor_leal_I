/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;
import java.util.Scanner;
/**
 *
 * @author CAMARGO
 */
public class ex15 {
    public static void main(String[] args) {
        double V=0;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Quantidade do produto:");
        double Q=teclado.nextDouble();
        System.out.println("Código:");
        int C=teclado.nextInt();
        
        switch(C)
        {
                case 100:
                    V=Q*1.70;
                    System.out.println("Valor a pagar:"+V);
                    break;
                case 101:
                    V=Q*2.30;
                    System.out.println("Valor a pagar:"+V);
                    break;
                case 102:
                    V=Q*2.60;
                    System.out.println("Valor a pagar:"+V);
                    break;
                case 103:
                    V=Q*2.40;
                    System.out.println("Valor a pagar:"+V);
                    break;
                case 104:
                    V=Q*2.50;
                    System.out.println("Valor a pagar:"+V);
                    break;
                case 106:
                    V=Q*1.00;
                    System.out.println("Valor a pagar:"+V);
                    break;
        }
    }
}

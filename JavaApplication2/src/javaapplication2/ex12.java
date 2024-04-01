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
public class ex12 {
    public static void main(String[] args) {
Scanner teclado=new Scanner(System.in);
System.out.println("Digite o código do produto(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15):");
int C=teclado.nextInt();
switch (C)
{
    case 1:
        System.out.println("Alimento-não-pericível");
        break;
    case 2:
    case 3:
    case 4:
        System.out.println("Alimento perecível");
        break;
    case 5:
    case 6:
        System.out.println("Vestuário");
        break;
    case 7:
        System.out.println("Higiene Pessoal");
        break;
    case 8: 
    case 9:      
    case 10:
    case 11:      
    case 12:
    case 13:
    case 14:
    case 15:
        System.out.println("Limpeza e Utensílios Domésticos");
        break;
    default:
        System.out.println("Código inválido");
        return;        
}

    }
}


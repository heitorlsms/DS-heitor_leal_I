/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifeswitch;
import java.util.Scanner;
/**
 *
 * @author Aluno CA
 */
public class ex8 {
    public static void main(String[] args){
    float C=0;
    float D=0;
    float I =0;
    Scanner teclado= new Scanner(System.in);
    System.out.println("Digite o custo de fábrica:");
    float Cf = teclado.nextFloat();
    
    I=(Cf*45)/100;
    D=(Cf*28)/100;
    C= Cf+I+D;
        System.out.println("O valor do carro é:"+C);
    
    
    
}
}
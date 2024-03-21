/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author CAMARGO
 */
public class ex2 {
    
    public static void main(String[] args){
    
    int N1 = 1;
    int N2 = 2; 
    int N3 = 0;
    System.out.println("O primeiro valor é:" + N1);
        System.out.println("O segundo valor é:" + N2);
    N3=N2;
    N2=N1;
    N1=N3;
        System.out.println("Os valores trocados são:\n"+N1 + "\n" + N2);
   
}
}
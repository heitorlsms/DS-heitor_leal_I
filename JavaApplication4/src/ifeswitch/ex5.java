/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifeswitch;
import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        int Ad=0;
        int Md=0;
        int N=0;
        int Dd=0;
    Scanner teclado = new Scanner(System.in);
    System.out.println("Digite sua idade em anos:");
    int A = teclado.nextInt();
        System.out.println("Digite os meses a mais:");
        int M = teclado.nextInt();
        System.out.println("Digite os dias restantes:");
        int D = teclado.nextInt();
        
    Ad=A*365;
    Md=M*30;
    N=Ad+Md;
    Dd=N+D;
        System.out.println("Sua idade em dias é:"+Dd);
    }
}

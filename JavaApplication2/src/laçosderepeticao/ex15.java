import java.util.Scanner;

public class ex15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro para calcular o fatorial: ");
        int numero = scanner.nextInt();

        int fatorial = calcularFatorial(numero);

        System.out.println(numero + "! = " + fatorial);

        scanner.close();
    }

    
    public static int calcularFatorial(int numero) {
        if (numero == 0 || numero == 1) {
            return 1;
        } else {
            int fatorial = 1;
            for (int i = 2; i <= numero; i++) {
                fatorial *= i;
            }
            return fatorial;
        }
    }
}
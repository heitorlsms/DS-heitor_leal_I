import java.util.Scanner;

public class ex08 {
    public static void imprimirQuadrado(int lado) {
        // Loop para imprimir cada linha do quadrado
        for (int i = 0; i < lado; i++) {
            // Loop para imprimir os asteriscos em cada linha
            for (int j = 0; j < lado; j++) {
                System.out.print("*");
            }
            // Quebra de linha ao final de cada linha do quadrado
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário o tamanho do lado do quadrado
        System.out.print("Digite o tamanho do lado do quadrado (entre 1 e 20): ");
        int lado = scanner.nextInt();

        // Verifica se o tamanho do lado está dentro do intervalo permitido
        if (lado >= 1 && lado <= 20) {
            // Chama o método para imprimir o quadrado
            imprimirQuadrado(lado);
        } else {
            System.out.println("Tamanho do lado fora do intervalo permitido.");
        }

        scanner.close();
    }
}

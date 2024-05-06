import java.util.Scanner;

public class ex07 {
    public static void imprimirQuadrado(int lado) {
        // Inicializa o contador
        int linha = 0;
        
        // Loop enquanto linha for menor que o lado
        while (linha < lado) {
            // Inicializa o contador para imprimir os asteriscos
            int coluna = 0;
            
            // Loop enquanto coluna for menor que o lado
            while (coluna < lado) {
                System.out.print("*");
                coluna++;
            }
            
            // Quebra de linha ao final de cada linha do quadrado
            System.out.println();
            
            // Incrementa o contador de linha
            linha++;
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

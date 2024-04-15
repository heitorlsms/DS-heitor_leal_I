import java.util.Scanner;

public class ex16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de números (N): ");
        int N = scanner.nextInt();

        // Inicializando o menor e o maior valor com o primeiro número
        System.out.print("Digite o 1º número: ");
        int numero = scanner.nextInt();
        int menor = numero;
        int maior = numero;
        int soma = numero;

        // Loop para ler os próximos números e atualizar menor, maior e soma
        for (int i = 2; i <= N; i++) {
            System.out.print("Digite o " + i + "º número: ");
            numero = scanner.nextInt();
            if (numero < menor) {
                menor = numero;
            }
            if (numero > maior) {
                maior = numero;
            }
            soma += numero;
        }

        // Exibindo os resultados
        System.out.println("Menor valor: " + menor);
        System.out.println("Maior valor: " + maior);
        System.out.println("Soma dos valores: " + soma);

        
    }
}

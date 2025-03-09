import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int a = teclado.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int b = teclado.nextInt();

        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        int soma = 0, count = 0;
        System.out.print("Números pares no intervalo: ");
        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            soma += i;
            count++;
        }

        double media = (double) soma / count;
        System.out.println("\nSoma dos números: " + soma);
        System.out.println("Média dos números: " + media);

        teclado.close();
    }
}

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int n = teclado.nextInt();

        if (n % 2 == 0) {
            System.out.println("O número " + n + " é PAR.");
        } else {
            System.out.println("O número " + n + " é ÍMPAR.");
        }

        teclado.close();
    }
}

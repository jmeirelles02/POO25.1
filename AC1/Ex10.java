import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int n = teclado.nextInt();

        System.out.print("Digite o valor inferior do intervalo: ");
        int inferior = teclado.nextInt();

        System.out.print("Digite o valor superior do intervalo: ");
        int superior = teclado.nextInt();

        if (n < inferior) {
            System.out.println("O número " + n + " está ANTES do intervalo.");
        } else if (n > superior) {
            System.out.println("O número " + n + " está DEPOIS do intervalo.");
        } else {
            System.out.println("O número " + n + " está DENTRO do intervalo.");
        }

        teclado.close();
    }
}

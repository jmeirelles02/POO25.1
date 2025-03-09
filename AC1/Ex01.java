import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe o primeiro número inteiro: ");
        int num1 = teclado.nextInt();
        System.out.print("Informe o segundo número inteiro: ");
        int num2 = teclado.nextInt();

        System.out.println("Soma: " + (num1 + num2));
        System.out.println("Subtração: " + (num1 - num2));
        System.out.println("Multiplicação: " + (num1 * num2));
        System.out.println("Divisão: " + ((num2 != 0) ? ((double) num1 / num2) : "Indefinida"));

        teclado.close();
    }
}

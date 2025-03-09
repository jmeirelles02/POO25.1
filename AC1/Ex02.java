import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe o primeiro número decimal: ");
        double num3 = teclado.nextDouble();
        System.out.print("Informe o segundo número decimal: ");
        double num4 = teclado.nextDouble();

        System.out.println("Soma: " + (num3 + num4));
        System.out.println("Subtração: " + (num3 - num4));
        System.out.println("Multiplicação: " + (num3 * num4));
        System.out.println("Divisão: " + ((num4 != 0) ? (num3 / num4) : "Indefinida"));

        teclado.close();
    }
}
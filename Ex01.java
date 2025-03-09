import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // 1
        System.out.print("Informe o primeiro número inteiro: ");
        int num1 = teclado.nextInt();
        System.out.print("Informe o segundo número inteiro: ");
        int num2 = teclado.nextInt();

        System.out.println("Soma: " + (num1 + num2));
        System.out.println("Subtração: " + (num1 - num2));
        System.out.println("Multiplicação: " + (num1 * num2));
        System.out.println("Divisão: " + ((num2 != 0) ? ((double) num1 / num2) : "Indefinida"));

        // 2
        System.out.print("Informe o primeiro número decimal: ");
        double num3 = teclado.nextDouble();
        System.out.print("Informe o segundo número decimal: ");
        double num4 = teclado.nextDouble();

        System.out.println("Soma: " + (num3 + num4));
        System.out.println("Subtração: " + (num3 - num4));
        System.out.println("Multiplicação: " + (num3 * num4));
        System.out.println("Divisão: " + ((num4 != 0) ? (num3 / num4) : "Indefinida"));

        // 3
        System.out.print("Informe o salário atual: ");
        double salario = teclado.nextDouble();
        System.out.print("Digite o percentual de aumento (%): ");
        double percentual = teclado.nextDouble();
        double novoSalario = salario + (salario * percentual / 100);
        System.out.println("Novo salário: " + novoSalario);

        // 4
        System.out.print("Informe o raio do círculo: ");
        double raio = teclado.nextDouble();
        double perimetro = 2 * Math.PI * raio;
        double area = Math.PI * Math.pow(raio, 2);
        System.out.println("Perímetro: " + perimetro);
        System.out.println("Área: " + area);

        teclado.close();
    }
}

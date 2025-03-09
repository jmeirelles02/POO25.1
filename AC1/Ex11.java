import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a operação desejada (+, -, *, /): ");
        char op = teclado.next().charAt(0);

        System.out.print("Digite o primeiro número: ");
        double a = teclado.nextDouble();

        System.out.print("Digite o segundo número: ");
        double b = teclado.nextDouble();

        double resultado = 0;
        boolean operacaoValida = true;

        switch (op) {
            case '+':
                resultado = a + b;
                break;
            case '-':
                resultado = a - b;
                break;
            case '*':
                resultado = a * b;
                break;
            case '/':
                if (b != 0) {
                    resultado = a / b;
                } else {
                    System.out.println("Erro: Divisão por zero!");
                    operacaoValida = false;
                }
                break;
            default:
                System.out.println("Operação inválida!");
                operacaoValida = false;
        }

        if (operacaoValida) {
            System.out.println(a + " " + op + " " + b + " = " + resultado);
        }

        teclado.close();
    }
}

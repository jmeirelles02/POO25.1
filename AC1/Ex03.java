import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe o salário atual: ");
        double salario = teclado.nextDouble();
        System.out.print("Digite o percentual de aumento (%): ");
        double percentual = teclado.nextDouble();
        double novoSalario = salario + (salario * percentual / 100);
        System.out.println("Novo salário: " + novoSalario);

        teclado.close();
    }
}
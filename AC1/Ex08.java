import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a quantidade de kilowatts consumidos: ");
        double kwConsumidos = teclado.nextDouble();

        System.out.print("Digite o valor do kw/h R$: ");
        double valorKw = teclado.nextDouble();

        double valorTotal = kwConsumidos * valorKw;

        if (kwConsumidos < 150) {
            valorTotal *= 0.9; // Aplica 10% de desconto
        }

        System.out.println("Valor a ser pago: R$ " + valorTotal);

        teclado.close();
    }
}

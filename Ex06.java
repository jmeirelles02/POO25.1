import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a distância percorrida (km): ");
        double distancia = teclado.nextDouble();

        System.out.print("Digite o tempo gasto (horas): ");
        double tempo = teclado.nextDouble();

        System.out.print("Digite a quantidade de gasolina consumida (litros): ");
        double gasolina = teclado.nextDouble();

        double velocidadeMedia = distancia / tempo;
        double consumoMedio = distancia / gasolina;

        System.out.println("Velocidade Média: " + velocidadeMedia + " km/h");
        System.out.println("Consumo Médio: " + consumoMedio + " km/l");

        teclado.close();
    }
}

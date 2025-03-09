import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe o raio do círculo: ");
        double raio = teclado.nextDouble();
        double perimetro = 2 * Math.PI * raio;
        double area = Math.PI * Math.pow(raio, 2);
        System.out.println("Perímetro: " + perimetro);
        System.out.println("Área: " + area);

        teclado.close();
    }
}
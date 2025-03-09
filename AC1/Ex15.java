import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int vogais = 0, digitos = 0, outros = 0;

        System.out.println("Digite caracteres :");
        while (true) {
            char c = teclado.next().charAt(0);

            if (c == '.') break; //encerrar

            if (Character.isDigit(c)) {
                digitos++;
            } else if ("aeiouAEIOU".indexOf(c) != -1) {
                vogais++;
            } else {
                outros++;
            }
        }

        System.out.println("\nQuantidade de vogais: " + vogais);
        System.out.println("Quantidade de dígitos: " + digitos);
        System.out.println("Quantidade de outros caracteres: " + outros);

        teclado.close();
    }
}

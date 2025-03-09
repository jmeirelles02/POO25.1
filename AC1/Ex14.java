import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int count = 0;
        double soma = 0, maior = Double.MIN_VALUE, menor = Double.MAX_VALUE;

        System.out.println("Digite as notas dos alunos:");
        while (true) {
            System.out.print("Nota: ");
            double nota = teclado.nextDouble();

            if (nota == -1) break; //encerrar

            soma += nota;
            count++;

            if (nota > maior) maior = nota;
            if (nota < menor) menor = nota;
        }

        if (count > 0) {
            double media = soma / count;
            System.out.println("\nQuantidade de alunos: " + count);
            System.out.println("Média da turma: " + media);
            System.out.println("Maior nota: " + maior);
            System.out.println("Menor nota: " + menor);
        } else {
            System.out.println("Nenhuma nota foi inserida.");
        }

        teclado.close();
    }
}

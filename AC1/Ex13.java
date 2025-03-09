import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o número de alunos: ");
        int n = teclado.nextInt();

        double soma = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print("Digite a nota do aluno " + i + ": ");
            double nota = teclado.nextDouble();
            soma += nota;
        }

        double media = soma / n;
        System.out.println("Média da turma: " + media);

        teclado.close();
    }
}

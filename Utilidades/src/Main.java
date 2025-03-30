import classes.Sequencia;
import classes.Data;

public class Main {

    public static void main(String[] args) {
        Sequencia s1, s2, s3, s4;
        Data d1, d2, d3;

        s1 = new Sequencia( 2, 6);
        s2 = new Sequencia( 4, 10);
        s3 = new Sequencia(0, 15);
        s4 = new Sequencia(0, 10);

        d1 = new Data(29, 2, 2025);
        d2 = new Data(29, 2, 2024);
        d3 = new Data(25, 12, 2021);

        s1.mostrar();
        s2.mostrar();
        s3.mostrar();
        s4.mostrar();

        System.out.printf("\nA data é %b", d1.ehValida());
        d1.imprime();
        System.out.printf("\nA data é %b", d2.ehValida());
        d2.imprime();
        System.out.printf("\nA data é %b", d3.ehValida());
        d3.imprime();
    }

}
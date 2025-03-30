package classes;

public class Data {
    public final int dia;
    public final int ano;
    public final int mes;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public boolean ehValida() {
        if (ano <= 0 || mes < 1 || mes > 12) {
            return false;
        }

        int[] diasPorMes = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (ehBissexto()) {
            diasPorMes[2] = 29;
        }

        return dia > 0 && dia <= diasPorMes[mes];
    }

    public boolean ehBissexto() {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }

    public void imprime() {
        imprime("/");
    }

    public void imprime(String separador) {
        if (!ehValida()) {
            System.out.println("INVÁLIDA");
            return;
        }
    }
}
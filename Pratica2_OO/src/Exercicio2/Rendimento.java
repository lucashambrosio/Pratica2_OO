package Exercicio2;

public class Rendimento {

    private double investimentoInicial;
    private double taxaRendimento;
    private int numMeses;

    public Rendimento(double investimentoInicial, double taxaRendimento, int numMeses) {
        this.investimentoInicial = investimentoInicial;
        this.taxaRendimento = taxaRendimento;
        this.numMeses = numMeses;
    }

    public double calcularRendimento() {
        double rendimento = investimentoInicial * Math.pow(1 + taxaRendimento, numMeses);
        return rendimento - investimentoInicial;
    }
}

package Exercicio1;

public class Estoque {
    private String nome;
    private int qtdAtual,qtdMinima;

    public Estoque() {

    }

    public Estoque(String nome, int qtdAtual, int qtdMinima) {
        this.nome = nome;
        this.qtdAtual = qtdAtual;
        this.qtdMinima = qtdMinima;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdAtual() {
        return qtdAtual;
    }

    public void setQtdAtual(int qtdAtual) {
        this.qtdAtual = qtdAtual;
    }

    public int getQtdMinima() {
        return qtdMinima;
    }

    public void setQtdMinima(int qtdMinima) {
        this.qtdMinima = qtdMinima;
    }

    public void darBaixa(int qtde) {
        if (this.qtdAtual >= qtde) {
            this.qtdAtual -= qtde;
        }
        else {
            System.out.println("Não é possivel dar baixa na quantidade informada!");
        }

    }

    public String mostrar () {

        return "Nome: " + this.nome + "\nQuantidade Atual: " + this.qtdAtual + "\nQuantidade Mínima: " + this.qtdMinima;

    }

    public boolean precisaRepor() {

        return this.qtdAtual < this.qtdMinima;

    }
}

package Exercicio1;


public class Main {
    public static void main(String[] args) {

        Estoque estoque = new Estoque("Caneta", 10, 5);
        System.out.println(estoque.mostrar());
        System.out.println("Precisa repor? " + estoque.precisaRepor());
        estoque.darBaixa(5);
        System.out.println(estoque.mostrar());
        System.out.println("Precisa repor? " + estoque.precisaRepor());
        estoque.darBaixa(10);
        System.out.println(estoque.mostrar());
        System.out.println("Precisa repor? " + estoque.precisaRepor());

    }
}

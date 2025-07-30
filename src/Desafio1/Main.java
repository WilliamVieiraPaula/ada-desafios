package Desafio1;

public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto("Mouse Gamer", 150.00);
        p1.exibirResumo();
        p1.adicionarEstoque(10);
        p1.vender(3);
        p1.exibirResumo();


        Produto p2 = new Produto("Teclado Mecânico", 250.00, 5);
        p2.exibirResumo();
        p2.vender(6);
        p2.vender(2);
        p2.exibirResumo();
    }
}

package Desafio1;

public class Produto {
    private String nome;
    private double preco;
    private int estoque;

    public Produto(String nome, double preco, int estoque) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = 0;
    }

    public void adicionarEstoque(int quantidade) {
        if (quantidade > 0) {
            this.estoque += quantidade;
            System.out.println(quantidade + " unidades adicionadas ao estoque.");
        } else {
            System.out.println("não sera possivel adicionar esta quantidade ao estoque.");
        }
    }

    public void vender(int quantidade) {
        if (quantidade <= 0) {
            System.out.println("não sera possivel adicionar esta quantidade ao estoque.");
        } else if (quantidade <= this.estoque) {
            this.estoque -= quantidade;
            System.out.println(quantidade + " unidades vendidas.");
        } else {
            System.out.println("Estoque insuficiente para a venda.");
        }
    }


    public void exibirResumo() {
        System.out.println("Produto: " + this.nome);
        System.out.println("Preço: R$ " + this.preco);
        System.out.println("Estoque disponível: " + this.estoque + " unidades");
    }
}


package Desafio4;

public class Conta {
    private String titular;
    private int numero;
    private double saldo;

    public Conta(String titular, int numero, double saldoInicial) {
        this.titular = titular;
        this.numero = numero;
        this.saldo = saldoInicial;
    }

    public boolean depositar(double valor) {
        if (valor <= 0) return false;
        saldo += (valor - 0.50);
        return true;
    }

    public boolean sacar(double valor) {
        double total = valor + 0.50;
        if (valor <= 0 || total > saldo) return false;
        saldo -= total;
        return true;
    }

    public boolean transferir(Conta destino, double valor) {
        double total = valor + 0.50;
        if (valor <= 0 || total > saldo) return false;
        saldo -= total;
        destino.saldo += valor;
        return true;
    }

    public boolean pagar(double valor) {
        return sacar(valor); // pagar é o mesmo que sacar
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public int getNumero() {
        return numero;
    }
}

package Desafio2;

public class Principal {
    public static void main(String[] args) {

        Reembolso r1 = new Reembolso();
        r1.setNomeFuncionario("Ramundinha Freitas de Souza");
        r1.setDiasTrabalhados(30);
        r1.imprimirResumoReembolso(r1.calcularReembolso(1000,5000,3000));

        Reembolso r2 = new Reembolso();
        r2.setNomeFuncionario("Eliscrivaldo Oliveira de Jesus");
        r2.setDiasTrabalhados(6);
        r2.imprimirResumoReembolso(r2.calcularReembolso(100,3000));

    }

}

/* Você está desenvolvendo um sistema para calcular o valor de reembolso de despesas de funcionários de uma empresa.
Cada funcionário pode solicitar reembolso de despesas de alimentação, transporte e hospedagem,
com regras diferentes dependendo do tipo de despesa e da quantidade de dias trabalhados.
Objetivo:
Criar métodos com retorno, parâmetros, múltiplas assinaturas (sobrecarga) e uso de lógica condicional para calcular corretamente o valor de reembolso.
 */

package Desafio2;

public class Reembolso {
   private String nomeFuncionario;
   private int diasTrabalhados;


    public int getDiasTrabalhados() {
        return diasTrabalhados;
    }

    public void setDiasTrabalhados(int diasTrabalhados) {
        this.diasTrabalhados = diasTrabalhados;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public double calcularReembolso(double alimentacao, double transporte, double hospedagem){
       Double calcularReembolso = alimentacao + transporte + hospedagem;
        if(calcularReembolso > 0 && this.diasTrabalhados > 7){
            Double bonus = ((calcularReembolso * 0.10) + calcularReembolso);
            return bonus;
       }
        return calcularReembolso;
    }

    public double calcularReembolso(double alimentacao, double transporte){
        Double calcularReembolso = alimentacao + transporte;
        if(calcularReembolso > 0 && this.diasTrabalhados > 7){
            Double bonus = ((calcularReembolso * 0.10) + calcularReembolso);
            return bonus;
        }
        return  calcularReembolso;
    }

    public void imprimirResumoReembolso(double valorTotal){
       System.out.println(new StringBuilder().append("Funcionário: ").append(nomeFuncionario).append(" – Dias Trabalhados: ").append(diasTrabalhados).append(" – Reembolso Total: R$ ").append(valorTotal).toString());
    }
}

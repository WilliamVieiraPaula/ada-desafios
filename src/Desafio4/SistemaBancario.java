package Desafio4;

import java.util.Scanner;

public class SistemaBancario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando a conta principal
        System.out.print("Digite o nome do titular: ");
        String titular = scanner.nextLine();
        System.out.print("Digite o número da conta: ");
        int numero = scanner.nextInt();

        Conta minhaConta = new Conta(titular, numero, 0.0);

        // Conta para simular transferência
        Conta contaDestino = new Conta("Conta Destino", 999, 0.0);

        int opcao;
        do {
            System.out.println("\n--- Menu de Operações ---");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Transferir");
            System.out.println("4 - Pagar");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            double valor;
            boolean sucesso;

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor para depósito: ");
                    valor = scanner.nextDouble();
                    sucesso = minhaConta.depositar(valor);
                    System.out.println(sucesso ? "Depósito realizado com sucesso." : "Erro ao depositar.");
                    break;

                case 2:
                    System.out.print("Digite o valor para saque: ");
                    valor = scanner.nextDouble();
                    sucesso = minhaConta.sacar(valor);
                    System.out.println(sucesso ? "Saque realizado com sucesso." : "Saldo insuficiente ou valor inválido.");
                    break;

                case 3:
                    System.out.print("Digite o valor para transferir: ");
                    valor = scanner.nextDouble();
                    sucesso = minhaConta.transferir(contaDestino, valor);
                    System.out.println(sucesso ? "Transferência realizada com sucesso." : "Saldo insuficiente ou valor inválido.");
                    break;

                case 4:
                    System.out.print("Digite o valor do pagamento: ");
                    valor = scanner.nextDouble();
                    sucesso = minhaConta.pagar(valor);
                    System.out.println(sucesso ? "Pagamento realizado com sucesso." : "Saldo insuficiente ou valor inválido.");
                    break;

                case 5:
                    System.out.println("Saindo do sistema. Obrigado!");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

            System.out.printf("Saldo atual: R$ %.2f\n", minhaConta.getSaldo());

        } while (opcao != 5);

        scanner.close();
    }
}


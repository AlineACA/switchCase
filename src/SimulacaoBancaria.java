import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;

        while (continuar) {
            System.out.println("Digite a opção que deseja escolher\n 1.Deposito.\n 2.Saque.\n 3.Consultar Saldo.\n 4.Encerrar.");
            int opcao = scan.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Qual valor a ser depositado?");
                    Scanner ScanDeposito = new Scanner(System.in);
                    int deposito = ScanDeposito.nextInt();
                    saldo = saldo + deposito;
                    System.out.println(saldo + " É o valor na sua conta.");


                    break;
                case 2:
                    // Ler o valor a ser sacado e verificar/imprimir se há saldo suficiente.
                    System.out.println("Qual valor a ser sacado?");
                    Scanner ScanSaque = new Scanner(System.in);
                    int saque = ScanSaque.nextInt();
                    if (saque<=saldo){
                        saldo = saldo - saque;
                        System.out.println(saldo + " É o novo valor na sua conta.");
                    } else System.out.println("Saldo insuficiente.");
                    break;
                case 3:
                    // TODO: Exibir o saldo atual da conta.
                    System.out.println(saldo + " É o atual valor na sua conta.");
                    break;
                case 4:
                    System.out.println("Programa encerrado.");
                    continuar = false;  // Atualiza a variável de controle para encerrar o loop
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scan.close();
    }
}
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência:");
        String agencia = sc.nextLine();

        System.out.println("Por favor, digite o número da Conta");
        int numero = sc.nextInt();
        sc.nextLine();

        System.out.println("Por favor, digite o seu nome:");
        String nomeCliente = sc.nextLine();

        System.out.println("Por favor, digite o saldo inicial:");
        double saldo = sc.nextDouble();

        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +
                ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.";
        System.out.println(mensagem);

        // Fechando o scanner
        sc.close();
    }
}

import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double Saldo = 0.00;

        System.out.println("Por favor digite o número da sua conta!:");
        int Numero = sc.nextInt();

        System.out.println("Por favor digite o número da sua agencia!:");
        String Agencia = sc.next();

        System.out.println("Por favor digite seu nome:");
        String Nome = sc.next();

        System.out.println("Olá " + Nome +
                ", obrigado por criar uma conta em nosso banco," +
                " sua agência é "+ Agencia +
                " conta " + Numero + " e seu saldo " + Saldo + "R$ já está disponível para saque.");


    }
}
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("BEM VINDOS AO BANCO DIO");
        System.out.println("Insira seus dados para o cadastro");
        System.out.print("Nome: ");
        String nomeUsuario = sc.nextLine();
        System.out.print("Numero da conta: ");
        int numeroConta = sc.nextInt();
        System.out.print("Agencia(XXXX-X): ");
        String agencia = sc.next();
        System.out.print("Valor do primeiro deposito: R$ ");
        double saldo = sc.nextDouble();

        System.out.println("\nConta cadastrada com sucesso!");
        System.out.printf("""
                    Informações da conta
                        %s
                Numero da conta: %x | Agencia: %s
                        Saldo: R$ %.2f
                """, nomeUsuario, numeroConta, agencia, saldo);


    }
}

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        Conta conta = new Conta();
        try {
            System.out.println("Por favor, digite o número da Agência: ");
            conta.setAgencia(scanner.next());
            System.out.println("Por favor, digite o número da Conta: ");
            conta.setNumero(scanner.nextInt());
            System.out.println("Por favor, digite o nome do Cliente: ");
            conta.setNomeCliente(scanner.next());
            System.out.println("Por favor, digite o saldo: ");
            conta.setSaldo(scanner.nextDouble());

            System.out.println("Olá " + conta.getNomeCliente()
                    + ", obrigado por criar uma conta em nosso banco, sua agência é " + conta.getAgencia() + ", conta "
                    + conta.getNumero() + " e seu saldo R$" + conta.getSaldo() + " já está disponível pra saque");
            System.out.println("Número da Agência: " + conta.getAgencia());
            System.out.println("Número da Conta: " + conta.getNumero());
            System.out.println("Nome do Cliente: " + conta.getNomeCliente());
            System.out.println("Saldo: R$" + conta.getSaldo());

        } catch (InputMismatchException e) {
            System.out.println("Formato incorreto!");
        } finally {
            scanner.close();

        }
    }
}
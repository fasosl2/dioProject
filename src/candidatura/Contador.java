package candidatura;

import java.util.Locale;
import java.util.Scanner;

public class Contador {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        try {
            System.out.println("Por favor, digite o primeiro parâmetro: ");
            int value1 = scanner.nextInt();
            System.out.println("Por favor, digite o segundo parâmetro: ");
            int value2 = scanner.nextInt();

            if (value1 > value2) {
                throw new ParametrosInvalidosException();
            }
            int total = value2 - value1;
            for (int index = 0; index < total; index++) {
                System.out.println("Imprimindo número " + (index + 1));
            }
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();

        }
    }
}
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da conta abaixo: ");
        int accountNumber = scanner.nextInt();

        System.out.println("Agora, digite o código da agência: ");
        String agencyCode = scanner.next();

        System.out.println("Digite seu nome: ");
        String name = scanner.next();

        System.out.println("Digite seu sobrenome: ");
        String lastName = scanner.next();

        System.out.println("Digite o saldo: ");
        double balance = scanner.nextDouble();

        System.out.println("Olá " 
                           + fullName(name, lastName) 
                           + ", obrigado por criar uma conta em nosso banco, sua agência é " 
                           + agencyCode
                           + ", conta " + accountNumber 
                           + " e seu saldo R$ " + balance
                           + " já está disponível para saque.");
    }

    public static String fullName(String name, String lastname) {
        return name.concat(" ").concat(lastname);
    }
}
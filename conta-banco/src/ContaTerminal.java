import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        // agencia
        System.out.print("Por favor, digite o número da Agência:");
        String agencia = scanner.next();

        // numero
        System.out.print("Por favor, digite o número da Conta:");
        int numero = scanner.nextInt();

        // nome do cliente
        System.out.print("Por favor, digite o seu Primeiro Nome:");
        String primeiroNome = scanner.next();
        
        // sobrenome do cliente
        System.out.print("Por favor, digite o seu Sobrenome:");
        // nome final
        String nomeCliente = primeiroNome +" "+ scanner.next();

        // saldo
        System.out.print("Por favor, digite o seu saldo:");
        double saldo = scanner.nextDouble();

        // mensagem final
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco," +
        "sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + 
        " já está disponível para saque.");

        scanner.close();
    }
}

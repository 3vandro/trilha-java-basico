import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Por favor, digite o número da Conta !");       
        int conta = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, digite o número da Agência! (com o digito)");
        String agencia = scanner.next();
        scanner.nextLine();

        System.out.println("Por favor, digite o Nome do Cliente");
        String nomeCliente = scanner.next(); 
        
        System.out.println("Por favor, digite o Sobremone do Cliente");
        String sobrenomeCliente = scanner.next(); 

        System.out.println("Por favor, digite o valor do primeiro depósito");
        Double saldo = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Olá " + nomeCliente + " " + sobrenomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " , conta " + conta + " e seu saldo de R$ " + saldo + " já está disponível para saque.");
        
        scanner.close();
    }
}

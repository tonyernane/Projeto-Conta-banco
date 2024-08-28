import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("numero da conta");
    int numeroConta = scanner.nextInt();

    System.out.println("numero da agência");
    String numeroAgencia = scanner.next();

    System.out.println("nome do cliente");
    String nomeCliente = scanner.next();
    System.out.println("sobrenome");
    String sobrenomeCliente = scanner.next();
    
    System.out.println("valor");
    BigDecimal valorConta = scanner.nextBigDecimal();

    System.out.println("Olá" +" " + nomeCliente +" " + sobrenomeCliente +" " + "obrigado por criar uma conta em nosso banco.");
    System.out.println("sua conta é" +" " + numeroConta);
    System.out.println("sua agência é" +" " + numeroAgencia);
    System.out.println("e seu valor de" +" " + valorConta + " está disponivel para saque.");
    
}
}

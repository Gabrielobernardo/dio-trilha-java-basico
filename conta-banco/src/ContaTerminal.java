import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.ENGLISH);


        System.out.println("Qual a sua Agência?");
        int agencia= scanner.nextInt();

        System.out.println("Qual o número da sua conta?");
        int conta= scanner.nextInt();
        
        System.out.println("Qual é seu nome?");
        String nome = scanner.next();

        System.out.println("Qual é seu sobrenome?");
        String sobrenome = scanner.next();


        System.out.println("Saldo disponível para saque");
        double saldo= scanner.nextDouble();

        System.out.println("Olá:" + nome + " " + sobrenome);
        System.out.println("Obrigado por ter uma conta em nosso banco.");
        System.out.println("Sua Agência é:" + agencia + conta);
        System.out.println("Sua Conta:" + conta);
        System.out.println("Saldo disponível para saque:" + saldo);



    }
}

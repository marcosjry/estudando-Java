import java.util.Locale;
import java.util.Scanner;

public class AboutMeScan {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble();
        
        System.out.println("Digite seu Nome: ");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome: ");
        String sobreNome = scanner.next();

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println(nome + " " + sobreNome +"\nSua idade é: " + idade + "\ne sua altura é " + altura);
        
        
    }
}

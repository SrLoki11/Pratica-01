import java.util.Scanner;


public class CalculoSalario {
    
    public static void main(String[] args) throws Exception {
        
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário atual do funcionário: ");
        double salarioAtual = scanner.nextDouble();

        double aumento = salarioAtual * 0.25;
        double novoSalario = salarioAtual + aumento;
        System.out.printf("Novo salário: R$ %.2f%n", novoSalario);

        scanner.close();
    }
}

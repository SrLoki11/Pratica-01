import java.util.Scanner;

public class Conversao {
public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a cotação do dólar em reais: ");
        double cotacaoDolar = scanner.nextDouble();

        System.out.print("Digite o valor em dólares: ");
        double valorDolar = scanner.nextDouble();

        double valorReal = cotacaoDolar * valorDolar;
        System.out.printf("Valor em reais: R$ %.2f%n", valorReal);

        scanner.close();
    }
}

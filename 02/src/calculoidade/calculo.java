package calculoidade;

import java.util.Scanner;

public class calculo {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o ano de nascimento: ");
        int anoNascimento = scanner.nextInt();

        System.out.print("Digite o ano atual: ");
        int anoAtual = scanner.nextInt();

        int idadeAtual = anoAtual - anoNascimento;
        System.out.println("Idade atual: " + idadeAtual);

        int idade2050 = 2050 - anoNascimento;
        System.out.println("Idade em 2050: " + idade2050);

        scanner.close();
    }
}

	



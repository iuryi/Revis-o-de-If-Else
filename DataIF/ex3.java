package DataIF;

import java.util.Random;
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número do mês (1-12): ");
        int mes = scanner.nextInt();
        System.out.print("Digite o dia do mês: ");
        int dia = scanner.nextInt();

        int[] diasPorMes = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (mes >= 1 && mes <= 12 && dia >= 1 && dia <= diasPorMes[mes]) {
            System.out.println("Data válida.");
        } else {
            System.out.println("Data inválida.");
        }
    }
}


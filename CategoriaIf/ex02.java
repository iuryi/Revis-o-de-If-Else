package CategoriaIf;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        if (numero >= 1 && numero <= 10) {
            System.out.println("O número pertence à classificação A (1 a 10).");
        } else if (numero >= 11 && numero <= 20) {
            System.out.println("O número pertence à classificação B (11 a 20).");
        } else if (numero >= 21 && numero <= 30) {
            System.out.println("O número pertence à classificação C (21 a 30).");
        } else {
            System.out.println("O número não pertence a nenhuma das classificações A, B ou C.");
        }
        scanner.close();
    }
}

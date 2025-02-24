package CategoriaIf;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a temperatura em °C: ");
        double temperatura = sc.nextDouble();

        if (temperatura < 15) {
            System.out.println("Está frio.");
        } else if (temperatura <= 25) {
            System.out.println("Está agradável.");
        } else {
            System.out.println("Está quente.");
        }
    }
}

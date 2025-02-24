package CategoriaIf;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite sua altura (em metros): ");
        double altura = sc.nextDouble();

        if (altura < 1.60) {
            System.out.println("Você é considerado baixo.");
        } else if (altura <= 1.80) {
            System.out.println("Você tem altura média.");
        } else {
            System.out.println("Você é considerado alto.");
        }
    }
}

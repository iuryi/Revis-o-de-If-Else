package CategoriaIf;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a pressão sistólica: ");
        int sistolica = sc.nextInt();
        System.out.print("Digite a pressão diastólica: ");
        int diastolica = sc.nextInt();

        if (sistolica < 120 && diastolica < 80) {
            System.out.println("Pressão normal.");
        } else if (sistolica <= 139 || diastolica <= 89) {
            System.out.println("Pressão moderada.");
        } else {
            System.out.println("Pressão alta.");
        }
    }
}

package FinanceiroIf;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o salário: ");
        double salario = sc.nextDouble();
        System.out.print("Digite o valor da parcela: ");
        double parcela = sc.nextDouble();

        if (parcela <= salario * 0.10) {
            System.out.println("Parcelamento aprovado.");
        } else {
            System.out.println("Parcelamento negado.");
        }
    }
}

package FinanceiroIf;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o salário: ");
        double salario = sc.nextDouble();

        if (salario >= 3000) {
            System.out.println("Financiamento aprovado.");
        } else {
            System.out.println("Financiamento negado.");
        }
    }
}

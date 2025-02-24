package FinanceiroIf;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o saldo da conta: ");
        double saldo = sc.nextDouble();
        System.out.print("Digite o valor do saque: ");
        double saque = sc.nextDouble();

        if (saldo >= saque) {
            System.out.println("Saque aprovado.");
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }
}

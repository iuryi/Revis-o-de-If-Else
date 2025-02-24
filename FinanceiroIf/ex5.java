package FinanceiroIf;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor da compra: ");
        double valor = sc.nextDouble();

        if (valor >= 200) {
            System.out.println("Parabéns! Você ganhou um brinde.");
        } else {
            System.out.println("Valor insuficiente para brinde.");
        }
    }
}

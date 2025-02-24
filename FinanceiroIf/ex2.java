package FinanceiroIf;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor da compra: ");
        double valor = sc.nextDouble();
        double desconto = (valor > 500) ? valor * 0.10 : 0;
        System.out.println("Desconto aplicado: R$ " + desconto);
    }
}

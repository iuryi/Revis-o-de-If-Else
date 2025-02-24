package OperaçoesIf;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número para verificar se é um quadrado perfeito: ");
        int numero = scanner.nextInt();
        int raiz = (int) Math.sqrt(numero);
        if (raiz * raiz == numero) {
            System.out.println(numero + " é um quadrado perfeito.");
        } else {
            System.out.println(numero + " não é um quadrado perfeito.");
        }
        scanner.close();
    }
}

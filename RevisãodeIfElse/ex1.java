package RevisãodeIfElse;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        System.out.println("digite um numero");
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        if (numero < 0) {
            System.out.print("é negativo");
        } else {
            System.out.print("é positivo");
        }
    }
}



package org.example.teste3;

import java.util.Scanner;

public class modell {
    public static void main(String[] args) {
        mody num = new mody();
        System.out.println("Digite um numero" );
        Scanner sc = new Scanner(System.in);
        num.a= sc.nextInt();
        num.numdiv();
        sc.close();
    }
}

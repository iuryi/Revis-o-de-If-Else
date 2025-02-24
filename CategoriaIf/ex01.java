package CategoriaIf;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        	System.out.print("Digite a idade da pessoa: ");
	        int idade = sc.nextInt();

	        if (idade < 12) {
	            System.out.println("A pessoa é uma criança.");
	        } else if (idade < 18) {
	            System.out.println("A pessoa é um adolescente.");
	        } else if (idade < 60) {
               System.out.println("A pessoa é um adulto.");
	        } else {
	            System.out.println("A pessoa é um idoso.");
	        }

    }
}

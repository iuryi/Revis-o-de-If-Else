package CodiçõesIfElse;

import java.util.Scanner;

public class Cex3 {
    public static void main(String[] args) {
        System.out.print("Digite uma palavra: ");
        Scanner sc = new Scanner(System.in);
        String palavra = sc.nextLine();
        if (palavra.length() > 5) {
            System.out.println("A palavra contém mais de 5 caracteres.");
        } else {
            System.out.println("A palavra não contém mais de 5 caracteres.");
        }
    }
}

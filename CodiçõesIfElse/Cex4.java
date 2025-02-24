package CodiçõesIfElse;

import java.util.Scanner;

public class Cex4 {
    	public static void main(String[] args) {

        System.out.println("Digite um nome");
        Scanner sc = new Scanner(System.in);
        String nome = sc.next();
        char letra = 'a';
        if (nome.charAt(0) == letra)  {
            System.out.println("se incia com a letra a ");
        } else {
            System.out.println("não se inicia com a letra a ");
        }

    }

}

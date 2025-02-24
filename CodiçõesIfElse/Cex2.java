package CodiçõesIfElse;

import java.util.Scanner;

public class Cex2 {
    	public static void main(String[] args) {

        System.out.println("Digite a senha q deseja");
        Scanner sc = new Scanner(System.in);
        String senha = sc.next();
        System.out.println("verifique sua senha ");
        String senhaa = sc.next();
        if (senhaa.equals(senha)) {
            System.out.println("senha correta ");
        } else {
            System.out.println("senha incorreta ");
        }

    }

}

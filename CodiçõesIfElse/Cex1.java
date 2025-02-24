package CodiçõesIfElse;

import java.util.Scanner;

public class Cex1 {
    	public static void main(String[] args) {

        System.out.println("Digite sim ou não");
        Scanner sc = new Scanner(System.in);
        String talvez = sc.next();
        if (talvez.equals("sim")) {
            System.out.println("então a palavra é sim  ");
        } else if (talvez.equals("não")){
            System.out.println("então a palavras é não");
        }
        else {
            System.out.println("então a palavra é não e nem sim  ");
        }

    }

}

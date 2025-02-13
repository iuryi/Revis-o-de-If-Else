package RevisãodeIfElse;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
    System.out.println("Digite quantos dias tem esse ano" );
    Scanner sc = new Scanner(System.in);
    int dias= sc.nextInt();

        if(dias > 365){
        System.out.print("é um ano bissexto");
    } else {
        System.out.print("Não é um ano bissexto");
    }
}

}

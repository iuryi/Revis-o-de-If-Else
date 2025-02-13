package RevisãodeIfElse;

import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
    System.out.println("Digite um numero" );
    Scanner sc = new Scanner(System.in);
    int num= sc.nextInt();
        if(num % 5 == 0){
        System.out.print("é multiplo de 5");
    } else {
        System.out.print("Não é multiplo de 5");
    }
}

}

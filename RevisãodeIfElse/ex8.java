package RevisãodeIfElse;

import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {

        System.out.println("Digite um numero" );
        Scanner sc = new Scanner(System.in);
        String  vogal= sc.next();

        if(vogal == "a"||vogal == "e"||vogal == "i"||vogal == "o"||vogal == "u"){
            System.out.print("é um vogal");
        } else {
            System.out.print("Não é vogal");
        }
    }
}

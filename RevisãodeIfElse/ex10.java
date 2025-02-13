package RevisãodeIfElse;

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {

        System.out.println("Digite um numero" );
        Scanner sc = new Scanner(System.in);
        int  entre= sc.nextInt();

        if(entre >= 100 && entre <= 200){
            System.out.print("esta entre 100 e 200");
        } else {
            System.out.print("Não estar entre 100 e 200");
        }
    }

}

package RevisãodeIfElse;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        System.out.println("digite um numero" );
        Scanner sc = new Scanner(System.in);
        int num1= sc.nextInt();
        System.out.println("digite um numero" );
        Scanner cs = new Scanner(System.in);
        int num2 = cs.nextInt();
        if(num1 > num2){
            System.out.print("Primeiro numero é maior");
        } else{
            System.out.print("Segundo numero é maior");
        }
    }

}

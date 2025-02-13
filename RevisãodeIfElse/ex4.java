package RevisãodeIfElse;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        System.out.println("digite sua idade" );
        Scanner sc = new Scanner(System.in);
        int idade= sc.nextInt();
        if( idade >= 16 ){
            System.out.print("poder votar");
        } else{
            System.out.print("não, tem idade minima para votar");
        }
    }

}

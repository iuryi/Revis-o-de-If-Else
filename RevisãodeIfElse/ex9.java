package RevisãodeIfElse;

import java.util.Scanner;

public class ex9 {
    	public static void main(String[] args) {

        System.out.println("Digite um numero" );
        Scanner sc = new Scanner(System.in);
        int  entre= sc.nextInt();

        if(entre >= 10 && entre <= 50){
            System.out.print("esta entre 10 e 50");
        } else {
            System.out.print("Não estar entre 10 e 50");
        }
    }

}

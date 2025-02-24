package RevisãodeIfElseM;

import java.util.Scanner;

public class Mex4 {
    	public static void main(String[] args) {

        System.out.println("Digite sua nota" );
        Scanner sc = new Scanner(System.in);
        int nota1= sc.nextInt();

        if (nota1 > 6){
            System.out.println("aprovado ");
            if(nota1 >= 10){
                System.out.println("voce tiroua nota maxima");
            }
        } else  {
            System.out.println("reprovado ");
        }
    }

}

package RevisãodeIfElseM;

import java.util.Scanner;

public class mex3 {
    	public static void main(String[] args) {

        System.out.println("Digite sua nota" );
        Scanner sc = new Scanner(System.in);
        int nota1= sc.nextInt();
        System.out.println("Digite sua segunda nota" );
        int nota2= sc.nextInt();
        System.out.println("Digite a terceir nota" );
        int nota3 = sc.nextInt();

        if(nota1 > nota2 && nota1 > nota3){
            System.out.println("maior " + nota1);
        } else if (nota2 > nota1 && nota2 > nota3){
            System.out.println("maior " + nota2);
        }else {
            System.out.println("maior " + nota3);
        }
        if (nota1 < nota2 && nota1 < nota3){
            System.out.println("menor " + nota1);
        } else if (nota2 < nota1 && nota2 < nota3) {
            System.out.println("menor " + nota2);
        }else{
            System.out.println("menor " + nota3);
        }
    }

}

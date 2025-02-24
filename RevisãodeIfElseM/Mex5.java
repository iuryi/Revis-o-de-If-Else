package RevisãodeIfElseM;

import java.util.Scanner;

public class Mex5 {
    public static void main(String[] args) {

        System.out.println("Digite sua nota");
        Scanner sc = new Scanner(System.in);
        int nota1 = sc.nextInt();
        System.out.println("Digite sua nota");
        int nota2 = sc.nextInt();
        if (nota1 > 6) {
            System.out.println("aprovado ");
            if (nota1 >= 10) {
                System.out.println("voce tiroua nota maxima");
            }
        } else {
            System.out.println("reprovado ");
        }
        if (nota2 > 6) {
            System.out.println("aprovado na segunda materia");
            if (nota1 >= 10) {
                System.out.println("voce tiroua nota maxima na segunda materia");
            }
        } else {
            System.out.println("reprovado ");
        }


    }
}

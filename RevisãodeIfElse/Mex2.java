package RevisãodeIfElse;

import java.util.Scanner;

public class Mex2 {
    public static void main(String[] args) {

        System.out.println("Digite um numero" );
        Scanner sc = new Scanner(System.in);
        int  nota1= sc.nextInt();
        System.out.println("Digite um numero" );
        int nota2= sc.nextInt();
        int soma = nota1 + nota2;
        if(soma>=16){
            System.out.print("aprovado");
        } else if (soma>=10 && nota1<14){
            System.out.print("recuperação");
        }else {
            System.out.print("reprovado");
        }
    }

}

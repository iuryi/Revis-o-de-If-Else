package RevisãodeIfElseM;

import java.util.Scanner;

public class Mex1 {
    public static void main(String[] args) {

    System.out.println("Digite um numero" );
    Scanner sc = new Scanner(System.in);
    int  nota1= sc.nextInt();
    System.out.println("Digite um numero" );
    int nota2= sc.nextInt();
    if(nota1 + nota2>=14){
        System.out.print("esta na media");
    } else {
        System.out.print("nao esta na media");
    }
}

}

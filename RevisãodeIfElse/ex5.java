package RevisãodeIfElse;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
    System.out.println("digite um numero" );
    Scanner sc = new Scanner(System.in);
    int num1= sc.nextInt();

        System.out.println("digite um numero" );

    int num2 = sc.nextInt();
        System.out.println("digite um numero" );

    int num3 = sc.nextInt();
        if(num1 > num2 && (num1>num3)){
        System.out.print(num1 +" "+ num2+" "+num3);
    } else if (num3>num1 && (num2>num1)){
        System.out.print(num3 +" "+ num2+" "+num1);
    }
        else {
        System.out.print(num3 + " " + num1 + " " + num3);
    }
}

}

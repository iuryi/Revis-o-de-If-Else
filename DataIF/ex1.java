package DataIF;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o horário (0-23): ");
        int horario = sc.nextInt();

        if (horario >= 0 && horario <= 23) {
            System.out.println("Horário válido.");
        } else {
            System.out.println("Horário inválido.");
        }
    }
}

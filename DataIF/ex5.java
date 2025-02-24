package DataIF;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um dia: ");
        int dia = scanner.nextInt();
        System.out.print("Digite um mês: ");
        int mes = scanner.nextInt();
        System.out.print("Digite um ano: ");
        int ano = scanner.nextInt();

        System.out.print("Digite o dia inicial do período: ");
        int diaInicio = scanner.nextInt();
        System.out.print("Digite o mês inicial do período: ");
        int mesInicio = scanner.nextInt();
        System.out.print("Digite o ano inicial do período: ");
        int anoInicio = scanner.nextInt();

        System.out.print("Digite o dia final do período: ");
        int diaFim = scanner.nextInt();
        System.out.print("Digite o mês final do período: ");
        int mesFim = scanner.nextInt();
        System.out.print("Digite o ano final do período: ");
        int anoFim = scanner.nextInt();

        if ((ano > anoInicio || (ano == anoInicio && mes > mesInicio) || (ano == anoInicio && mes == mesInicio && dia >= diaInicio)) &&
                (ano < anoFim || (ano == anoFim && mes < mesFim) || (ano == anoFim && mes == mesFim && dia <= diaFim))) {
            System.out.println("A data está dentro do período.");
        } else {
            System.out.println("A data está fora do período.");
        }
    }
}


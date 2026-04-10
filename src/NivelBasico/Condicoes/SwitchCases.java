package NivelBasico.Condicoes;

import java.util.Scanner;

public class SwitchCases {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Escolha o ninja: ");
        System.out.println("1 - Rock Lee");
        System.out.println("2 - Sasuke Uchiha");
        System.out.println("3 - Shikamaru Naara");
        System.out.println("");

        System.out.print("Digite a opção escolhida: ");
        int opcao = scan.nextInt();

        switch (opcao) {
            case 1 :
                System.out.println("O brabo do TaiJutsu!");
                break;

            case 2 :
                System.out.println("Tem um sharingan e sabe soltar chidori.");
                break;

            case 3 :
                System.out.println("Preguiçoso que só, mas muito inteligente.");
                break;

            default:
                System.out.println("Opção inválida.");
        }


        scan.close();
    }
}

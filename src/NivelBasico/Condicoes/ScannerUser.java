package NivelBasico.Condicoes;

import java.util.Scanner;

public class ScannerUser {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o nome do ninja: ");
        String nomeNinja = scan.next();

        System.out.print("Digite a idade do ninja: ");
        int idadeNinja = scan.nextInt();

        if (idadeNinja >= 15) {
            System.out.println("Pode fazer missão dificuldade S.");
        } else {
            System.out.println("Com essa idade só missão dificuldade C ou D.");
        }

    scan.close();
    }
}

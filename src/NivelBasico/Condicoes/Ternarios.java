package NivelBasico.Condicoes;

import java.util.Scanner;

public class Ternarios {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite sua idade para saber se é MAIOR DE IDADE.");
        int idade = scan.nextInt();

        String ternario = (idade < 18) ? "É MENOR de idade." : "É MAIOR de idade.";
        System.out.println(ternario);


        scan.close();
    }

}

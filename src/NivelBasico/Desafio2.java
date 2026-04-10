package NivelBasico;

import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantidadeNinjas = 0;
        String[] Ninjas = new String[10];
        int opcaoMenu = 0;

        while(opcaoMenu != 4){
            System.out.println("============ MENU =============");
            System.out.println("1 - Cadastrar novo ninja");
            System.out.println("2 - Listar ninjas");
            System.out.println("3 - Deletar ultimo cadastro");
            System.out.println("4 - Sair");

            System.out.print("Escolha a opção desejada: ");
            opcaoMenu = scan.nextInt();
            scan.nextLine();

        switch (opcaoMenu) {
            case 1:
                if (quantidadeNinjas < Ninjas.length) {
                    System.out.println("===== CADASTRO DE NINJAS ======");
                    System.out.print("Nome do ninja: ");
                    Ninjas[quantidadeNinjas] = scan.nextLine();
                    quantidadeNinjas++;
                    System.out.println("Ninja cadastrado com sucesso. ");
                    System.out.println("Voltando ao menu principal...");
                } else {
                    System.out.println("O banco de dados NINJAS está cheio!");
                    System.out.println("Favor liberar mais espaço na memória.");
                }
                break;

            case 2:
                System.out.println("===== LISTAGEM DE NINJAS ======");
                for (int i = 0; i < Ninjas.length ; i++) {
                    if (Ninjas[i] != null){
                        System.out.println(" - " + Ninjas[i]);
                    } else if (quantidadeNinjas == 0) {
                        System.out.println("Não há ninjas cadastrados ainda.");
                        break;
                    }
                }
                break;

            /*case 3:
                System.out.println("======= DELETAR NINJA ========");
                Ninjas[quantidadeNinjas] = null;
                System.out.println("X X X X X X X X X X");
                System.out.println("O último cadastro de Ninja foi deletado!");
                System.out.println("X X X X X X X X X X");

                break;*/


            case 4:
                System.out.println("Encerrando programa...");
                break;

            default:
                System.out.println("Opção inválida.");

        }
        }

        scan.close();
    }
}

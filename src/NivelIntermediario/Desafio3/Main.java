package NivelIntermediario.Desafio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Ninja[] ninjas = new Ninja[5];
        Uchiha[] uchiha = new Uchiha[5];

        int qtdNinjas = 0;
        int qtdUchihas = 0;
        int opcaoMenu = 0;

        while (opcaoMenu != 3) {
            System.out.println(" ---------- MENU PRINCIPAL ---------- ");
            System.out.println("1 - Exibir informações dos NINJAS");
            System.out.println("2 - Cadastrar ninja ou atualização de infos");
            System.out.println("3 - Encerrar programa");
            System.out.print("Escolha uma opcão: ");
            opcaoMenu = scan.nextInt();
            scan.nextLine();

            switch (opcaoMenu) {
                case 1:
                    if (qtdNinjas == 0 && qtdUchihas == 0) {
                        System.out.println("Não há ninjas cadastrados ainda!");
                        System.out.println("Voltando ao menu...");
                    } else {
                        System.out.println(" ---------- LISTAGEM ---------- ");
                        for (int i = 0; i < qtdNinjas; i++) {
                            ninjas[i].mostrarInformacoes();
                        }
                        for (int i = 0; i < qtdUchihas; i++) {
                            uchiha[i].mostrarInformacoes();
                        }
                    }
                    break;
                case 2:
                    int opcaoNinja = 0;

                    while (opcaoNinja != 4) {
                        System.out.println(" ---------- CADASTRO ---------- ");
                        System.out.println("1 - Cadastrar NINJA");
                        System.out.println("2 - Cadastrar UCHIHA");
                        System.out.println("3 - Atualizar HABILIDADE ESPECIAL");
                        System.out.println("4 - Voltar ao MENU principal");
                        System.out.print("Escolha uma opcão: ");
                        opcaoNinja = scan.nextInt();
                        scan.nextLine();

                        switch (opcaoNinja) {
                            case 1:
                                if (qtdNinjas == ninjas.length) {
                                    System.out.println("O número máximo de Ninjas foi atingido!");
                                    System.out.println("Voltando ao menu...");
                                } else {
                                    System.out.println(" ---------- CADASTRO NINJA ---------- ");
                                    ninjas[qtdNinjas] = new Ninja();
                                    System.out.print("Nome: ");
                                    ninjas[qtdNinjas].nome = scan.nextLine();
                                    System.out.print("Idade: ");
                                    ninjas[qtdNinjas].idade = scan.nextInt();
                                    scan.nextLine();
                                    System.out.print("Missão: ");
                                    ninjas[qtdNinjas].missao = scan.nextLine();
                                    System.out.print("Dificuldade: ");
                                    ninjas[qtdNinjas].nivelDificuldade = scan.nextLine();
                                    System.out.print("Status: ");
                                    ninjas[qtdNinjas].statusMissao = scan.nextLine();
                                    qtdNinjas++;
                                    System.out.println("Ninja cadastrada com sucesso!");
                                }
                                break;
                            case 2:
                                if (qtdUchihas == uchiha.length) {
                                    System.out.println("O número máximo de Uchihas foi atingido!");
                                    System.out.println("Voltando ao menu...");
                                } else {
                                    System.out.println(" ---------- CADASTRO UCHIHA ---------- ");
                                    uchiha[qtdUchihas] = new Uchiha();
                                    System.out.print("Nome: ");
                                    uchiha[qtdUchihas].nome = scan.nextLine();
                                    System.out.print("Idade: ");
                                    uchiha[qtdUchihas].idade = scan.nextInt();
                                    scan.nextLine();
                                    System.out.print("Missão: ");
                                    uchiha[qtdUchihas].missao = scan.nextLine();
                                    System.out.print("Dificuldade: ");
                                    uchiha[qtdUchihas].nivelDificuldade = scan.nextLine();
                                    System.out.print("Status: ");
                                    uchiha[qtdUchihas].statusMissao = scan.nextLine();
                                    System.out.print("Habilidade Especial: ");
                                    uchiha[qtdUchihas].habilidadeEspecial = scan.nextLine();
                                    qtdUchihas++;
                                    System.out.println("Ninja cadastrada com sucesso!");
                                }
                                break;
                            case 3:
                                if(qtdUchihas == 0){
                                    System.out.println("Não há UCHIHAS a serem atualizados.");
                                    System.out.println("Faça um cadastro e tente novamente.");
                                } else {
                                    String nomePesquisado;
                                    System.out.println(" ---------- ATUALIZAR HABILIDADE ESPECIAL ---------- ");
                                    System.out.print("PESQUISA >>> NOME: ");
                                    nomePesquisado = scan.nextLine();
                                    for (int i = 0; i < qtdUchihas; i++) {
                                        if (uchiha[i].nome.equals(nomePesquisado)){
                                            System.out.print("Informe a nova habilidade de " +uchiha[i].nome+ ": ");
                                            uchiha[i].habilidadeEspecial = scan.nextLine();
                                            System.out.println("Habilidade especial atualizada com sucesso!");
                                        } else {
                                            System.out.println("Uchiha não encontrado.");
                                        }
                                    }
                                }
                                break;
                            case 4:
                                System.out.println("Voltando ao menu principal...");
                                break;
                            default:
                                System.out.println("Opção invalida!");
                                break;
                        }
                    }
                    break;
                case 3:
                    System.out.println("Encerrando programa...");
                    break;
                default:
                    System.out.println("Opço invalida!");
                    break;
            }
        }
    }
}

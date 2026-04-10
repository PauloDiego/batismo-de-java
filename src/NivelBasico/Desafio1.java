package NivelBasico;

public class Desafio1 {
    public static void main(String[] args) {
        //Ninja 1
        String nomeNJ1 = "Rock Lee";
        int idadeNJ1 = 14;

        String missaoNJ1 = "Treinar NinJutsu";
        char nivelMissaoNJ1 = 'S';
        String statusMissaoNJ1 = "Pendente";

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Ninja 1");
        System.out.println("Nome: "+nomeNJ1);
        System.out.println("Idade: "+idadeNJ1);
        System.out.println();
        System.out.println("Missão: "+missaoNJ1);
        System.out.println("Dificuldade: "+nivelMissaoNJ1);
        System.out.println("Status: "+statusMissaoNJ1);
        System.out.println();

        if (idadeNJ1 >= 15) {
            statusMissaoNJ1 = "Concluído";
            System.out.println("Status da missão: "+statusMissaoNJ1);
        } else if (idadeNJ1 < 15 && (nivelMissaoNJ1 == 'C' || nivelMissaoNJ1 == 'D')){
            statusMissaoNJ1 = "Concluído";
            System.out.println("Status da missão: "+statusMissaoNJ1);
        }else {
            System.out.println("Com a idade atual você só pode" +
                    " fazer missões de dificuldade C ou D.");
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");

        //Ninja 2
        String nomeNJ2 = "Neji Hyuga";
        int idadeNJ2 = 13;

        String missaoNJ2 = "Perseguir invasores";
        char nivelMissaoNJ2 = 'C';
        String statusMissaoNJ2 = "Pendente";

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Ninja 2");
        System.out.println("Nome: "+nomeNJ2);
        System.out.println("Idade: "+idadeNJ2);
        System.out.println();
        System.out.println("Missão: "+missaoNJ2);
        System.out.println("Dificuldade: "+nivelMissaoNJ2);
        System.out.println("Status: "+statusMissaoNJ2);
        System.out.println();

        if (idadeNJ2 >= 15) {
            statusMissaoNJ2 = "Concluído";
            System.out.println("Status da missão: "+statusMissaoNJ2);
        } else if (idadeNJ2 < 15 && (nivelMissaoNJ2 == 'C' || nivelMissaoNJ2 == 'D')){
            statusMissaoNJ2 = "Concluído";
            System.out.println("Status da missão: "+statusMissaoNJ2);
        }else {
            System.out.println("Com a idade atual você só pode" +
                    " fazer missões de dificuldade C ou D.");
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");

        //Ninja 3
        String nomeNJ3 = "Sakura Haruno";
        int idadeNJ3 = 15;

        String missaoNJ3 = "Estudar jutsus de cura";
        char nivelMissaoNJ3 = 'S';
        String statusMissaoNJ3 = "Pendente";

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Ninja 3");
        System.out.println("Nome: "+nomeNJ3);
        System.out.println("Idade: "+idadeNJ3);
        System.out.println();
        System.out.println("Missão: "+missaoNJ3);
        System.out.println("Dificuldade: "+nivelMissaoNJ3);
        System.out.println("Status: "+statusMissaoNJ3);
        System.out.println();

        if (idadeNJ3 >= 15) {
            statusMissaoNJ3 = "Concluído";
            System.out.println("Status da missão: "+statusMissaoNJ3);
        } else if (idadeNJ3 < 15 && (nivelMissaoNJ3 == 'C' || nivelMissaoNJ3 == 'D')){
            statusMissaoNJ3 = "Concluído";
            System.out.println("Status da missão: "+statusMissaoNJ3);
        }else {
            System.out.println("Com a idade atual você só pode" +
                    " fazer missões de dificuldade C ou D.");
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");


    }
}

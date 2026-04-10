package NivelIntermediario.Desafio3;

public class Ninja {
    String nome;
    int idade;
    String missao;
    String nivelDificuldade;
    String statusMissao;

    public void mostrarInformacoes() {
        System.out.println(" - NINJA -  ");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos.");
        System.out.println("Missão: " + missao);
        System.out.println("Dificuldade da missão: " + nivelDificuldade);
        System.out.println("Status da missão: " + statusMissao);
    }
}

package NivelIntermediario.Heranca;

public class Ninja {
    String nome;
    String aldeia;
    int idade;

    //Criando um método public personalizado.
    /*
        Método void não retorna valor nenhum.
    */
    public void mostrarDetalhes() {
        System.out.println("----------------------------");
        System.out.println("Dados no ninja");
        System.out.println("----------------------------");
        System.out.println("Nome: " + nome);
        System.out.println("Aldeia: " + aldeia);
        System.out.println("Idade: " + idade);
        System.out.println("----------------------------");
    }
    /*
        Método String TÊM que retornar uma String
    */
    public String boasVindas() {
        return "Olá eu sou " + nome + " e eu sou um ninja!";
    }

    /*
        Método int TÊM que retornar um int
    */
    public int mostrarAnosParaSerHokage(int idadeParaSerHokage) {
        return idadeParaSerHokage - idade;
    }


}

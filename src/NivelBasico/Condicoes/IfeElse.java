package NivelBasico.Condicoes;

public class IfeElse {
    public static void main(String[] args) {
        String nomeNinja = "Rock Lee";
        int idadeNinja = 16;
        boolean PodeUsarJutsu = false;
        short numMissoes = 21;

        if (numMissoes>10){
            System.out.println(nomeNinja +" pode subir de nivel");
        } else {
            System.out.println(nomeNinja+" precisa fazer mais missões para subir de nivel.");
        }

        if ((idadeNinja >= 16) && (numMissoes >= 20)) {
            System.out.println(nomeNinja+" se tornou Chunin!");
        }
    }

}

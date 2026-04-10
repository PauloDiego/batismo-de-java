package NivelBasico.EstruturaDeDados;

public class Arrays2D {
    public static void main(String[] args) {

        //Arrays simples
        /*String[] ninjas = new String[3];

        ninjas[0] = "Rock Lee";
        ninjas[1] = "Gaara do deserto";
        ninjas[2] = "Neji Hyuga";

        for (int i = 0; i < ninjas.length; i++) {
            System.out.println(ninjas[i]);
        }*/

        String[][] ninjasEAldeias = new String[3][3];

        ninjasEAldeias[0][0] = "Aldeia da folha";
        ninjasEAldeias[0][1] = "Rock Lee";
        ninjasEAldeias[0][2] = "Kakashi";

        ninjasEAldeias[1][0] = "Aldeia da areia";
        ninjasEAldeias[1][1] = "Gaara";
        ninjasEAldeias[1][2] = "Temari";

        ninjasEAldeias[2][0] = "Aldeia da Névoa";
        ninjasEAldeias[2][1] = "Zabuza";
        ninjasEAldeias[2][2] = "Haku";

        for (int i = 0; i < ninjasEAldeias.length; i++) {
            for (int j = 0; j < ninjasEAldeias.length; j++) {
                System.out.println(ninjasEAldeias[i][j]);
            }
        }
    }
}

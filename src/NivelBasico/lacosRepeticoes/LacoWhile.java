package NivelBasico.lacosRepeticoes;

public class LacoWhile {
    public static void main(String[] args) {
        int clones = 0;
        int clonesMax = 25;

        while (clones < clonesMax) {
            clones+=2;
            System.out.println("Jutsu clones da sombras: CLONES +"+clones);
        }
    }
}

package NivelBasico.EstruturaDeDados;

public class Arrays {
    public static void main(String[] args) {
        /*String ninja1 = "Rock Lee";
        String ninja2 = "Shikamaru Naara";
        String ninja3 = "Neji Hyuga";

        System.out.println(ninja1);
        System.out.println(ninja2);
        System.out.println(ninja3);*/

        String[] ninjas = new String[5];
        int[] idades = new int[3];

        ninjas[0] = "Rock Lee";
        ninjas[1] = "Shikamaru Naara";
        ninjas[2] = "Neji Hyuga";
        ninjas[3] = "Naruto Uzumaki";
        ninjas[4] = "Kakashi Hatake";

        idades[0] = 15;
        idades[1] = 13;
        idades[2] = 17;
        System.out.println(idades[3]);

        for (int i = 0; i < ninjas.length; i++) {
            System.out.println("Ninja "+(i+1)+": "+ninjas[i]);
        }


    }
}

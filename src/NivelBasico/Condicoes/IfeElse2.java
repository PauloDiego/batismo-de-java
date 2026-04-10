package NivelBasico.Condicoes;

import java.util.Scanner;

public class IfeElse2 {
    public static void main(String[] args) {

        String ninjaName = "Kakashi";
        Scanner poder = new Scanner(System.in);

        System.out.println("Digite o poder do " + ninjaName);
        String power = poder.next();

        if (power.equals("Katon")) {
            System.out.println("Brabo, soltou um Katon 🔥");
        } else if (power.equals("Fuuton")) {
            System.out.println("Soltou um Fuuton 🍃");
        } else if (power.equals("Raiton")) {
            System.out.println("Soltou um Raiton⛈️");
        } else if (power.equals("Doton")) {
            System.out.println("Soltou um Doton 🪨");
        } else {
            System.out.println("Soltou um Suiton🌊");
        }
        

    }

    }


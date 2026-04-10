package NivelIntermediario.Heranca;

public class Main {
    public static void main(String[] args) {
        //Criando objetos ninjas a partir da classe Ninja
        Ninja ninja1 = new Ninja();
        ninja1.nome = "Rock Lee";
        ninja1.aldeia = "Aldeia da Folha";
        ninja1.idade = 15;

        Ninja ninja2 = new Ninja();
        ninja2.nome = "Gaara do Deserto";
        ninja2.aldeia = "Aldeia da Areia";
        ninja2.idade = 16;

        //objeto da classe Uchiha filha da classe Ninja
        Uchiha ninja3 = new Uchiha();
        ninja3.nome = "Itachi Uchiha";
        ninja3.aldeia = "Renegado da Aldeia da Folha";
        ninja3.idade = 25;

        //objeto da classe Hyuga filha da classe Ninja
        Hyuga ninja4 = new Hyuga();
        ninja4.nome = "Neji Hyuga";
        ninja4.aldeia = "Aldeia da Folha";
        ninja4.idade = 17;

        //usando metodos da classe Ninja

        /*ninja1.mostrarDetalhes()
        String mensagem = ninja1.boasVindas();
        System.out.println(mensagem);
        int quantoFalta = ninja1.mostrarAnosParaSerHokage(60);
        System.out.println("Faltam "+quantoFalta+" anos para que "+ninja1.nome+" se torne Hokage.");*/

            /*Usando herança para usar métodos da classe Ninja(mostrarDetalhes()) e
            da classe Uchiha(usarSharingan()).*/
        ninja3.mostrarDetalhes();
        ninja3.usarSharingan();

            /*Usando herança para usar métodos da classe Ninja(mostrarDetalhes()) e
            da classe Hyuga(usarByakugan()).*/
        ninja4.mostrarDetalhes();
        ninja4.usarByakugan();

    }
}

package okushi.guilherme;

public class Basico02 {
    //Estruturas de decisao
    public static void main(String[] args) {
        int ano = 2020;

        //Estrutura de decisao simples
        //Pra comentar como abaixo use ctrl + /
//        if (ano % 2 == 0){
//            System.out.println("Ano par!");
//        }
//        if (ano % 2 == 1){
//            System.out.println("Ano impar!");
//        }

        //Estrutura de decisao composta
        if (ano % 2 == 0) {
            System.out.println("Ano par!");
        }else {
            System.out.println("Ano impar!");
        }

        //Varias decisoes
        switch (ano){
            case 2020:
                System.out.println("VIXI!");
                break;
            case 1996:
                System.out.println("Pokemon Red!");
                break;
            default:
                System.out.println("Quase Boku no Hero saindo!!!");
                break;
        }
    }
}

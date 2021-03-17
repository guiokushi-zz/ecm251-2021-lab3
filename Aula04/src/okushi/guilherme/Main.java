package okushi.guilherme;

public class Main {

    public static void main(String[] args) {
	    //Cria uma referencia para Conta e Instanciar um objeto conta
        Conta c1 = new Conta();
        //ou
//        Conta c1;
//        c1 = new Conta();
        c1.titular = new Cliente();
        c1.titular.titular = "Inuyasha";
        c1.saldo = 199.99;
        c1.visualizarSaldo();

        Conta c2 = new Conta();
        c2.titular = new Cliente();
        c2.titular.titular = "Seichomaru";
        c2.saldo = 1000;
        c2.visualizarSaldo();

        c1.depositar(20);
        c2.depositar(35.99);

        c1.visualizarSaldo();
        c2.visualizarSaldo();

        if (c1.sacar(100)){
            System.out.println("Deu bom!");
        } else {
            System.out.println("Deu ruim!");
        }
        c1.visualizarSaldo();

        if(c1.transferirPara(100, c2)){
            System.out.println("deu bom! Transferiu!");
        }else {
            System.out.println("Deu ruim! Não foi!");
        }
        c1.visualizarSaldo();
        c2.visualizarSaldo();

        System.out.println("C1: " + c1.toString());
        System.out.println("C2: " + c2.toString());
    }
}

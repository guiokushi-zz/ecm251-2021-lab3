package okushi.guilherme;

public class Conta {
    int numero;
    double saldo;
    Cliente titular;

    void visualizarSaldo(){
        double saldo = this.saldo;
        System.out.println("Saldo da conta: R$" + this.saldo);
    }
    void depositar(double valor){
        this.saldo += valor;

    }
    boolean sacar(double valor){
        if (this.saldo >= valor){
            this.saldo -= valor;
            return true;
        }
        return false;
    }
    boolean transferirPara(double valor, Conta destino){
        destino.depositar(valor);
        if (this.sacar(valor)){
            destino.depositar(valor);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "numero=" + numero +
                ", saldo=" + saldo +
                ", titular=" + titular +
                '}';
    }
}

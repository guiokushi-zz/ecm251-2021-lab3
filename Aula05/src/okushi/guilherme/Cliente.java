package okushi.guilherme;

public class Cliente {
    String titular;
    String cpf;
    String sobrenome;

    public Cliente(String titular) {
        this.titular = titular;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "titular='" + titular + '\'' +
                ", cpf='" + cpf + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                '}';
    }
}

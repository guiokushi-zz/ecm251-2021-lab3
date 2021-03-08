package okushi.guilherme;

public class Cliente {
    String titular;
    String cpf;
    String sobrenome;

    @Override
    public String toString() {
        return "Cliente{" +
                "titular='" + titular + '\'' +
                ", cpf='" + cpf + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                '}';
    }
}

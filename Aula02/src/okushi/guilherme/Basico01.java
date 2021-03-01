package okushi.guilherme;

public class Basico01 {
    public static void main(String[] args) {
        //Tipos primitivos de Java
        int numero;
        float hp;
        double atk;
        boolean gigantamax;
        String nome;

        //Atribuição de variaveis
        numero = 25;
        hp = 155.0f;
        atk = 255.0;
        gigantamax = true;
        nome = "Pikachu";

        //Exibe os valores das variaveis
        System.out.println("Nome: " + nome);
        System.out.println("Gigantamax: " + gigantamax);
        System.out.println("HP: " + hp + " Atk: " + atk);
    }
}

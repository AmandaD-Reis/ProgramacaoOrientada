public class Main {
    public static void main(String[] args) {
        String especie, nome, som;
        int idade;
        double qntComida;

        especie = "Cachorro";
        nome = "Shesheu";
        qntComida = 1.5;
        idade = 2;
        som = "au au";

                System.out.println(nome + " " + idade + " anos.");
        System.out.println(nome + " come " + qntComida + " kg e faz " + som + ".");
        System.out.println("\n");

        especie = "Peixe";
        nome = "Nemo";
        qntComida = 0.140;
        idade = 1;
        som = "glup glup";

        System.out.println(nome + " " + idade + " anos.");
        System.out.println(nome + " come " + qntComida + " kg e faz " + som + ".");
        System.out.println("\n");

        especie = "Gato";
        nome = "Snow";
        qntComida = 0.5;
        idade = 3;
        som = "miau";

        System.out.println(nome + " " + idade + " anos.");
        System.out.println(nome + " come " + qntComida + " kg e faz " + som + ".");
    }
}
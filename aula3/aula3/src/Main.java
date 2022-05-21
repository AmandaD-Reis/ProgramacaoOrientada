import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int numero;

                boolean primo = false;
                if (numero.equals(2)) {
                    primo = true;
                }
                for (int i = 2; i < numero; i++) {
                    if (!numero.equals(i)) {
                        int resto = numero % i;
                        if (resto != 0) {
                            primo = true;
                        } else {
                            primo = false;
                            break;
                        }
                    }
                }

            }

            // exericio 3
            static void printPrimos(int valor) {
                int numero = 2;
                while (valor > 0) {
                    if (numeroPrimo(numero)) {
                        System.out.println(numero);
                        valor--;
                    }
                    numero++;
                }
            }


            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                int numeroPrimo;

                System.out.println("Digite quantos números primos você quer que apareça");
                numeroPrimo = scanner.nextInt();
                printPrimos(numeroPrimo);
            }
        }
    }
}
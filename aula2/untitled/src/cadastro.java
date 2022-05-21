import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class cadastro {
    public static void main(String[] args) {
        String nome, sobrenome;

        Scanner entNome=new Scanner(System.in);
        System.out.println("Digite seu nome:");
        nome=entNome.next();

        Scanner entSobrenome=new Scanner(System.in);
        System.out.println("Digite seu sobrenome:");
        sobrenome=entSobrenome.next();

        char primeiraLetraNome=nome.charAt(0);

        char primeiraLetraSobrenome=sobrenome.charAt(0);

        String dia,mes,ano;

        Scanner entDia=new Scanner(System.in);
        System.out.println("Digite seu dia de nascimento:");
        dia = entDia.next();

        Scanner entMes=new Scanner(System.in);
        System.out.println("Digite seu mês de nascimento:");
        mes = entMes.next();

        Scanner entAno=new Scanner(System.in);
        System.out.println("Digite seu Ano de nascimento:");
        ano = entAno.next();


        String dataNasc= dia +"/"+ mes+"/" + ano;

        System.out.println("olá, seu nome é "+ nome + ", "+ primeiraLetraNome +" "+ primeiraLetraSobrenome
                + " e sua data de nascimento é "+ dataNasc +"." );
    }
}

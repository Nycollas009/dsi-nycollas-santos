import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US); // define de virgula pra decimal mudando o locale

        // entrada e leitura de DADOS
        System.out.print("Digite o código do funcionário: ");
        int codigoFuncionario = scanner.nextInt();

        System.out.print("Digite o sexo (M para masculino e F para Feminino): ");
        char sexo = scanner.next().toUpperCase().charAt(0);

        System.out.print("digite o tempo de trabalho (em anos): ");
        int tempoTrabalho = scanner.nextInt();

        System.out.print("Digite o sálario atual (R$): " );
        double salario = scanner.nextDouble();

        //Cáculo do bonus variando o tempo e sexo
        double bonus = 0.0;


        if (sexo == 'M' && tempoTrabalho > 15) {
            bonus = salario * 0.20;
        } else if (sexo =='F' && tempoTrabalho > 10) {
            bonus = salario * 0.25;
        } else {
            bonus = 100.00;
        }

        // 4. Exibição dos resultados
        System.out.println("\n=========================================");
        System.out.println("          RECIBO DE BONUS DE NATAL       ");
        System.out.println("=========================================");
        System.out.println("Codigo do Funcionario: " + codigoFuncionario);
        System.out.printf("Salario Base: R$ %.2f\n", salario);
        System.out.printf("Valor do Bonus: R$ %.2f\n", bonus);
        System.out.println("=========================================");

        scanner.close();

    }
}
import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        // Configura o Scanner para aceitar pontos em numeros decimais
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // 1. Leitura dos três lados
        System.out.print("Digite o valor do lado A: ");
        double a = scanner.nextDouble();

        System.out.print("Digite o valor do lado B: ");
        double b = scanner.nextDouble();

        System.out.print("Digite o valor do lado C: ");
        double c = scanner. nextDouble();

        // Oganização em ordem Decrescente
        double temp;
        if (b > a) {
            temp = a; a = b; b = temp;
        }
        if (c > a) {
            temp = a; a = c; c = temp;
        }
        if (c > b) {
            temp = b; b = c; c = temp;
        }

        // Exibição dos valores lido e ordenados

        System.out.println("\n=========================================");
        System.out.println("Lados ordenados (Decrescente):");
        System.out.println("Maior lado (a): " + a);
        System.out.println("Lado do meio (b): " + b);
        System.out.println("Menor lado (c): " + c);
        System.out.println("=========================================");

        // Verificação da existência e do tipo de triângulo
        if ( a>= b + c){
            System.out.println("Mensagem: Não formam triângulo algum.");
        } else {
            //Verificação quanto aos angulos

        if ((a * a) == (b * b + c * c)) {
            System.out.println("Mensagem: Formam um triângulo retângulo.");
        } else if ((a * a) > (b * b + c * c)) {
            System.out.println("Mensagem: Formam um triângulo obtusângulo.");
        } else if ((a * a) < (b * b + c * c)) {
            System.out.println("Mensagem: Formam um triângulo acutângulo.");
        }

        // Verificação dos lados
        if ( a == b && b == c) {
            System.out.println("Mensagem: Formam um triângulo equilátero.");
        } else if (a == b || b == c || a == c) {
            System.out.println("Mensagem: Formam um triângulo isóceles.");
        }
    }
    
        System.out.println("=========================================");

        scanner.close();
    }
}
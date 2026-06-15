import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        
        System.out.print("Digite o valor do lado A: ");
        double a = scanner.nextDouble();

        System.out.print("Digite o valor do lado B: ");
        double b = scanner.nextDouble();

        System.out.print("Digite o valor do lado C: ");
        double c = scanner. nextDouble();

        
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

        

        System.out.println("\n=========================================");
        System.out.println("Lados ordenados (Decrescente):");
        System.out.println("Maior lado (a): " + a);
        System.out.println("Lado do meio (b): " + b);
        System.out.println("Menor lado (c): " + c);
        System.out.println("=========================================");

        
        if ( a>= b + c){
            System.out.println("Mensagem: Não formam triângulo algum.");
        } else {
            //Verificação angulos

        if ((a * a) == (b * b + c * c)) {
            System.out.println("Mensagem: Formam um triângulo retângulo.");
        } else if ((a * a) > (b * b + c * c)) {
            System.out.println("Mensagem: Formam um triângulo obtusângulo.");
        } else if ((a * a) < (b * b + c * c)) {
            System.out.println("Mensagem: Formam um triângulo acutângulo.");
        }

        
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
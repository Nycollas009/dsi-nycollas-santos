import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in) .useLocale(Locale.US); // Essa linha define o local como US para aceitar pontos em vez de vírgulas nos numeros decimais

      System.out.print("Digite o nome do funcionário: "); // entrada e leitura de dados
      String nomeFuncionario = scanner.nextLine();
      
      System.out.print("Digite o número  de horas trabalhadas: ");
      double horasTrabalhadas = scanner.nextDouble();
      
      System.out.print("Digite o valor recebido por hora (R$): ");
      double valorHora = scanner.nextDouble();

      System.out.print("Digite o número de filhos menores de 14 anos: ");
      int numFilhos = scanner.nextInt();

      System.out.print("Digite a idade do funcionário: ");
      int idade = scanner.nextInt();

      System.out.print("Digite o tempo de serviço (em anos): ");
      double tempoServico = scanner.nextDouble();

      //Valor fixado para o salário familia por filho
      double valorSalarioFamiliaPorFilho = 50.00;

      //Primeiros Cálculos
      double salarioBruto = horasTrabalhadas * valorHora;
      double descontoINPS = salarioBruto * 0.085;
      double salarioFamiliaTotal = numFilhos * valorSalarioFamiliaPorFilho;

      //Cálculo do Imposto de Renda
      double impostoRenda = 0.0;
      if (salarioBruto > 1500.00) {
        impostoRenda = salarioBruto * 0.15;
      } else if (salarioBruto >= 500.00) {
        impostoRenda = salarioBruto * 0.08;
      } else {
        impostoRenda = 0.0;
      }


      //Calculo Do Adicional (ADIC)
      double adicional = 0.0;
      if (idade > 40){
        impostoRenda = salarioBruto * 0.02;
      } else if (tempoServico > 15) {
        adicional = salarioBruto * 0.035;
      } else if (tempoServico <= 15 && tempoServico > 5 && idade > 30) {
        adicional = salarioBruto * 0.015;
      }

      // Totais e Salário Líquido
      double totalDescontos = descontoINPS + impostoRenda;

      //Sálario familia e o adicional entram somando no salário líquido
      double salarioLiquido = salarioBruto - totalDescontos + salarioFamiliaTotal +adicional;

      // 6. Exibição dos Resultados
        System.out.println("\n=========================================");
        System.out.println("          FOLHA DE PAGAMENTO             ");
        System.out.println("=========================================");
        System.out.println("Funcionário: " + nomeFuncionario);
        System.out.printf("Salário Bruto: R$ %.2f\n", salarioBruto);
        System.out.printf("Adicional (ADIC): R$ %.2f\n", adicional);
        System.out.printf("Total de Descontos (INPS + IR): R$ %.2f\n", totalDescontos);
        System.out.printf("Salário Família: R$ %.2f\n", salarioFamiliaTotal);
        System.out.println("-----------------------------------------");
        System.out.printf("SALÁRIO LÍQUIDO: R$ %.2f\n", salarioLiquido);
        System.out.println("=========================================");

        scanner.close();
    }
}
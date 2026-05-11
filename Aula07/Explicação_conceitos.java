package Aula07;

public class Explicação_conceitos {
    //Switch é usado para substituir uma série de if-else quando se tem várias condições para verificar.
    //  Ele é mais eficiente e legível quando se tem muitas opções.
     public static void main(String[] args) {
    int a = 4;
    switch (a) {
      case 1:
        System.out.println("Monday");
        break;
      case 2:
        System.out.println("Tuesday");
        break;
      case 3:
        System.out.println("Wednesday");
        break;
      case 4:
        System.out.println("Thursday");
        break;
      case 5:
        System.out.println("Friday");
        break;
      case 6:
        System.out.println("Saturday");
        break;
      case 7:
        System.out.println("Sunday");
        break;
    }

    int b = 4;
    switch (b) {
      case 6:
        System.out.println("Today is Saturday");
        break;
      case 7:
        System.out.println("Today is Sunday");
        break;
      default:
        System.out.println("Looking forward to the Weekend");
  }

  // default é usado para fornecer um caso padrão quando nenhuma das condições anteriores é atendida. Ele é opcional, mas é uma boa prática incluí-lo para lidar com casos inesperados.
  // A palavra break é usada para sair do switch após a execução de um caso específico.
  //  Sem o break, o programa continuaria executando os casos, mesmo que eles não correspondam à condição.

  //Loops são usados para repetir um bloco de código várias vezes. Existem três tipos principais de loops em Java: for, while e do-while.

  // while é usado quando o número de iterações não é conhecido e o loop deve continuar até que uma condição seja falsa. O código dentro do while será executado enquanto a condição for verdadeira.
  // do-while é semelhante ao while, mas garante que o código seja executado pelo menos uma vez.
  // for é usado quando o número de iterações é conhecido. Ele consiste em três partes: a inicialização, a condição e a atualização. O código dentro do for será executado enquanto a condição for verdadeira, e a atualização será executada após cada iteração.

  // WHILE

    int i = 0;
    while (i < 5) {
      System.out.println(i);
      i++;
    }

    // DO-WHILE
    int j = 0;
    do {
      System.out.println(j);
      j++;
    } while (j < 5);

    // FOR
    for (int k = 0; k < 5; k++) {
      System.out.println(k);
    }


    //Nested loops são loops dentro de outros loops. Eles são usados para iterar sobre estruturas de dados multidimensionais, como matrizes ou listas de listas.
    for (int m = 0; m < 3; m++) {
      for (int n = 0; n < 3; n++) {
        System.out.println("m: " + m + ", n: " + n);
      }
    }

    //for-each é uma forma simplificada de iterar sobre coleções ou arrays. Ele é usado para percorrer cada elemento de uma coleção sem a necessidade de usar um índice.
    String[] fruits = {"Apple", "Banana", "Cherry"};
    for (String fruit : fruits) {
      System.out.println(fruit);
    }

    //Break/Continue são usados para controlar o fluxo de um loop. O break é usado para sair completamente do loop, enquanto o continue é usado para pular a iteração atual e continuar com a próxima.
    for (int p = 0; p < 5; p++) {
      if (p == 2) {
        continue; // Pula a iteração quando p é igual a 2
      }
      if (p == 4) {
        break; // Sai do loop quando p é igual a 4
      }
      System.out.println(p);
    }
}
  

}

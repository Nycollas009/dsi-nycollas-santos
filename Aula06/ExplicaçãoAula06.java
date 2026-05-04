public class ExplicaçãoAula06 {
    public static void main(String[] args) {
      // Operadores de comparação, funcionam comparando dois valores e retornando um valor booleano (true ou false)

    int a = 5;
    int b = 3;
    System.out.println(a == b); // Retorna false porque 5 não é igual a 3
  

    int c = 5;
    int d = 3;
    System.out.println(c != d); // Retorna true porque 5 não é igual a 3

    int x = 5;
    int y = 3;
    System.out.println(x > y); // Retorna true porque 5 é maior que 3

    System.out.println(x < y); // Retorna false porque 5 não é menor que 3

    System.out.println(x >= y); // Retorna true porque 5 é maior ou igual a 3

    System.out.println(x <= y); // Retorna false porque 5 não é menor ou igual a 3 

      // Operadores lógicos, funcionam combinando expressões booleanas e retornando um valor booleano (true ou false)

    System.out.println(x > 3 && x < 10); // Retorna true porque 5 é maior que 3 e menor que 10

    System.out.println(x > 3 || x < 4); // Retorna true porque 5 é maior que 3 ou menor que 4

     System.out.println(!(x > 3 && x < 10)); // Retorna false porque a negação de true é false
  }
}

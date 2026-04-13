package Aula04;

public class ExemplosVariaveis {
    public static void main(String[] args) {
        String solucion = "Parabéns";
        int items = 50;
        float costPerItem = 190.99f;
        float totalCost = items * costPerItem;
        char currency = '$', x1 = '*', x2 = '!';
        
        System.out.println("Number of items:" + items);
        System.out.println("Cost per item:" + costPerItem + currency);
        System.out.println("Total cost =" + totalCost + x1);
        System.out.println("Solucionado o erro:" + " " + solucion + x2);    
    }
}
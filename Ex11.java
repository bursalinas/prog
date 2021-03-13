import java.util.Scanner;

 public class Ex11
 {
   public static void main(String[] arg)
   {
     Scanner sc = new Scanner(System.in);
     double dolar, taxa;
     double euro;
     System.out.print("Quantia em dolar =");
     dolar = sc.nextDouble();
     System.out.print("Taxa de conversao =");
     taxa = sc.nextDouble();
     euro = dolar*taxa;
     System.out.printf("%4.2f dolares equivalem a %4.2f euros", dolar, euro);
   }
 }

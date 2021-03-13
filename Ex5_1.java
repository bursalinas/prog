import java.util.Scanner;

class Ex5_1
{
    public static final Scanner KB = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Introduza um número: \n");
        double n = KB.nextInt();
        System.out.printf("A raiz quadrada de %.2f é: %.2f", n, sqr(n));
    }

    public static double sqr(double n){
        
        return Math.sqrt(n);
    }
}

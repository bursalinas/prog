import java.util.Scanner;

public class Ex10
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		double temp1;
		double temp2;
		System.out.print("temperatura em graus: ");
		temp1 = sc.nextDouble();
		temp2 = 1.8*temp1+32;
		System.out.printf("A temperatura de %2.1f graus e igual a %2.2f graus Fahrenheit", temp1, temp2);
	}
}

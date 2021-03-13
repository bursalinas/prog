import java.util.Scanner;
public class Ex4_2
{
	public static Scanner sc;
	public static void main(String[] arg)
	{
		sc = new Scanner(System.in);
		double n;
		double produto = 1;
		do
		{
			System.out.print("Introduza um numero:");
			n = sc.nextDouble();
			if(n == 0)
			break;	
			produto = produto * n;
		}
		while(n != 0);
		System.out.printf("Produto = %f", produto);
    }
}

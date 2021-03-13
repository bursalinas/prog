import java.util.Scanner;
public class Ex4_3
{
	public static Scanner sc;
	public static void main(String[] arg)
	{
		sc = new Scanner(System.in);
		double n;
		int counter = 0;
		double max = -999999;
		double min = 999999;
		double media = 0;
		double soma = 0;
		double primeiro = 0;
		do
		{
			System.out.print("Introduza um numero:");
			n = sc.nextDouble();
			if(n < min)
				min = n;
			if(n > max)
				max = n;
			soma += n;
			counter++;
			if(counter == 1)
			{
				primeiro = n;
				n = 0;
			}
		}
		while(n != primeiro);
		media = soma/counter;
		System.out.printf("Media = %f\n", media);
		System.out.printf("Maximo = %f\n", max);
		System.out.printf("Minimo = %f\n", min);
		System.out.printf("Numeros introduzidos: %d ", counter);
	}
}

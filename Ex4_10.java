import java.util.Scanner;
public class Ex4_10
{
	public static Scanner sc;
	public static void main(String[] arg)
	{
		sc = new Scanner(System.in);
		double n;
		int counterp = 0;
		int countern = 0;
		int counter1 = 0;
		int counter2 = 0;
		do
		{
			System.out.print("Introduza um numero: ");
			n = sc.nextDouble();
			if(n < 0)
			countern++;
			else if(n >0)
			counterp++;
			if(n > 100 && n < 1000)
			counter1++;
			if(n > -1000 && n < -100)
			counter2++;
		}
		while(n != 0);
		System.out.println("Numeros positivos: " + counterp);
		System.out.println("Numeros negativos: " + countern);
		System.out.println("Numeros entre 100 e 1000: " + counter1);
		System.out.println("Numeros entre -1000 e -100: " + counter2);
	}
}


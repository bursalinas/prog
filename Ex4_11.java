import java.util.Scanner;
public class Ex4_11
{
	public static Scanner sc;
	public static void main(String[] arg)
	{
		sc = new Scanner(System.in);
		int n = 0, anterior = 0, maior = -99999999, menor = 99999999;
		do
		{
			anterior = n;
			System.out.print("Introduza um numero: ");
			n = sc.nextInt();
			if(n < 0)
			{
			System.out.print("Numero invalido.");
		    continue;
		    }
			if(n > maior)
			maior = n;
			if(n < menor)
			menor = n;								
		}
		while(n != anterior*2);
		System.out.println("Maior = " + maior);
		System.out.println("Menor = " + menor);
		System.out.println("Numero atual: " + n + " Numero anterior: " + anterior);
	}
}

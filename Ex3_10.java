import java.util.Scanner;
public class Ex3_10
{
	public static Scanner sc;
	public static void main(String[] arg)
	{
		sc = new Scanner(System.in);
		exercicio3_10();
	}
	public static void exercicio3_10()
	{
		System.out.print("Introduza um numero: ");
		int n = sc.nextInt();
		int soma = 0;
		if(n < 0)
		{
		System.out.println("Numero invalido");
		return;
	    }
	    for(int i = 1; i < n; i++)
	    {
			if(n % i == 0)
				soma += i;
		}
			if(soma == n)
			 System.out.printf("%d e um numero perfeito", n);
	}
}

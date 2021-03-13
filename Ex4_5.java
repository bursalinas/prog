import java.util.Scanner;
public class Ex4_5
{
	public static Scanner sc;
	public static void main(String[] arg)
	{
		sc = new Scanner(System.in);
		int n;
		do
		{
		System.out.print("Introduza um numero: ");
		n = sc.nextInt();
		if(n < 1)
		System.out.print("Numero invalido.");
	    }
	    while(n < 1);
	    for(int i = 2;i < n; i++)
	    {
			if(n % i == 0)
			{
			System.out.print("O numero nao e primo.");
			return;
		    }
		}
		System.out.print("O numero e primo.");
	}
}

import java.util.Scanner;
public class Ex3_9
{
	public static Scanner sc;
	public static void main(String[] arg)
	{
		sc = new Scanner(System.in);
		exercicio3_9();
	}
	
	public static void exercicio3_9()
	{
		System.out.print("Introduza um numero: ");
		int n = sc.nextInt();
		int soma = 0;
		if(n < 0 || n > 1000)
		 {
			 System.out.println("Numero invalido");
			 return;
		 }
		for(int i = 1, contador = 0; contador < n; i++)
		{
			if(i % 2 == 0)
			{
				contador ++;
				System.out.print(i + " ");
				soma += i;
			}
		}
	System.out.print("\n" + soma);
    }
}

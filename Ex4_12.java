import java.util.Scanner;
public class Ex4_12
{
	public static Scanner sc;
	public static void main(String[] arg)
	{
		sc = new Scanner(System.in);
		int n = 0;
		boolean exclusivamente_impar = true;
		do
		{
			System.out.print("Introduza um numero: ");
			n = sc.nextInt();
			if(n < 0)
			{
			System.out.print("Numero invalido");
			continue;
			}
			if(n % 2 == 0 && n !=0)
			exclusivamente_impar = false;
		}
		while(n != 0);
		if(exclusivamente_impar == false)
		System.out.println("A sequencia de numeros nao e exclusivamente constituida por numeros impares");
		else
		System.out.println("A sequencia de numeros e exclusivamente constituida por numeros impares");

	}
}

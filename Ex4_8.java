import java.util.Scanner;
public class Ex4_8
{
	public static Scanner sc;
	public static void main(String[] arg)
	{
		sc = new Scanner(System.in);
		System.out.print("Introduza um numero: ");
		int x = sc.nextInt();
		System.out.print("Introduza outro numero: ");
		int y = sc.nextInt();
		if(x < 1 || y < 1)
		{
		System.out.print("Numero invalido!");
		return;
		}
		int soma = y;
		do
		{
			x = x/2;
			y = y*2;
			if(x % 2 != 0)
			soma = soma + y;
		}
		while(x != 1 && x > 0);
		System.out.println("Soma= " + soma);
	}
}

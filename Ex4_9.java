import java.util.Scanner;
public class Ex4_9
{
	public static Scanner sc;
	public static void main(String[] arg)
	{
		sc = new Scanner(System.in);
		int n;
		int soma = 0;
		int counter = 0;
		double media = 0;
		do
		{
			System.out.print("Insira a nota: ");
			n = sc.nextInt();
			if(n > 0)
			{
			soma += n;
			counter++;
			}
		}
		while(n > 0);
		media = ((double) soma)/counter;
		System.out.println("Soma = " + soma);
		System.out.println("Media = " + media);
	}
}

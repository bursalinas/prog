import java.util.Scanner;
public class Ex4_6
errado!
{
	public static Scanner sc;
	public static void main(String[] arg)
	{
		sc = new Scanner(System.in);
		int n, r;
		int maior, menor;
		int counter = 1;
		System.out.print("Introduza um numero: ");
		n = sc.nextInt();
		System.out.print("Introduza outro numero: ");
		r = sc.nextInt();
		if(n < 1 || r < 1)
		{
		System.out.print("Numero invalido.");
		return;
	    }
	    if(n < r)
	    {
			maior = r;
			menor = n;
		}
		else
		{
			maior = n;
			menor = r;
		}
		do
		{
			maior -= menor;
			counter++;
		}
		while(maior != menor && maior >0);	
		System.out.println("Maximo divisor comum = " + counter);
	}
}

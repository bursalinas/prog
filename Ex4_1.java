import java.util.Scanner;
public class Ex4_1
{
	public static void main(String[] arg)
	{
		Scanner sc = new Scanner(System.in);
		int counter = 0;
		int n = 0;
		do
		{
			System.out.print("Next: ");
			n = sc.nextInt();
			counter++;
		}
		while(n>=0);
		
		System.out.printf("%d numeros introduzidos.\n", counter-1);
	}
}

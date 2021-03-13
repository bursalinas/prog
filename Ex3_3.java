import java.util.Scanner;
public class Ex3_3
{
	public static void main(String[] arg)
	{
		Scanner sc = new Scanner(System.in);
		int m, fact;
		do
		{
			System.out.print("Introduza um numero");
		    m = sc.nextInt();
		}
		while(m<=0 || m>=11);
		System.out.println("m= "+m);
		fact =1;
		for(int i=1; i<=m; i++)
		{
			fact = fact*i;
		}
		System.out.printf("%3d! = % d%n", m, fact);
	}
}

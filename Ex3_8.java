import java.util.Scanner;
public class Ex3_8
{
	public static void main(String[] arg)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Valor de a: ");
		int a = sc.nextInt();
		System.out.print("Valor de b:");
		int b = sc.nextInt();
		
		int menor, maior;
		menor = (a > b) ? b : a;
		maior = (menor == a) ? b : a;
		
		for(int i = menor; i <= maior; i++)
		 System.out.print((i % 2 != 0) ? i + "\n" : "");
	}
}

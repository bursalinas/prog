import java.util.Scanner;
public class Ex6_4
{
	public static Scanner sc;
	public static void main(String[] args)
	{
		sc = new Scanner(System.in);
		System.out.println("Quantas notas? ");
		int x = sc.nextInt();
		int[] notas = new int[x];
		for(int i = 0; i < x; i++)
		{
			System.out.println("Introduza a nota: ");
			notas[i] = sc.nextInt();
			while(notas[i] < 0 || notas[i] > 20)
			{
				System.out.println("Nota invalida!");
				System.out.println("Introduza a nota novamente: ");
				notas[i] = sc.nextInt();
			}
		}
		int[] hist = new int[21]; //notas de 0 a 20
		for(int i = 0; i < x; i++)
			hist[notas[i]]++;
		for(int i = 0; i < hist.length; i++)
		{
			System.out.println();
			System.out.printf("%3d: ",i);
			for(int k=0; k<hist[i]; k++) 
				System.out.print("*");
		}
	}
}

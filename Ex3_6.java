import java.util.Scanner;
public class Ex3_6
{
	public static void main(String[] arg)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Altura: ");
		int alt = sc.nextInt();
		System.out.print("Comprimento: ");
		int comp = sc.nextInt();
		for(int y= 0; y<alt; y++)
		{
			for(int x = 0; x<comp; x++)
			{
				System.out.print("*");
			}
		    System.out.print("\n");
		}
	}
}  

import java.util.Scanner;
public class Ex3_7
{
	public static void main(String[] arg)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Largura:");
		int lar = sc.nextInt();
		System.out.print("Comprimento:");
		int comp = sc.nextInt();
		for(int y = 0; y<lar; y++)
		{
			for(int x = 0; x<comp; x++)
			{
				if(x == 0 || y == 0 || x == comp-1 || y == lar-1)
			   {
				   System.out.print("*");
			   }
			    else 
			     System.out.print("\n");
			 }
		}
	}
}

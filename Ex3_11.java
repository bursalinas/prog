import java.util.Scanner;
public class Ex3_11
{
	public static void main(String[] arg)
	{
		exercicio3_11();
	}
	public static void exercicio3_11()
	{
		for(int y = 8;y > 0;y--)
		{
			for(int x = 0; x < 8;x++)
			{
			 	char letra = (char)('a' + x);
			 	System.out.printf("%c%d ", letra, y);
			}
		System.out.println();	
		}
	}
}



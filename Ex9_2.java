import java.util.Scanner;
public class Ex9_2
{
	public static Scanner sc;
	public static void main(String[] arg)
	{
		sc = new Scanner(System.in);
		System.out.print("Introduza um nome: ");
		String abc = sc.nextLine();
		System.out.print(acronimo(abc));
		String[] frases = new String[10];
		for(int i = 0; i < frases.length; i++)
		{
			
		}
		for(int i = 0; i < frases.length; i++)
		{
			acronimo(frases[i]);
		}
		
	}
	public static char[] acronimo(String abc)
	{
		char[] letras = new char[abc.length()];
		int n = 0;
		for(int i = 0; i < abc.length(); i++)
		{
			if(Character.isUpperCase(abc.charAt(i)))
			{
			letras[n] = abc.charAt(i);
			n++;
			}
		}
		return letras;
	}
}

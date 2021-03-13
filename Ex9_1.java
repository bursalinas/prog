import java.util.Scanner;
public class Ex9_1
{
	public static Scanner sc;
	public static void main(String[] arg)
	{
		sc = new Scanner(System.in);
		System.out.print("Escreva uma frase: ");
		String frase = sc.nextLine();
		System.out.printf("Frase de entrada -> %s", frase);
		System.out.println();
		int minu = 0;
		int maiu = 0;
		int num = 0;
		int vogal = 0;
		int consoante = 0;
		for(int i = 0; i < frase.length(); i++)
		{
			if(Character.isLowerCase(frase.charAt(i)))
			minu++;
			else if(Character.isUpperCase(frase.charAt(i)))
			maiu++;
			else if(Character.isDigit(frase.charAt(i)))
			num++;
			if(Character.isLetter(frase.charAt(i)))
			{
				if(isVowel(frase.charAt(i)))
					vogal++;
				else
					consoante++;
			}
		}
		System.out.printf("Numero de caracteres minsculos -> %d", minu);
		System.out.println();
		System.out.printf("Numero de caracteres maiusculos -> %d", maiu);
		System.out.println();
		System.out.printf("Numero de caracteres numericos -> %d", num);
		System.out.println();
		System.out.printf("Numero de vogais -> %d", vogal);
		System.out.println();
		System.out.printf("Numero de consoantes -> %d", consoante);
		System.out.println();
	}
	public static boolean isVowel(char c)
	{
		if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
		return true;
		else
		return false;
	}
}







//verificar se uma string é composta por letras, espaços...(+ if, consoantes e vogais)
//ler uma class aluno(nome idade nota)
//função e returnar os dados da class aluno
//array de alunos, contar numero de alunos

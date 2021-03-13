import java.util.Scanner;

public class Ex2_2
{
	public static void main(String[] arg)
	{
		Scanner sc = new Scanner(System.in);
		double num1, num2;
		System.out.print("Primeiro nuemero");
		num1 = sc.nextDouble();
		System.out.print("Segundo numero");
		num2 = sc.nextDouble();
		{
		if(num1!=num2)
		{
			if(num1<num2)
			  System.out.printf("Maior numero %4.1f",num2);
			else
			  System.out.printf("Maior numero %4.1f",num1);
		}
		else
		  System.out.print("Numeros iguais");   
		}
	}
}
				

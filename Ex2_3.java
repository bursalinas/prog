import java.util.Scanner;
public class Ex2_3
{
	public static void main(String[] arg)
	{
		Scanner sc= new Scanner(System.in);
		int idade;
		System.out.print("Idade:");
		idade = sc.nextInt();
		{
			if(idade<=0)
			System.out.print("Idade inválida");
			else
			{
			if(idade<=65)
			  {
				  if(idade<6)
				  System.out.print("Isento de pagamento");
				  else
				  {
					  if(idade<=12)
					  System.out.print("Bilhete de criança");
					  else
					  System.out.print("Bilhete normal");
					}
				}	  
			else
			 System.out.print("Bilhete de terceira idade");
		 }
		}
	}
}

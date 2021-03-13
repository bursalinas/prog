import java.util.Scanner;
public class Ex4_4
{
	public static Scanner sc;
	public static void main(String[] arg)
	{
		sc = new Scanner(System.in);
		int secret = (int)(100.0*Math.random()) + 1; 
		int n;
		int counter = 0;
		
		while(true)
		{
		System.out.print("Introduza um numero:");
		n = sc.nextInt();
		if(n < 1 || n > 100)
		{
		System.out.print("numero invalido");
		continue;
	    }
	    counter++;
		if(n < secret)
		System.out.print("Demasiado baixo\n");
		else if(n > secret)
		System.out.print("Demasiado alta\n");
		else
		{
		System.out.print("Acertou!!!\n");
	    break;
	    }
	    }
	    System.out.println("Tentativas: " + counter);
    }
}

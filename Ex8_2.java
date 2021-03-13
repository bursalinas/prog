import java.util.Scanner;
public class Ex8_2
{
	public static Scanner sc;
	public static void main(String[] arg)
	{
		sc = new Scanner(System.in);
		int counter = 0;
		double soma = 0;
		Ponto2D origem = new Ponto2D(0,0);
		Ponto2D afastado = null;
		while(true)
		{
			Ponto2D p = lerponto();
			if(p.x == 0 &&  p.y == 0)break;
			counter++;
			double distancia = entrepontos(p, origem);
			soma += distancia;
			if(afastado == null)
			afastado = p;
			else if(distancia > entrepontos(afastado, origem)) 
			afastado = p;
		}
		System.out.printf("A soma das distancias dos %d pontos a origem e %3.1f.\n", counter, soma);
		System.out.printf("O ponto mais afastado da origem foi: %s", escreverponto(afastado));
	}
	public static Ponto2D lerponto()
	{
		Ponto2D ponto = new Ponto2D();
		System.out.println("Introduza um ponto: ");
		System.out.print("coordenada x: ");
		ponto.x = sc.nextDouble();
		System.out.print("coordenanda y: ");
		ponto.y = sc.nextDouble();
		return ponto;
	}
	public static String escreverponto(Ponto2D ponto)
	{
		return "(" + ponto.x + ", " + ponto.y + ")"; 
	}
	public static double entrepontos(Ponto2D p1, Ponto2D p2)
	{
		return Math.sqrt(Math.pow((p2.x - p1.x),2)+Math.pow((p2.y - p1.y),2));
	}
	
	static class Ponto2D
	{
		double x = 0; 
		double y = 0;
		public Ponto2D()
		{
		}
		public Ponto2D(double a, double b)
		{
			x = a;
			y = b;
		}
	}
}


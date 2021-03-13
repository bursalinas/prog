import java.util.Scanner;
public class Ex8_4
{	
	public static Scanner sc;
	public static void main (String[] args) 
	{
		sc = new Scanner(System.in); 
		char operador = '+';
		while(operador != '=')
		{
			Complexo c1 = lervalor();
			Complexo c2 = lervalor();
			System.out.print("Operacao: ");
			operador = sc.next().charAt(0);
			switch(operador)
			{
				case '+': somar(c1,c2); break;
				case '-': subtrair(c1,c2); break;
				case '*': multiplicar(c1,c2); break;
				case '/': dividir(c1,c2); break;
				case '=': break;
				default : System.out.println("Operador nao permitido.");
			}
		}
		System.out.print("O programa terminou.");
	}
	public static Complexo lervalor()
	{
		System.out.println("Introduz um numero complexo: ");
		System.out.print("Parte real: ");
		double a = sc.nextDouble();
		System.out.print("Parte imag: ");
		double b = sc.nextDouble();
		return new Complexo(a,b);
	}
	public static void somar(Complexo c1, Complexo c2)
	{
		Complexo c3 = new Complexo(c1.r+c2.r, c1.i+c2.i);
		System.out.printf("%s + %s = %s\n", c1.imprimir(), c2.imprimir(), c3.imprimir());
	}
	public static void subtrair(Complexo c1, Complexo c2)
	{
		Complexo c3 = new Complexo(c1.r-c2.r, c1.i-c2.i);
		System.out.printf("%s - %s = %s\n", c1.imprimir(), c2.imprimir(), c3.imprimir());
	}
	public static void multiplicar(Complexo c1, Complexo c2)
	{
		Complexo c3 = new Complexo(c1.r*c2.r, c1.i*c2.i);
		System.out.printf("%s * %s = %s\n", c1.imprimir(), c2.imprimir(), c3.imprimir());
	}
	public static void dividir (Complexo c1, Complexo c2)
	{
		Complexo c3 = new Complexo(c1.r/c2.r, c1.i/c2.i);
		System.out.printf("%s / %s = %s\n", c1.imprimir(), c2.imprimir(), c3.imprimir());
	}
	
	static class Complexo
	{
		double r = 0;
		double i = 0;
		public Complexo()
		{
		}
		public Complexo(double a, double b)
		{
			r = a;
			i = b;
		}
		public String imprimir()
		{
			return r + ((i>=0) ? " + ":"") + i + "i";
		}
	}
}


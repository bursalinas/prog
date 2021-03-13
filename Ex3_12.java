import java.util.Scanner;
public class Ex3_12
{
	public static Scanner sc;
	public static void main(String[] arg)
	{
		sc = new Scanner(System.in);
		exercicio3_12();
	}
	public static void exercicio3_12()
	{
		System.out.print("Introduza o ano: ");
		int ano = sc.nextInt();
		System.out.print("Introduza o numero do mes: ");
		int mes = sc.nextInt();
		System.out.print("Em que dia da semana comeca mes?:");
		int dia = sc.nextInt();
		
		if(ano <0 || (mes < 1 || mes >12) || (dia <1 || dia > 7))
		{
		  System.out.print("Burro");
		  return;	
		}
		int diasmes = 0;
		String nomemes = "";
		switch(mes)
		{
			case 1:
			   nomemes = "Janeiro";
			   diasmes = 31;
			   break;
			case 3:
			   nomemes = "Março";
			   diasmes = 31;
			   break;
			case 5:
			   nomemes = "Maio";
			   diasmes = 31;
			   break;
			case 7:
			   nomemes = "Julho";
			   diasmes = 31;
			   break;
			case 8:
			   nomemes = "Agosto";
			   diasmes = 31;
			   break;
			case 10:
			   nomemes = "Outubro";
			   diasmes = 31;
			   break;
			case 12:
			   nomemes = "Dezembro";
			   diasmes = 31;
			   break;
			case 4:
			   nomemes = "Abril";
			   diasmes = 30;
			   break;
			case 6:
			   nomemes = "Junho";
			   diasmes = 30;
			   break;
			case 9:
			   nomemes = "Setembro";
			   diasmes = 30;
			   break;
			case 11:
			   nomemes = "Novembro";
			   diasmes = 30;
			   break;
			case 2:
			   nomemes = "Fevereiro";
			   diasmes = (ano % 4 == 0)? 29 : 28;
			   break;
		}
		String fraseauxiliar = "|  " + nomemes + "    " + ano + "   |";
		int tam = fraseauxiliar.length();
		risca(tam);
		System.out.println(fraseauxiliar);
		risca(tam);
		System.out.println("|su mo tu we th fr sa |");
		risca(tam);
		for(int dias = 1, dds = 0; dias <= diasmes;)
		{
			if(dds == 0)
			{
			  System.out.print("|");
			  dds++;
		    }
		    if(dias == 1 && dds < dia)
		    {
			System.out.print("   ");
			dds++;
		    }
			else if(dds > 7)
		    {
			dds = 0;	
		    System.out.print("|\n");
		    }
		    else
		    {
		    System.out.printf("%2d ", dias);
		    dias++;
		    dds++;
		    }
		    if(dias > diasmes)
		    {
				for(;dds <= 7;dds++)
					System.out.print("   ");
				System.out.print("|\n");
			}
		}	
		risca(tam);
	}
	public static void risca(int a)
	{
		for(int i = 0;i < a;i++)
		System.out.print("-");
		
		System.out.println();
	}
}

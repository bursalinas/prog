import java.util.Scanner;
public class Ex6_3
{
	public static Scanner sc;
	public static void main(String[] args)
	{
		sc = new Scanner(System.in);
		int inputs[] = null;
		menuPrincipal();
		int x = sc.nextInt();
		while(true){
			if(x == 1){
				inputs = lerSequencia();
				menux();
			}else if(x == 2){
				escreverSequencia(inputs);
				menux();
			}else if(x == 3){
				max(inputs);
				menux();
			}else if(x == 4){
				min(inputs);
				menux();
			}else if(x == 5){
				int media = med(inputs);
				System.out.println("A media da lista e: " + media);
				menux();
			}else if(x == 6){
				boolean par = parOuNao(inputs);
				System.out.println("É par? " + par);
				menux();
			}else if(x == 10)
				break;
			else{
				System.out.println("Numero invalido.");
				menux();
			}
		}
	}
	public static void menuPrincipal(){
        System.out.println(" 1 - Ler uma sequência de números inteiros");
        System.out.println(" 2 - Escrever a sequência");
        System.out.println(" 3 - Calcular o máximo da sequência");
        System.out.println(" 4 - Calcular o mínimo da sequência");
        System.out.println(" 5 - Calcular a média da sequência");
        System.out.println(" 6 - Detetar se é uma sequência só constituída por números pares");
        System.out.println(" 10 - Terminar o programa");
        System.out.print("Opção -> ");
    }
    public static int[] lerSequencia(){
        System.out.println("Digite o tamanho da lista: ");
        int tamanho = sc.nextInt();
        int[] lista = new int[tamanho];
        for(int i = 0; i < lista.length; i++){
            lista[i] = sc.nextInt();
            if(lista [i] == 0)
                break;
        }
        return lista;
    }
    public static void escreverSequencia(int inputs[]){
        for(int i = 0; i < inputs.length; i++)
            System.out.print(inputs[i]+" ");
        System.out.print("\n\n");
    }
    public static void max (int inputs[]){
        int maximo = inputs[0];
        for(int i = 0; i < inputs.length; i++){
            if(inputs[i] > maximo)
                maximo = inputs[i];
        }
        System.out.println("O máximo da lista é: "+maximo);
    }
    public static void min (int inputs[]){
        int minimo = inputs[0];
        for(int i = 0; i < inputs.length; i++){
            if(inputs[i] < minimo)
                minimo = inputs[i];
        }
        System.out.println("O mínimo da lista é: "+minimo);
    }
    public static boolean parOuNao(int[] inputs){
        int contador = 0;
        for (int i = 0; i < inputs.length; i++){
            if(inputs [i]%2 == 0)
                contador++;
        }
        if(contador == inputs.length)
            return true;
        else
            return false;
    }
    public static int med(int[] inputs){
        int soma = 0;
        for(int i = 0; i < inputs.length; i++)
            soma += inputs[i];
        return soma/inputs.length;
    }
	public static void menux(){
		menuPrincipal();
		int x = sc.nextInt();
	}
}

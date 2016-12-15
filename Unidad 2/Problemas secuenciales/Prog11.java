//Un tren ha recorrido 480 km en 6 horas. ¿Cuánto tardará en recorrer 240 km?
import java.util.Scanner;
class Prog11
{
	public static void main(String[] arg)
	{
		int horas=6, recorrido=480;

		Scanner input = new Scanner(System.in);

    horas = (recorrido/2) * horas/recorrido;

		System.out.println("Las horas recorridas por 240km son "+horas);
	}
}

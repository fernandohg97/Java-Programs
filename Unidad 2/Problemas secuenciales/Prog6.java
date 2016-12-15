/*Construya un diagrama de flujo que calcule e imprima el número de segundos, minutos y horas que hay
en un determinado número de días. */
import java.util.Scanner;
class Prog6
{
	public static void main(String[] arg)
	{
		int num_seg, min, horas, dias;

		Scanner input = new Scanner(System.in);
		System.out.print("Ingresa el numero de dias: ");
		dias = input.nextInt();

    horas = dias * 24;
    min = dias*1440;
    num_seg = dias * 86400;

		System.out.println(dias+" dias tiene "+horas+" horas, "+min+" minutos y "+num_seg+" segundos.");
	}
}

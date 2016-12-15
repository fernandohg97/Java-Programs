/*Escriba un diagrama de flujo que convierta una medida dada en litros a sus equivalentes en
a) galones, b)decilitros, c)onzas, imprimir los resultados*/
import java.util.Scanner;
class Prog3
{
	public static void main(String[] arg)
	{
		double litro, onza, galon, decilitro;

		Scanner input = new Scanner(System.in);
		System.out.println("Ingresa el litro: ");
		litro = input.nextInt();

		onza = litro*33.81;
		galon = litro * 0.2641;
		decilitro = litro * 10;

		System.out.printf(litro+" litros equivale a %.2f",onza " onzas");
		System.out.printf(litro+" litros equivale a %.2f",galon " galones");
		System.out.println(litro+" litros equivale a "+decilitro+" decilitros");
	}
}

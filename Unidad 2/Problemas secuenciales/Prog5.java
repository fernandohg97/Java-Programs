/* Construya un diagrama de flujo que resuelva el problema que tienen en una gasolinera. Los surtidores de
la misma registran lo que surten en litros, pero el precio de la gasolina está fijado en galones.
El diagrama de flujo debe calcular e imprimir lo que hay que cobrarle al cliente. */
import java.util.Scanner;
class Prog5
{
	public static void main(String[] arg)
	{
		double litros, precio_gasolina, precio, galones;

		Scanner input = new Scanner(System.in);
		System.out.print("Ingresa el precio de la gasolina: ");
		precio_gasolina = input.nextDouble();
    System.out.print("Ingresa los litros: ");
    litros = input.nextDouble();
    System.out.print("Ingresa los galones: ");
    galones = input.nextDouble();

		precio = litros * precio_gasolina/galones;

		System.out.println("El precio total en litros son: "+precio);
	}
}

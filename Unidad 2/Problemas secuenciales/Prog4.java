/* Construya un diagrama de flujo tal que dado el monto de sueldo de un empleado calcule el
impuesto sobre la renta correspondiente, muestre los resultados si el ISR fuera de 10%, 15%, 20% y 30% */
import java.util.Scanner;
class Prog4
{
	public static void main(String[] arg)
	{
		double sueldo, impuesto1, impuesto2, impuesto3, impuesto4;

		Scanner input = new Scanner(System.in);
		System.out.println("Ingresa el sueldo: ");
		sueldo = input.nextDouble();

		impuesto1 = sueldo * 0.10;
    impuesto2 = sueldo * 0.15;
    impuesto3 = sueldo * 0.20;
    impuesto4 = sueldo * 0.30;

		System.out.println("El 10% de impuesto es: "+impuesto1);
		System.out.println("El 15% de impuesto es: "+impuesto2);
		System.out.println("El 20% de impuesto es: "+impuesto3);
    System.out.println("El 30% de impuesto es: "+impuesto4);
	}
}

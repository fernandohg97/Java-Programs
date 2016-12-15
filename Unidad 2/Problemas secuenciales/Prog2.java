//Construya un diagrama de flujo tal que calcule el volumen de un tinaco
import java.util.Scanner;
class Prog2
{
	public static void main(String[] arg)
	{
		double volumen, altura, base, area_base;
		double PI=3.1416;
		Scanner input = new Scanner(System.in);
		System.out.print("Ingresa la altura: ");
		altura = input.nextInt();
		System.out.print("Ingresa la base: ");
		base = input.nextInt();

		area_base = PI*Math.pow((base/2),2);
		volumen = area_base * altura;
		System.out.printf("EL volumen es: %.2f\n",volumen);
	}
}

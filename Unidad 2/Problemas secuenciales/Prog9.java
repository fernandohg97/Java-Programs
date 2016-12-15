//Calcular el área de un triángulo cuando no se conoce la altura y sólo se tiene la medida de los lados.
import java.util.Scanner;
class Prog9
{
	public static void main(String[] arg)
	{
		double area, a, b, c, s;

		Scanner input = new Scanner(System.in);
		System.out.print("Ingresa el valor del lado A: ");
		a = input.nextDouble();
    System.out.print("Ingresa el valor del lado B: ");
		b = input.nextDouble();
    System.out.print("Ingresa el valor del lado C: ");
		c = input.nextDouble();

    s = (a + b + c) /2;
    area = Math.sqrt(s*(s-a)*(s-b)*(s-c));

		System.out.println("El area del triangulo es "+area);
	}
}

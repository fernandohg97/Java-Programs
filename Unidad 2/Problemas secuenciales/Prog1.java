//Escribir un programa que solicite ingresar longitud y anchura de un terreno , hecho esto, visualice su superficie.
import java.util.Scanner;
class Prog1
{
	public static void main(String[] arg)
	{
		int largo, ancho, area;

		Scanner input = new Scanner(System.in);
		System.out.print("Ingresa la longitud del terreno: ");
		largo = input.nextInt();
    System.out.print("Ingresa la anchura del terreno: ");
    ancho = input.nextInt();

    area = largo * ancho;

		System.out.println("La superficie del terreno es de "+area+" metros cuadrados");
	}
}

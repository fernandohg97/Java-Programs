/* Un comerciante de madera compra doce árboles a $315 cada uno. Paga $184 por hacerlos talar en total.
El transportarlos hasta el almacén le cuesta $95 en total. ¿A qué precio le resulta cada árbol? */
import java.util.Scanner;
class Prog10
{
	public static void main(String[] arg)
	{
		double costo_arbol=315, tala=184, transporte=95, precio_total;

		Scanner input = new Scanner(System.in);

    tala = tala/12;
    transporte = transporte /12;
    precio_total = costo_arbol + tala + transporte;

		System.out.println("El precio total a pagar es de "+precio_total);
	}
}

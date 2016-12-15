/* Suponga que queremos instalar cierto software en una máquina dispensadora de café.
He aquí los detalles: todos los productos cuestan menos de 1 euro (100 centavos de euro) y una
moneda de 1 euro es la denominación más alta que podemos insertar. Dado el monto insertado y el costo del
producto, su programa debe regresar cambio utilizando el menor número de monedas. */
import java.util.Scanner;
class Prog7
{
	public static void main(String[] arg)
	{
		int monto, costo, m50, m20, m10, m5, m1, cambio;

		Scanner input = new Scanner(System.in);
		System.out.print("Ingresa el monto: ");
		monto = input.nextInt();
    System.out.print("Ingresa el costo del producto: ");
    costo = input.nextInt();

    cambio = monto-costo;
    m50 = cambio/50;
    cambio = cambio%50;
    m20 = cambio/20;
    cambio = cambio%20;
    m10 = cambio/10;
    cambio =cambio%10;
    m5 = cambio/5;
    cambio = cambio%5;
    m1 = cambio/1;
    cambio = cambio%1;

		System.out.println("La cantidad de monedas de 50 centavos es "+m50);
    System.out.println("La cantidad de monedas de 20 centavos es "+m20);
    System.out.println("La cantidad de monedas de 10 centavos es "+m10);
    System.out.println("La cantidad de monedas de 5 centavos es "+m5);
    System.out.println("La cantidad de monedas de 1 centavo es "+m1);

	}
}

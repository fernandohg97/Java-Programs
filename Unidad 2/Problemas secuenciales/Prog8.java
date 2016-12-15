/* Un vendedor recibe un sueldo base más un 10% extra por comisión de sus ventas. El
vendedor desea saber cuánto dinero obtendrá por concepto de comisiones por las tres
ventas que realizó en el mes y el total que recibirá en el mes tomando en cuenta su sueldo base y comisiones. */
import java.util.Scanner;
class Prog8
{
	public static void main(String[] arg)
	{
		double sueldo, comision, ventas, sueldo_total;

		Scanner input = new Scanner(System.in);
		System.out.print("Ingresa el numero de ventas: ");
		ventas = input.nextDouble();
    System.out.print("Ingresa el sueldo: ");
    sueldo = input.nextDouble();

    comision = sueldo * 0.10;
    comision = comision * ventas;
    sueldo_total = sueldo + comision;

		System.out.println("La comision del sueldo es de "+comision+" pesos");
    System.out.println("El sueldo total es de "+sueldo_total+" pesos");
	}
}

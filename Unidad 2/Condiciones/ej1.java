/* Construya un diagrama de flujo tal que dado como dato el sueldo de un trabajador, le aplique un aumento del 15% si su
sueldo es inferior a $1000 y 12% en caso contrario. Imprima el sueldo anterior, el porcentaje de aumento y el nuevo sueldo
del trabajador. */
import java.util.Scanner;
class ej1
{
  public static void main(String[]args)
  {
    double compra, descuento=0, pagoTotal;
    Scanner input = new Scanner(System.in);
    System.out.print("Ingresa el costo de la compra: ");
    compra = input.nextDouble();

    if (compra>1000)
    {
      descuento = compra*0.15;
      pagoTotal = compra - descuento;
    }
    else
    {
      if (compra>500)
      {
        descuento = compra*0.10;
        pagoTotal = compra - descuento;
      }
      else
      {
        pagoTotal = compra;
      }
    }
    System.out.printf("El pago total es de $%.1f y se le aplico un descuento de %.0f pesos\n",pagoTotal,descuento);
  }
}

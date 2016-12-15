/* En una tienda efectúan un descuento a los clientes dependiendo del monto de la compra. El descuento se efectúa con base
en el siguiente criterio:
1. Si el monto es menor que $300 no hay descuento
2. Si el monto está comprendido entre $300 y $1000 inclusive es 5% de descuento
3. Si el monto está comprendido entren$1000 y $7000 inclusive es 11% de descuento
4. Si el monto está comprendido entre $7000 y $15000 inlcusive es 18% de descuento
5. Si el monto es mayor a $15000 es el 25% de descuento
Construya un diagrama de flujo tal que dado el monto de la compra de un cliente , determine lo que el mismo debe pagar,
     asi como el porcentaje de descuento aplicado, también indique cual es el monto de ahorro en la transacción. */
import java.util.Scanner;
class ej7
{
  public static void main(String[]args)
  {
    double descuento,monto,pagoTotal;
    Scanner input = new Scanner(System.in);
    System.out.print("Ingresa el monto de la compra: ");
    monto = input.nextDouble();

    if (monto<300)
    {
     System.out.println("NO hay descuento");
     System.out.println("La cantidad a pagar es $"+monto);
    }
    else if (monto>=300 && monto<=1000)
    {
      descuento = monto*0.05;
      pagoTotal = monto - descuento;
      System.out.println("Se aplico un descuento del 5%");
      System.out.printf("Te ahorraste $%.2f pesos\n",descuento);
      System.out.println("La cantidad a pagar es de $"+pagoTotal);
    }
    else if (monto>1000 && monto<=7000)
    {
      descuento = monto*0.11;
      pagoTotal = monto - descuento;
      System.out.println("Se aplico un descuento del 11%");
      System.out.printf("Te ahorraste $%.2f pesos\n",descuento);
      System.out.println("La cantidad a pagar es de $"+pagoTotal);
    }
    else if (monto>7000 && monto<=15000)
    {
      descuento = monto*0.18;
      pagoTotal = monto - descuento;
      System.out.println("Se aplico un descuento del 18%");
      System.out.printf("Te ahorraste $%.2f pesos\n",descuento);
      System.out.println("La cantidad a pagar es de $"+pagoTotal);
    }
    else if (monto>15000)
    {
      descuento = monto*0.25;
      pagoTotal = monto - descuento;
      System.out.println("Se aplico un descuento del 25%");
      System.out.printf("Te ahorraste $%.2f pesos\n",descuento);
      System.out.println("La cantidad a pagar es de $"+pagoTotal);
    }
  }
}

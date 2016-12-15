/* En la farmacia El Refugio, si el monto de compra de medicinas es mayor a $1000 pesos, se debe ejercer un descuento del 3% al pago total. Además, este total puede tener un descuento adicional del 5% si la persona tiene credencial de la tercera edad. Diseñe el
algoritmo correspondiente. */
import java.util.Scanner;
class ej9
{
  public static void main(String[]args)
  {
    double monto,pagoTotal,descuento;
    String credencial="";
    Scanner input = new Scanner(System.in);
    System.out.print("Ingresa el monto a pagar: ");
    monto = input.nextDouble();
    System.out.print("Indica si tienes credencial de tercera edad (Escribe 'si' si tienes credencial y 'no' si no tienes): ");
    credencial = input.next();

    if (monto>1000 && credencial.equals("si"))
    {
      descuento = monto*0.08;
      pagoTotal = monto - descuento;
    }
    else if (monto>1000)
    {
     descuento = monto*0.03;
     pagoTotal = monto - descuento;
    }
    else
    {
      pagoTotal = monto;
    }
    System.out.printf("El pago total es de $%.1f\n",pagoTotal);
  }
}

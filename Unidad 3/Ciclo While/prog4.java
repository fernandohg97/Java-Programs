/* Haga un diagrama de flujo para calcular lo que hay que pagar por un conjunto de llamadas telefónicas. por cada
llamada se ingresa el tipo (internacional, nacional y local) y la duración en minutos. el criterio que se sigue para
calcular el costo de cada llamada es el siguiente:
Internacional: 3 primero minutos $7.59   y cada minuto adicional $3.03 Nacional: 3 primero minutos $1.20 y
cada minuto adicional $0.48 Local: las primeras 10 llamadas no se cobran. luego cada llamada cuesta $0.60 */
import java.util.Scanner;
class prog4
{
  public static void main(String[] args)
    {
      int llamada, d, n1=0,n2=0,n3=0;
      double monto1 = 7.59, monto2 = 1.20, monto3 = 0.60, costo1=0,costo2=0,costo3=0,costoTotal=0;
      Scanner input = new Scanner(System.in);
      System.out.print("Ingresa el tipo de llamada que vas a realizar: (Escribe 1-Internacionalizacon, 2-Nacional, 3-Local)");
      llamada = input.nextInt();
      System.out.print("Ingresa la duracion de la llamada: ");
      d = input.nextInt();

      while (llamada>=1 && llamada<=3)
      {

        switch (llamada)
        {
          case 1:
          n1++;
          if (d<=3)
          {
            costo1 = monto1*n1;
          }
          else
          {
            d = d - 3;
            costo1 = (monto1 + (d*3.03))*n1;
          }
          break;
          case 2:
          n2++;
          if (d<=3)
          {
            costo2 = monto2*n2;
          }
          else
          {
            d = d - 3;
            costo2 = (monto2 + (d*0.48))*n2;
          }
          break;
          case 3:
          n3++;
          if (n3<=10)
          {
            costo3 = 0;
          }
          else
          {
            n3=1;
            costo3 = monto3*n3;
            n3++;
          }
          break;
        }
        costoTotal = costo1 + costo2 +costo3;
        System.out.print("Ingresa el tipo de llamada que vas a realizar: (Escribe 1-Internacionalizacon, 2-Nacional, 3-Local, 0-No llamada)");
        llamada = input.nextInt();
        if (llamada!=0)
        {
          System.out.print("Ingresa la duracion de la llamada: ");
          d = input.nextInt();
        }
        else
        {
          System.out.println("El costo total de las llamadas es de $"+costoTotal);
        }
      }


    }
}

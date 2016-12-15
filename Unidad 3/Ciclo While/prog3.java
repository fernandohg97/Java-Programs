/* En un teatro se tienen 4 tipos diferentes de localidades, las cuales se identifican por una clave
numérica que es un valor comprendido entre 1 y 4. los precios de cada localidad y los datos referentes a las ventas de boletos para la próxima obra se proporcionan como sigue:
p1, p2, p3,  y p4: representan los precios de las localidades 1, 2, 3,  y 4 respectivamente clave : representa el tipo de
localidad de la venta cant: indica la cantidad la cantidad de boletos vendidos

Construya un diagrama de flujo que:
A. Lea los precios
B. Lea los datos de las ventas de boletos
C. Imprima para cada venta , la clave la cantidad y el importe total de los boletos vendidos en esta venta
D. Calcule e imprima la cantidad de boletos vendidos de cada tipo
E. Calcule e imprima la recaudación total del teatro
*/
import java.util.Scanner;
class prog3
{
    public static void main(String[] args)
    {
      double p1, p2, p3, p4,costo1,costo2,costo3,costo4,boletos, costoBoletos,nuevoCosto=0,nuevoCosto2=0,nuevoCosto3=0,nuevoCosto4=0;
      int  clave, cant,c1=0,c2=0,c3=0,c4=0;
      Scanner input = new Scanner(System.in);

      System.out.print("Ingresa el precio de la localidad 1: ");
      p1 = input.nextDouble();
      System.out.print("Ingresa el precio de la localidad 2: ");
      p2 = input.nextDouble();
      System.out.print("Ingresa el precio de la localidad 3: ");
      p3 = input.nextDouble();
      System.out.print("Ingresa el precio de la localidad 4: ");
      p4 = input.nextDouble();
      System.out.print("Ingresa el tipo de localidad (Puede ser 1,2,3 o 4. Escribe 0 para terminar): ");
      clave = input.nextInt();
      System.out.print("Ingresa la cantidad de boletos que quieres: ");
      cant = input.nextInt();


      do
      {
        switch (clave)
        {
          case 1:
          c1 = c1 + cant;
          costo1 = p1 * cant;
          nuevoCosto = nuevoCosto + costo1;
          System.out.println("La clave es "+clave+", son "+c1+" boletos y el costo es de $"+nuevoCosto);
          break;
          case 2:
          c2 = c2 + cant;
          costo2 = p2 * cant;
          nuevoCosto2 = nuevoCosto2 + costo2;
          System.out.println("La clave es "+clave+", son "+c2+" boletos y el costo es de $"+nuevoCosto2);
          break;
          case 3:
          c3 = c3 + cant;
          costo3 = p3 * cant;
          nuevoCosto3 = nuevoCosto3 + costo3;
          System.out.println("La clave es "+clave+", son "+c3+" boletos y el costo es de $"+nuevoCosto3);
          break;
          case 4:
          c4 = c4 + cant;
          costo4 = p4 * cant;
          nuevoCosto4 = nuevoCosto4 + costo4;
          System.out.println("La clave es "+clave+", son "+c4+" boletos y el costo es de $"+nuevoCosto4);
          break;
          default:
          System.out.println("No existe esta localidad");
        }
        System.out.print("Ingresa el tipo de localidad (Puede ser 1,2,3 o 4. Escribe 0 para terminar): ");
        clave = input.nextInt();
        System.out.print("Ingresa la cantidad de boletos que quieres: ");
        cant = input.nextInt();
      }
      while (clave!=0);
      boletos = c1+c2+c3+c4;
      costoBoletos = nuevoCosto + nuevoCosto2 + nuevoCosto3 + nuevoCosto4;
      System.out.println("El numero total de boletos son "+boletos);
      System.out.println("El costo total de todos los boletos es de $"+costoBoletos);


    }
}

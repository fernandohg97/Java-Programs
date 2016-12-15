/* En un centro de copiado, la copia por hoja tiene un costo de $1.1 pesos, pero si se solicitan más de 100 copias, el costo se reduce a $0.8 pesos. Entonces, dependiendo de la cantidad de copias que se desee, es el costo del servicio. Como daría solución a este
problema? */
import java.util.Scanner;
class ej8
{
  public static void main(String[]args)
  {
    double copia=1.1,costo;
    int cant;
    Scanner input = new Scanner(System.in);
    System.out.print("Ingresa la cantidad de copias: ");
    cant = input.nextInt();

    if (cant>100)
    {
      costo = cant*0.8;
    }
    else
    {
      costo = cant*1.1;
    }
    System.out.printf("El costo de las copias es de $%.2f\n",costo);
  }
}

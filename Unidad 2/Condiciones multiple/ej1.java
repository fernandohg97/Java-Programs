/* Construya un algoritmo tal que dado como datos la categoría y el sueldo de un trabajador, calcule el aumento
 correspondiente teniendo en cuenta la siguiente tabla, además, si el empleado tiene más de 10 años de antigüedad,
 se debe promover a la siguiente categoría, antes de calcular el aumento. Imprima la categoría del trabajador y su
 nuevo sueldo  */
import java.util.Scanner;

class ej1
{
 public static void main (String[] arg)
 {
  int cat,periodo;
  double sueldo, aumento, nuevoSueldo;
  Scanner input = new Scanner(System.in);
  System.out.print("Ingresa el sueldo: ");
  sueldo = input.nextInt();
  System.out.print("Dame la categoria: ");
  cat = input.nextInt();
  System.out.print("Cuantos años tienes trabajando: ");
  periodo = input.nextInt();

  switch(cat)
  {
    case 1:
      aumento = sueldo * 0.18;
      nuevoSueldo = sueldo + aumento;
      System.out.printf("Tu categoria es "+cat+" y tu nuevo sueldo es de $%.2f\n",nuevoSueldo);
    break;

    case 2:
    if (periodo > 10)
    {
      cat = 1;
      aumento = sueldo * 0.18;
      nuevoSueldo = sueldo + aumento;
      System.out.printf("Tu categoria ascendió a "+cat+" y tu nuevo sueldo es de $%.2f\n",nuevoSueldo);
    }
    else
    {
      aumento = sueldo * 0.12;
      nuevoSueldo = sueldo + aumento;
      System.out.printf("Tu categoria es "+cat+" y tu nuevo sueldo es de $%.2f\n",nuevoSueldo);
    }
    break;

    case 3:
    if (periodo > 10)
    {
      cat = 2;
      aumento = sueldo * 0.12;
      nuevoSueldo = sueldo + aumento;
      System.out.printf("Tu categoria ascendió a "+cat+" y tu nuevo sueldo es de $%.2f\n",nuevoSueldo);
    }
    else
    {
      aumento = sueldo * 0.09;
      nuevoSueldo = sueldo + aumento;
      System.out.printf("Tu categoria es "+cat+" y tu nuevo sueldo es de $%.2f\n",nuevoSueldo);
    }
    break;

    case 4:
      if (periodo > 10)
      {
        cat = 3;
        aumento = sueldo * 0.09;
        nuevoSueldo = sueldo + aumento;
        System.out.printf("Tu categoria ascendió a "+cat+" y tu nuevo sueldo es de $%.2f\n",nuevoSueldo);
      }
      else
      {
        aumento = sueldo * 0.05;
        nuevoSueldo = sueldo + aumento;
        System.out.printf("Tu categoria es "+cat+" y tu nuevo sueldo es de $%.2f\n",nuevoSueldo);
      }
    break;

    default:
      System.out.println("No existe esta categoria");

  }
 }
}

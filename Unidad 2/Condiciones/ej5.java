/* Dado un número entero A, haga un diagrama de flujo para determinar si el mismo es par, impar o nulo */
import java.util.Scanner;
class ej5
{
  public static void main(String[]args)
  {
    int A;
    Scanner input = new Scanner(System.in);
    System.out.print("Ingresa un numero entero: ");
    A = input.nextInt();

    if (A==0)
    {
      System.out.println("El numero es nulo");
    }
    else if (A%2 != 0)
    {
      System.out.println("El numero es impar");
    }
    else
    {
      System.out.println("El numero es par");
    }
  }
}

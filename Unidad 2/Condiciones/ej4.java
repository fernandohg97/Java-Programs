/* Construya un diagrama de flujo tal que dado como dato un número entero determine e imprima si el mismo es positivo,
negativo o nulo */
import java.util.Scanner;
class ej4
{
  public static void main(String[]args)
  {
    int num1;
    Scanner input = new Scanner(System.in);
    System.out.print("Ingresa un numero entero: ");
    num1 = input.nextInt();

    if (num1==0)
    {
      System.out.println("El numero es nulo");
    }
    else if (num1>0)
    {
      System.out.println("El numero es positivo");
    }
    else
    {
      System.out.println("El numero es negativo");
    }
  }
}

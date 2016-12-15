/* Se dice que un entero positivo N es un número primo si los únicos enteros positivos que lo
dividen son exactamente 1 y N. diseñe un diagrama de flujo que lea un número M, y obtenga y cuente
los números primos menores a M.
*/
import java.util.Scanner;
class prog5
{
  public static void main(String[] args)
  {
      double m, n=2;
      int c=0;
      Scanner input = new Scanner(System.in);
      System.out.print("Ingresa un numero positivo: ");
      m = input.nextDouble();
      while (m>1)
      {
        if (m%n == 0)
        {
         if (m == n)
         {
           System.out.println(m);
           c++;
         }
         else
         {
         }
         m=m-1;
         n=2;
        }
        else
        {
          n++;
        }
      }
      System.out.println("Se encontraron "+c+" numeros primos");
  }
}

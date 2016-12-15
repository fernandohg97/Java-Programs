/* /*La siguiente se llama la conjetura de ULAM en honor del matemático S.ULMAN.
Comience con cualquier entero positivo
Si es par, divídalo entre 2 ; si es impar, multiplíquelo por 3 y agreguele 1
Obtenga enteros sucesivamente repitiendo el proceso
Al final, obtendrá el número 1, independientemente del entero inicial. por ejemplo, cuando el entero inicial es 26,
 la secuencia será: 26,13,40,20,10,5,16,8,4,2,1
Construya un diagrama de flujo que lea un entero positivo y obtenga e imprima la sucesión de ulam
*/
import java.util.Scanner;
class prog1
{
    public static void main(String[] args)
    {
      double n;
      Scanner input = new Scanner(System.in);
      System.out.print("Ingresa un numero positivo: ");
      n = input.nextDouble();
      while (n>1)
      {
        if (n%2 == 0)
        {
           n = n/2;
        }
        else
        {
          n = n * 3 + 1;
        }
      System.out.println(n);
      }
    }
}

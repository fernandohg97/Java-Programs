/*Implementar el algoritmo de Euclides que encuentre el máximo común divisor de dos números enteros positivos.
Algoritmo de Euclides de m y n: Este transforma un par de enteros positivos (m,n) en un par (d,o), dividiendo
repetidamente el entero mayor entre el menor y remplazando con el resto´, cuando el resto es 0, el otro entero
de la pareja será el máximo común divisor de la pareja original.
*/
import java.util.Scanner;
class prog6
{
    public static void main(String[] args)
    {
      double resto=1, dividendo, divisor, mcd, m,n;
      Scanner input = new Scanner(System.in);
      System.out.print("Ingresa un numero positivo: ");
      m = input.nextDouble();
      System.out.print("Ingresa otro numero positivo: ");
      n = input.nextDouble();
      if(m>n)
      {
        dividendo = m;
        divisor = n;
      }
      else
      {
        dividendo = n;
        divisor = m;
      }
      while (resto!=0)
      {
        resto = dividendo%divisor;
        dividendo = divisor;
        divisor = resto;
      }
      mcd = dividendo;
      System.out.println(mcd);
    }
}

/* Dados los datos A, B y C que representan número enteros diferentes, construya un diagrama de flujo para escribir estos
números en forma descendente */
import java.util.Scanner;
class ej2
{
  public static void main(String[]args)
  {
    int A,B,C;
    Scanner input = new Scanner(System.in);
    System.out.print("Ingresa el primer numero: ");
    A = input.nextInt();
    System.out.print("Ingresa el segundo numero: ");
    B = input.nextInt();
    System.out.print("Ingresa el tercer numero: ");
    C = input.nextInt();

    if (A>B && B>C)
    {
      System.out.println("Los numeros de forma descendente es "+A+B+C);
    }
    else if (A>C && C>B)
    {
      System.out.println("Los numeros de forma descendente es "+A+C+B);
    }
    else if (B>A && A>C)
    {
      System.out.println("Los numeros de forma descendente es "+B+A+C);
    }
    else if (B>C && C>A)
    {
      System.out.println("Los numeros de forma descendente es "+B+C+A);
    }
    else if (C>A && A>B)
    {
      System.out.println("Los numeros de forma descendente es "+C+A+B);
    }
    else
    {
      System.out.println("Los numeros de forma descendente es "+C+B+A);
    }

  }
}

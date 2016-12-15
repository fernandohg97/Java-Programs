/* Construya un diagrama de flujo tal que dado como datos de entrada tres números enteros, determine si los
mismos están en orden creciente */
import java.util.Scanner;
class ej6
{
  public static void main(String[]args)
  {
    int num1,num2,num3;
    Scanner input = new Scanner(System.in);
    System.out.print("Ingresa un numero entero: ");
    num1 = input.nextInt();
    System.out.print("Ingresa un numero entero: ");
    num2 = input.nextInt();
    System.out.print("Ingresa un numero entero: ");
    num3 = input.nextInt();

    if (num1<num2 && num1<num3)
    {
      System.out.println("Los numeros ingresados estan en forma creciente");
    }
    else
    {
      System.out.println("Los numeros no estan en forma creciente");
    }
  }
}

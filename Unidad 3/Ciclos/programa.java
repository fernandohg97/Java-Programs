import java.util.Scanner;

class programa
{
  public static void main(String[] args)
  {
    int n,c = 0,num=0,suma=0, res=0;
    double prom=0;
    Scanner input = new Scanner(System.in);

    while (c<5)
    {
      c++;
      System.out.print("Ingresa un numero entero: ");
      n = input.nextInt();
      num++;
      if (n%2 != 0)
      {
        suma = suma + n;
      }
      else
      {
        res++;
        prom = (prom + n)/res;
      }
    }
    System.out.println("La suma de los numeros impares es "+suma);
    System.out.println("El promedio de los numeros pares "+prom);
  }
}

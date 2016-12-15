import java.util.Scanner;

class for2
{
  public static void main(String[] args)
  {
    int c=0,x;
    double n, suma=0,prom=0,y=0;
    Scanner input = new Scanner (System.in);

    for (x=1;x<=13;x++)
    {
      System.out.println("Ingresa un numero: ");
      n = input.nextInt();
      if (n%2==0)
      {
          c++;
          y=y+n;
      }
      else
      {
        suma=suma+n;
      }
    }
    prom=y/c;
    System.out.println("La suma de los numeros impares es "+suma);
    System.out.printf("El promedio de los numeros pares es %.2f\n",prom);
  }
}

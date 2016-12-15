import java.util.Scanner;

class for3
{
  public static void main(String[] args)
  {
    int x,n,cant;
    long mayor=0,menor=9999999999L;
    Scanner input = new Scanner (System.in);
    System.out.println("Cuantos numeros vas a ingresar: ");
    cant = input.nextInt();

    for (x=1;x<=cant;x++ )
    {
      System.out.println("Ingresa un numero");
      n = input.nextInt();
      if (n>mayor)
      {
          mayor = n;
      }
      else if (n<menor)
      {
        menor = n;
      }
    }
    System.out.println("El numero mayor es "+mayor);
    System.out.println("El numero menor es "+menor);

  }
}

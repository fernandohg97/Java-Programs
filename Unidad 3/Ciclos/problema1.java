import java.util.Scanner;
class problema1
{
  public static void main(String[] args)
  {
    int cant;
    int arreglo[];
    Scanner input = new Scanner(System.in);
    System.out.print("Ingresa la cantidad de numeros: ");
    cant = input.nextInt();
    arreglo = new int[cant];
    lista(arreglo);
  }

  public static void lista(int numeros[])
  {
    int mayor=0,menor=999999;
    Scanner input = new Scanner(System.in);
    for (int i=0;i<=numeros.length - 1;i++)
    {
      System.out.print("Escribe un numero: ");
      numeros[i] = input.nextInt();
    }
    //Muestra del arreglo
    for (int j=0;j<=numeros.length - 1;j++)
    {
      System.out.print(numeros[j]);
    }
    System.out.println();
    //Mayor
    for (int m=0;m<=numeros.length - 1;m++)
    {
      if (numeros[m] > mayor)
      {
        mayor = numeros[m];
      }
    }
    System.out.println("El numero mayor es "+mayor);
    for (int n=0;n<=numeros.length - 1;n++)
    {
      if (numeros[n] < menor)
      {
        menor = numeros[n];
      }
    }
    System.out.println("El numero menor es "+menor);
}
}

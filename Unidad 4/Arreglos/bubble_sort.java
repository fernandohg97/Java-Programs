import java.util.Scanner;
class bubble_sort
{
  public static void main (String[]arg)
  {
    Scanner input=new Scanner(System.in);
    int j,n,temporal;
    System.out.println("\tAlgoritmo de la Burbuja\n\n");
    System.out.print("Escribe la cantidad de numeros del arreglo: ");
    n=input.nextInt();
    int lista[ ]=new int[n];

  for(int i=0;i<lista.length;i++)
  {
    System.out.println("Ingresa el numero "+(i+1)+": ");
    lista[i]=input.nextInt();
  }
  System.out.println("-------Lista ordenada-------");
  System.out.print("\n");
  for (j=0;j<=lista.length - 1;j++)
  {
    for (int x=0;x<lista.length - 1;x++)
    {
      if (lista[x] > lista[x+1])
      {
        temporal = lista[x];
        lista[x] = lista[x+1];
        lista[x+1] = temporal;
      }
    }
  }
  for (int e=0;e<=lista.length-1;e++)
  {
    System.out.print(lista[e]);
  }
  System.out.println();
  }
}

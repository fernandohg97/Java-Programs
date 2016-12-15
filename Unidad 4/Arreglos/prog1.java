import java.util.Scanner;
import java.util.Arrays;
class prog1
{
  public static void main (String[]arg)
  {
    int j=0,n=0,i=0,m=0,temporal;
    int cant;

    Scanner input = new Scanner(System.in);

    System.out.print("Ingresa la cantidad de numeros: ");
    cant = input.nextInt();
    int array[] = new int[cant];
    int newArray[] = new int[cant];

    for (i=0;i<=array.length - 1;i++)
    {
      System.out.print("Ingresa un numero: ");
      array[i] = input.nextInt();
    }

    for (j=0;j<=array.length - 1;j++)
    {
      for (int x=0;x<array.length - 1;x++)
      {
        if (array[x] > array[x+1])
        {
          temporal = array[x];
          array[x] = array[x+1];
          array[x+1] = temporal;
        }
      }
    }



    while (n<array.length - 1)
    {
      if (array[n]==array[n+1])
      {
        array[n+1]=0;
        newArray[m] = array[n];
        m++;
      }
      else
      {
        newArray[m] = array[n];
        m++;
      }
      n++;
    }
      for (int z=0;z<=newArray.length - 1;z++)
      {
        if (newArray[z]!=0)
        {
        System.out.println(newArray[z]);
        }
      }
    // for (a=0;a<=newArray.length - 1;a++)
    // {
    //   System.out.println(newArray[a]);
    // }
  }
}

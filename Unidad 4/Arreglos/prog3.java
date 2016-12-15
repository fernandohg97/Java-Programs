import java.util.Scanner;
class prog3
{
  public static void main (String[]arg)
  {
    int i=0,num=2,cant=1,primo,n=2;
    int lista[] = new int[30];

    while (cant<=30)
    {
      if (num%n==0)
      {
        if (num==n)
        {
            lista[i] = num;
            i++;
            cant++;
            num++;
            n=2;
        }
        else
        {
          num++;
        }
      }
      else
      {
        n++;
      }
    }

      for (int x=0;x<=lista.length - 1;x++)
      {
        System.out.println(lista[x]);
      }

  }
}

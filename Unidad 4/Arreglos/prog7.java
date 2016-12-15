import java.util.Scanner;
class prog7
{
  public static void main (String[]arg)
  {
    String a="",b="",d="";
    String sur[] = {"Argentina","Bolivia","Brasil","Chile","Colombia","Ecuador","Guyana","Paraguay","Peru","Surinam","Uruguay","Venezuela"};
    String centro[] = {"Belice","Costa Rica","Colombia","El Salvador","Guatemala","Honduras","Mexico","Nicaragua","Panama"};
    String norte[] = {"Canada","Estados Unidos","Mexico"};
    String america[]=new String[24];
/*
1. Recorrer los arreglos
2. Comparar el primer elemento con todos los elementos del segundo y tercer arreglo
3. Compa
*/
// a = "a";
// b = "b";
// d = "d";
// System.out.println(b.compareTo(a)); = 1

for (int x=0;x<=sur.length - 1;x++)
{
  System.out.println(sur[x].compareTo(sur[x]));
  for (int y=0;y<=centro.length - 1;y++)
  {
    for (int a=0;a<=america.length - 1;a++)
    {
      if (sur[x].compareTo(sur[y])<0)
      {
        america[a] = sur[x];
      }
    }
    else
    {
      for (int a=0;a<=america.length - 1;a++)
      {
        america[a] = centro[y];
      }
    }
  }
  for (int z=0;z<=norte.length - 1;z++)
  {
    System.out.println(norte[z].charAt(0));
  }
}




  }
}

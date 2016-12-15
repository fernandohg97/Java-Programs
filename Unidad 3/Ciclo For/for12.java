import java.util.Scanner;

class for12
{
  public static void main(String[] args)
  {
    String p="",palabra1="",palabra2="";
    int i,x;
    Scanner input = new Scanner (System.in);
    System.out.println("Ingresa una palabra: ");
    p = input.next();

    for (x=0;x<=p.length() - 1;x++)
    {
      if (p.charAt(x)==' ')
      {
        x++;
        palabra1 = palabra1 + p.charAt(x);
      }
    }

    for (i=p.length() - 1;i>=0;i--)
    {
        if (p.charAt(i)==' ')
        {
          i--;
          palabra2 = palabra2 + p.charAt(i);
        }
    }
    if (palabra1.equals(palabra2))
    {
      System.out.println("Es palindromo");
    }
    else
    {
      System.out.println("No es palindromo");
    }
  }
}

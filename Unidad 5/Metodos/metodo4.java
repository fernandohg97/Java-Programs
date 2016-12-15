import java.util.Scanner;
class metodo4
{
  public static void main(String[] args)
  {
    String p="";
    Scanner input = new Scanner (System.in);
    System.out.println("Ingresa una palabra: ");
    p = input.next();
    palindromo(p);
  }
  public static void palindromo(String palabra1)
  {
    String palabra2="";
    int i;
    for (i=palabra1.length() - 1;i>=0;i--)
    {
          if (palabra1.charAt(i)!=' ')
          {
            palabra2 = palabra2 + palabra1.charAt(i);
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

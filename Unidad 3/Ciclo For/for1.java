import java.util.Scanner;

class for1
{
  public static void main(String[] args)
  {
    int n;
    double r=0,suma=0,resta=0,x;
    Scanner input = new Scanner(System.in);
    System.out.print("Ingresa un numero: ");
    n = input.nextInt();

    for (x=1;x<=n;x++)
    {
      if (x%2==0)
      {
          r=r-1/x;
      }
      else
      {
        r=r+1/x;
      }

    }
    System.out.printf("%.2f\n",r);
  }
}

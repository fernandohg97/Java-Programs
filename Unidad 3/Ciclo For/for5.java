import java.util.Scanner;

class for5
{
  public static void main(String[] args)
  {
    double r=0,n,x,i,suma=0;
    Scanner input = new Scanner(System.in);
    System.out.println("Ingresa un numero: ");
    n = input.nextDouble();

    for (x=1;x<=n;x++)
    {
      r=r+Math.pow(x,x);
      System.out.println(x+" ^ "+x+" = "+Math.pow(x,x));
    }
    System.out.println("La suma es de %.1f",r);

  }
}

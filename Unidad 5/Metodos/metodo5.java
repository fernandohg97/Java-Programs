import java.util.Scanner;
class metodo5
{
  public static void main(String[] args)
  {
    double num1,num2;
    Scanner input = new Scanner(System.in);
    System.out.print("Ingresa x: ");
    num1 = input.nextDouble();
    System.out.print("Ingresa n: ");
    num2 = input.nextDouble();
    System.out.println(operacion(num1,num2));
  }
  public static double operacion(double x,double n)
  {
    double res;
    if (x>=0)
    {
      res = x+(Math.pow(x,n))/n-((Math.pow(x,n+2))/n+2);
    }
    else
    {
      res = ((Math.pow(x,n+1))/n+1) - (Math.pow(x,n-1)/n-1);
    }
    return res;
  }
}

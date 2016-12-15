import java.util.Scanner;

class for4
{
  public static void main(String[] args)
  {
    int n,x,venta,c1=0,c2=0,c3=0;
    Scanner input = new Scanner (System.in);
    System.out.println("Ingresa el numero de ventas: ");
    n = input.nextInt();

    for (x=1;x<=n;x++)
    {
      System.out.println("Ingresa el precio de la venta: ");
      venta = input.nextInt();
      if (venta<=200)
      {
        c1++;
      }
      else if (venta>200 && venta<400)
      {
        c2++;
      }
      else
      {
        c3++;
      }
    }
    System.out.println(c1+" ventas fueron de $200 o menos");
    System.out.println(c2+" ventas fueron mayores a $200 y menores a $400");
    System.out.println(c3+" ventas fueron mayores a $400");
  }
}

import java.util.Scanner;

class for7
{
  public static void main(String[] args)
  {
    int n,x,em=0;
    double mayor=0,suma=0,sueldo,prom;
    Scanner input = new Scanner (System.in);
    System.out.println("Ingresa el numero de empleados: ");
    n = input.nextInt();

    for (x=1;x<=n;x++)
    {
      System.out.println("Ingresa el sueldo del empleado "+x+": ");
      sueldo = input.nextDouble();

      suma = suma + sueldo;
      if (sueldo>mayor)
      {
          mayor=sueldo;
          em=x;
      }
    }
    prom=suma/n;
    System.out.println("El empleado "+em+" obtiene el mayor sueldo de la empresa con $"+mayor);
    System.out.println("El monto de nomina total es de $"+suma);
    System.out.printf("El promedio de pago por empleado es de $%.2f\n",prom);
  }
}

import java.util.Scanner;

class ej11
{
 public static void main (String[] arg)
 {
  int M, A;
  Scanner teclado = new Scanner(System.in);
  System.out.print("Dame el numero de mes: ");
  M = teclado.nextInt();

  switch(M)
  {
           case 1:
           case 3:
           case 5:
           case 7:
           case 8:
           case 10:
           case 12:

             System.out.println("El mes tiene 31 dias \n");
             break;

           case 4:
           case 6:
           case 9:
           case 11:

             System.out.println("El mes tiene 30 dias \n");
             break;

           case 2:
           System.out.print("Ingresa el año: ");
           A = teclado.nextInt();
           if (A%4 == 0 && A%100!=0 || A%400 == 0)
           {
             System.out.println("Es año bisiesto, el mes tiene 29 dias");
           }
           else
           {
            System.out.println("El mes tiene 28 dias \n");
          }
          break;

          default:
           System.out.println("El mes no es valido \n");
           break;
  }
}
}

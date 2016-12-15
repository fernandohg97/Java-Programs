import java.util.Scanner;

class for9
{
  public static void main(String[] args)
  {
    int i,x,nulo=0,mcant=0,tipo1,tipo2,tipo3,tipo4,tipo5,totalA=0,mayor=0;
    int total1=0,total2=0,total3=0,total4=0,total5=0;
    Scanner input = new Scanner(System.in);

    for (i=1;i<=3;i++)
    {
      System.out.println("Año "+i);

        System.out.println("Ingresa los litros producidos por el tipo1: ");
        tipo1 = input.nextInt();
        System.out.println("Ingresa los litros producidos por el tipo2: ");
        tipo2 = input.nextInt();
        System.out.println("Ingresa los litros producidos por el tipo3: ");
        tipo3 = input.nextInt();
        System.out.println("Ingresa los litros producidos por el tipo4: ");
        tipo4 = input.nextInt();
        System.out.println("Ingresa los litros producidos por el tipo5: ");
        tipo5 = input.nextInt();
        total1 = total1+tipo1;
        total2 = total2+tipo2;
        total3 = total3+tipo3;
        total4 = total4+tipo4;
        total5 = total5+tipo5;
        System.out.println("Fin del año "+i);
        totalA = tipo1+tipo2+tipo3+tipo4+tipo5;
        System.out.println("El total de vino producido en el año "+i+" es de "+totalA);
        totalA = 0;
        if (tipo2>mayor)
        {
          mcant = i;
          mayor = tipo2;
        }
        if (tipo3 == 0)
        {
          nulo = i;
        }
      }
      System.out.println("\n\nEn el año "+mcant+" se produjo la mayor cantidad de vino del tipo2, con una cantidad de "+mayor);
      System.out.println("El total producido por el tipo1 es de "+total1);
      System.out.println("El total producido por el tipo2 es de "+total2);
      System.out.println("El total producido por el tipo3 es de "+total3);
      System.out.println("El total producido por el tipo4 es de "+total4);
      System.out.println("El total producido por el tipo5 es de "+total5);
      System.out.println("En el año "+nulo+" no se produjo vino del tipo3");

      }
  }

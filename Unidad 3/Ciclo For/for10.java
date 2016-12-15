import java.util.Scanner;

class for10
{
  public static void main(String[] args)
  {
    int m,F,x,p,totalP=0,mayor=0,fabpro=0,fm=0,totalA;
    
    Scanner input = new Scanner (System.in);
    System.out.println("Ingresa el numero de fabricas: ");
    F = input.nextInt();

    for (x=1;x<=F ;x++ )
    {
        for (m=1;m<=12;m++)
        {
          System.out.println("Ingresa la produccion de la fabrica "+x);
          System.out.println("Mes "+m);
          p = input.nextInt();
          totalP = totalP + p;
          if (p>3000000 && m==7)
          {
                fabpro= x;
                continue;
          }
          else
          {
            continue;
          }
        }

        if (totalP>mayor)
        {
          fm = x;
          totalA = totalP;
          mayor = totalA;
        }
        if (fabpro==x)
        {
          System.out.println("La fabrica "+fabpro+" supero los 3 millones en el mes de julio");
        }
        System.out.println("Total de produccion de la fabrica "+x+":"+ totalP);
        totalP=0;
    }
    System.out.println("La fabrica "+fm+" produjo mas en un año con una cantidad de "+mayor);


  }
}

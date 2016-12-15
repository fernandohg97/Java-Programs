import java.util.Scanner;
class prog6
{
  public static void main(String[] args)
  {
    int mesesS=0,mesesI=0,mayor=0,suma=0,mes=0;
    double prom;
    int toneladas[] = new int[12];

    Scanner input = new Scanner(System.in);

    for (int x=0;x<=toneladas.length - 1;x++)
    {
      System.out.print("Ingresa el numero de toneladas en el mes "+(x+1)+": ");
      toneladas[x] = input.nextInt();
      suma = suma + toneladas[x];
    }
    prom = (double)suma/12;


    for (int i=0;i<=toneladas.length - 1;i++)
    {
      if (toneladas[i]>prom)
      {
        mesesS++;
      }
      else if (toneladas[i] < prom)
      {
        mesesI++;
      }
    }

    for (int y=0;y<=toneladas.length - 1;y++)
    {
      if (toneladas[y]>mayor)
      {
        mayor = toneladas[y];
        mes = y+1;
      }
    }
    System.out.printf("EL promedio es %.2f\n",prom);
    System.out.println("Los meses superiores al promedio anual fueron "+mesesS);
    System.out.println("Los meses inferiores al promeedio anual fueron "+mesesI);
    System.out.println("El mes "+mes+" produjo el mayor numero de toneladas");

  }
}

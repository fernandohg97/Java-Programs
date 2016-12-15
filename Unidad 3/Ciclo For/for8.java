import java.util.Scanner;

class for8
{
  public static void main(String[] args)
  {
    double c,n,o,prom=0,sumaN=0,sumaC=0,sumaO=0,sumaS=0;
    int x,s=0,menor=99999999,mes=0;
    Scanner input = new Scanner(System.in);


    for (x=1;x<=12;x++)
    {
      System.out.println("Ingresa la cantidad de lluvias en el Centro");
      c = input.nextDouble();
      System.out.println("Ingresa la cantidad de lluvias en el Norte: ");
      n = input.nextDouble();
      System.out.println("Ingresa la cantidad de lluvias en el Oeste: ");
      o = input.nextDouble();
      System.out.println("Ingresa la cantidad de lluvias en el Sur: ");
      s = input.nextInt();

      sumaC = sumaC + c;
      sumaN = sumaN + n;
      sumaO = sumaO + o;
      sumaS = sumaS + s;
      if (s<menor)
      {
        mes = x;
        menor = s;
      }
    }
    prom = sumaC/12;

    System.out.println("En el mes "+mes+" se produjeron "+s+" lluvias en el Sur");
    System.out.printf("El promedio anual de la region centro es de %.1f\n",prom);
    if (sumaC>sumaN && sumaC>sumaO && sumaC>sumaS)
    {
        System.out.println("La region Centro obtuvo la mayor lluvia anual");
    }
    else if (sumaN>sumaC && sumaN>sumaO && sumaN>sumaS)
    {
      System.out.println("La region Norte obtuvo la mayor lluvia anual");
    }
    else if (sumaO>sumaC && sumaO>sumaN && sumaO>sumaS)
    {
      System.out.println("La region Oeste obtuvo la mayor lluvia anual");
    }
    else if (sumaS>sumaC && sumaS>sumaN && sumaS>sumaO)
    {
      System.out.println("La region Sur obtuvo la mayor lluvia anual");
    }

  }
}

//Calculo de las tablas de multiplicar del 1 al 10

class tablas
{
  public static void main(String[] args)
  {
    int x,y,r;
    for (x=1;x<=10;x++)
    {
      System.out.println("\nTabla del "+x);
      for (y=1;y<=10 ;y++ )
      {
          r = x*y;
          System.out.println(x+" * "+y+" = "+ r);
      }
    }

  }
}

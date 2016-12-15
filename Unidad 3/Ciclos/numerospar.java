import java.util.Scanner;

class numerospar
{
  public static void main(String[] args)
  {
    int n,c = 0;
    Scanner input = new Scanner(System.in);

    while (c<4)
    {
      System.out.print("Ingresa un numero: ");
      n = input.nextInt();

      if (n%2 == 0)
      {
        c++;
      }
    }
    System.out.println("Obtuviste 4 numeros pares");
  }
}

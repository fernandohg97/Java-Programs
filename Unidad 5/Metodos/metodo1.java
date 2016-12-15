import java.util.Scanner;
class metodo1
{
    public static void main(String[] args)
    {
      int num;
      Scanner input = new Scanner (System.in);
      System.out.print("Ingresa un numero: ");
      num = input.nextInt();
      System.out.println(numero(num));
    }
    public static int numero(int x)
    {
      if (x>0)
      {
        return 1;
      }
      else
      {
        return 2;
      }
    }
}

import java.util.Scanner;
class metodo2
{
  public static void main(String[] args)
  {
    int num1,num2;
    Scanner input = new Scanner(System.in);
    System.out.print("Ingresa el primer numero: ");
    num1 = input.nextInt();
    System.out.print("Ingresa el segundo numero: ");
    num2 = input.nextInt();
    System.out.println(divisible(num1,num2));
  }
    public static boolean divisible(int x, int y)
    {
      if (x%y==0 || y%x==0)
      {
        return true;
      }
      else
      {
        return false;
      }
    }
}

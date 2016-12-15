import java.util.Scanner;
class metodo3
{
  public static void main(String[] args)
  {
    double grados;
    Scanner input = new Scanner(System.in);
    System.out.print("Ingresa la temperatura en grados Celsius: ");
    grados = input.nextInt();
    System.out.println(conversion(grados));
  }
  public static double conversion(double x)
  {
    double f;
    f = (x*9/5)+32;
    return f;
  }
}

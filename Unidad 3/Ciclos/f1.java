/*

*/
import java.util.Scanner;
class f1
{
  public static void main(String[] args)
  {
    int limite=0,i,j,c=1;
    Scanner input = new Scanner(System.in);
    System.out.println("Ingresa el limite: ");
    limite = input.nextInt();
        for(i=1; i<=limite;i++)
        {
            for(j=1;j<=i;j++)
            {
              if (c<=limite)
              {
                System.out.print(c);
                c++;
              }
            }
            System.out.println();
        }

    }
}

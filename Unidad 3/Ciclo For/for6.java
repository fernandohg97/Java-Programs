import java.util.Scanner;

class for6
{
  public static void main(String[] args)
  {
    int num2=0,num1=0,num=1,i;
    System.out.println(num1);
    System.out.println(num);

    for (i=0;i<=80;i++)
    {
        num2=num1;
        num1=num;
        num=num2+num1;
        System.out.println(num);
    }
 }
}

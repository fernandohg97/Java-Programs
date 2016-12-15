import java.util.Scanner;
class metodo7
{
  public static void main(String[] args)
  {
    int num1,num2;
    String seguir="si";
    char operacion;
    Scanner input = new Scanner (System.in);
    System.out.println("\n\t\t--------CALCULADORA BASICA--------\n");

    while (seguir.equals("si"))
    {
      System.out.print("Ingresa un numero: ");
      num1 = input.nextInt();
      System.out.print("Ingresa otro numero:");
      num2 = input.nextInt();
      System.out.print("Que operacion desea realizar (Escriba '+' suma, '-' resta, '*' multiplicacion, '/' division, '%' residuo, '^' exponente.):  ");
      operacion = input.next().charAt(0);
      System.out.println(calculadora(num1,num2,operacion));
      System.out.println("Deseas realizar otra operacion: ");
      seguir = input.next();
     }
     System.out.println("\t\t\n---FIN---");
  }
  public static double calculadora(int x,int y,char signo)
  {
    double resp=0;

    switch (signo)
    {
      case '+':
      resp = x+y;
      break;
      case '-':
      resp = x-y;
      break;
      case '*':
      resp = x*y;
      break;
      case '/':
      resp = (double)x/y;
      break;
      case '%':
      resp = x%y;
      break;
      case '^':
      resp = (Math.pow(x,y));
      default:
      System.out.println("Operacion invalida");
    }
    return resp;
  }
}

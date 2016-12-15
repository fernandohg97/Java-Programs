import java.util.Scanner;
class metodo6
{
  public static void main(String[] args)
  {
    int numMes;
    String dia="";
    Scanner input = new Scanner(System.in);
    System.out.print("Ingresa un dia de la semana: ");
    dia = input.next();
    System.out.println(semana(dia));
    System.out.print("Ingresa el numero de mes: ");
    numMes = input.nextInt();
    mes(numMes);
  }
  public static int semana(String d)
  {
    int x=0;
    switch (d)
    {
      case "lunes":
      case "Lunes":
      x=1;
      break;
      case "martes":
      case "Martes":
      x=2;
      break;
      case "miercoles":
      case "Miercoles":
      x=3;
      break;
      case "jueves":
      case "Jueves":
      x=4;
      break;
      case "viernes":
      case "Viernes":
      x=5;
      break;
      case "sabado":
      case "Sabado":
      x=6;
      break;
      case "domingo":
      case "Domingo":
      x=7;
      break;

      default:
      System.out.println("No existe este dia");
    }
    return x;
  }
  public static void mes(int m)
  {
    Scanner input = new Scanner(System.in);
    int a;
    int dias=0;

    switch(m)
    {
        case 1:
        case 3:
        case 5:
        case 7:
        case 8:
        case 10:
        case 12:
        dias = 31;
          System.out.println("El mes tiene "+dias+" dias");
          break;

          case 4:
          case 6:
          case 9:
          case 11:
          dias = 30;
          System.out.println("El mes tiene "+dias+" dias");
          break;

          case 2:
          System.out.print("Ingresa el año: ");
          a = input.nextInt();
          if (a%4 == 0 && a%100!=0 || a%400 == 0)
          {
            dias = 29;
            System.out.println("Es año bisiesto, el mes tiene "+dias+" dias");
          }
          else
          {
            dias = 28;
            System.out.println("El mes tiene "+dias+" dias");
          }
          break;

          default:
          System.out.println("El mes no es valido");
          break;
    }
  }
}

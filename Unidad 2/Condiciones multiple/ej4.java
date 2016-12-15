/* En México, para poder entrar al país, es necesario contar con un pasaporte válido vigente.
Un mexicano, para obtener un pasaporte, es necesario que realice un pago por el derecho federal del pasaporte,
el cual varía según el tiempo de vigencia del mismo, el cual puede ser de 3, 6 o hasta 10 años. Investigue las
vigencias y los costos correspondientes actuales, y resuelva el algoritmo que imprima ¿Cuál es el monto a pagar
por un pasaporte con cierta vigencia? */
import java.util.Scanner;

class ej4
{
 public static void main (String[] arg)
 {
  int vigencia,edad;
  Scanner input = new Scanner(System.in);
  System.out.print("Cual es tu edad: ");
  edad = input.nextInt();

    if (edad<=3)
    {
      System.out.println("El pasaporte es vigente hasta un año o tres años");
    }
    else if (edad>3 && edad<18)
    {
      System.out.println("El pasaporte es vigente hasta tres años o seis años");
    }
    else if (edad>=18)
    {
      System.out.println("El pasaporte es vigente hasta tres años, seis años o diez años");
    }
    else
    {
      System.out.println("El pasaporte no es valido");
    }

    System.out.print("Por cuantos años deseas el pasaporte: ");
    vigencia = input.nextInt();

      switch(vigencia)
      {
        case 1:
        System.out.println("El costo es de $525");
        break;

        case 3:
        System.out.println("El costo es de $1095");
        break;

        case 6:
        System.out.println("El costo es de $1505");
        break;

        case 10:
        System.out.println("El costo es de $2315");
        break;

      }
 }
}

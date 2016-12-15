/* Escriba un algoritmo que permita calcular lo que hay que pagarle a un trabajador teniendo en cuenta su sueldo
y las horas extras trabajadas. Para el pago de horas extras se toma en cuenta la categoría del trabajador.
La única excepción para pagar las horas extras es si el trabajador fuera de planta completa ya que estos empleados
no pueden generar este tipo de beneficio. */
import java.util.Scanner;

class ej2
{
 public static void main (String[] arg)
 {
  int horasExt,cat;
  double sueldo, aumento, nuevoSueldo;
  String plantaCompleta;
  Scanner input = new Scanner(System.in);
  System.out.print("Ingresa el sueldo: ");
  sueldo = input.nextDouble();
  System.out.print("Dame la categoria: ");
  cat = input.nextInt();
  System.out.print("Cuantas horas extras trabajaste: ");
  horasExt = input.nextInt();
  System.out.print("Eres de planta completa: ");
  plantaCompleta = input.next();

  if (plantaCompleta.equals ("si"))
  {
    nuevoSueldo = sueldo;
    System.out.printf("Tu sueldo es de $%.2f\n",nuevoSueldo);
  }
  else
  {
    switch(cat)
    {
      case 1:
        aumento = horasExt *70;
        nuevoSueldo = sueldo + aumento;
        System.out.printf("Tu nuevo sueldo es de $%.2f\n",nuevoSueldo);
      break;

        case 2:
        aumento = horasExt *85;
        nuevoSueldo = sueldo + aumento;
        System.out.printf("Tu nuevo sueldo es de $%.2f\n",nuevoSueldo);
        break;

        case 3:
        aumento = horasExt *90;
        nuevoSueldo = sueldo + aumento;
        System.out.printf("Tu nuevo sueldo es de $%.2f\n",nuevoSueldo);
        break;

        case 4:
        aumento = horasExt *95;
        nuevoSueldo = sueldo + aumento;
        System.out.printf("Tu nuevo sueldo es de $%.2f\n",nuevoSueldo);
        break;

        default:
        System.out.println("No existe esta categoria");
    }
  }
 }
}

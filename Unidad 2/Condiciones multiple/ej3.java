/* En un hospital se ha hecho un estudio sobre los pacientes registrados durante los últimos 10 años,
con el objeto de hacer una aproximación de los costos de internación por paciente. Se obtuvo un costo promedio
diario según el tipo de enfermedad que aqueja al paciente.  Además se pudo determinar que en promedio todos los
pacientes con edad entre 50 y 80 años implican un costo adicional del 10%. La siguiente tabla expresa los costos
diarios, según el tipo de enfermedad. */
import java.util.Scanner;

class ej3
{
 public static void main (String[] arg)
 {
  int dias,cat,edad;
  double costo=0, aumento, costoTotal, costoAdic;
  Scanner input = new Scanner(System.in);
  System.out.print("Ingresa el tipo de enfermedad: ");
  cat = input.nextInt();
  System.out.print("Ingresa tu edad: ");
  edad = input.nextInt();
  System.out.print("Ingresa los dias de internacion: ");
  dias = input.nextInt();



      if (edad>=50 && edad<=80)
      {
        aumento = 0.10;
      }
      else
      {
        aumento = 0;
      }
      switch(cat)
      {
      case 1:
        costo = 25 * dias;
        costoAdic = costo *aumento;
        costoTotal = costo + costoAdic;

        System.out.printf("Tu costo es de $%.2f\n",costoTotal);
      break;

        case 2:
        costo = 16 * dias;
        costoAdic = costo *aumento;
        costoTotal = costo + costoAdic;
        System.out.printf("Tu costo es de $%.2f\n",costoTotal);
        break;

        case 3:
        costo = 20 * dias;
        costoAdic = costo *aumento;
        costoTotal = costo + costoAdic;
        System.out.printf("Tu costo es de $%.2f\n",costoTotal);
        break;

        case 4:
        costo = 32 * dias;
        costoAdic = costo *aumento;
        costoTotal = costo + costoAdic;
        System.out.printf("Tu costo es de $%.2f\n",costoTotal);
        break;

        default:
        System.out.println("No existe esta categoria");
      }
 }
}

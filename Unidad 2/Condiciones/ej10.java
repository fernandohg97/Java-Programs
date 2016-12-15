/* En el colegio “Insurgentes”, el cálculo de calificación mensual de un alumno se conforma de las notas de un examen,
10 puntos de un trabajo opcional y de un proyecto. La distribución de la calificación es: 70% la nota del examen y
30% la nota del proyecto. => nota = 0.7*examen + 0.3*proyecto. Pero si el alumno obtuvo los puntos adicionales en el
trabajo, hay que incluirlos en la nota del examen. => nota = 0.7*(examen + 10 puntos adicionales) + 0.3*proyecto.
Diseñe el algoritmo que resuelve este problema. */
import java.util.Scanner;
class ej10
{
  public static void main(String[]args)
  {
    double nota,examen,proyecto,cal_adicional;
    String adicional="";
    Scanner input = new Scanner(System.in);
    System.out.print("Ingresa la calificacion de tu examen: ");
    examen = input.nextDouble();
    System.out.print("Ingresa la calificacion de tu proyecto: ");
    proyecto = input.nextDouble();
    System.out.print("Llevaste a cabo el trabajo adicional: ");
    adicional = input.next();
    System.out.print("Cuantos puntos obtuviste: ");
    cal_adicional = input.nextDouble();

    if (adicional.equals("si"))
    {
      nota = (examen*0.7+cal_adicional*0.1) + proyecto*0.3;

    }
    else
    {
      nota = (examen*0.7) + (proyecto*0.3);
    }
    System.out.printf("Tu calificacion mensual es de %.2f\n",nota);
  }
}

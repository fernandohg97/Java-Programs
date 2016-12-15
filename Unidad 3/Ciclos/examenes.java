import java.util.Scanner;
class examenes
{
	public static void main(String[] arg)
	{
		final int puntajeTotal = 50;
    int n=0;
    double puntos, calificacion, promedio, suma = 0;
    String respuesta="";


		Scanner input = new Scanner(System.in);
    System.out.print("Tiene examenes por calificar? (si/no)");
    respuesta = input.next();

    while (respuesta.equals ("si"))
    {
      System.out.print("Cuantos puntos obtuvo en el examen: ");
      puntos = input.nextDouble();

      calificacion = puntos/puntajeTotal*100;
      if (calificacion<70)
      {
        calificacion = 50;
      }
      System.out.printf("La calificacion es de %.2f",calificacion);
      n++; //Contador del numero de examen
      suma = suma + calificacion;
      System.out.print("Tiene examenes por calificar? (si/no)");
      respuesta = input.next();
    } //Fin del while

    promedio = suma/n;
    System.out.printf("El promedio del grupo es de %.2f",promedio);

	}
}

import java.util.Scanner;
class prog4
{
  public static void main(String[] args)
  {
    int y=0,cal,aprob=0,reprob=0,alumnos,i=0,suma=0;
    int porcen1,porce2;
    double prom;
    Scanner input = new Scanner(System.in);
    System.out.print("Ingresa la cantidad de alumnos: ");
    alumnos = input.nextInt();
    int calificaciones[] = new int[alumnos];

    for (int x=0;x<calificaciones.length;x++)
    {
      System.out.print("Ingresa la calificacion para el alumno "+(x+1)+":");
      calificaciones[x] = input.nextInt();
      if (calificaciones[x]<7)
      {
        reprob++;
      }
      else
      {
        aprob++;
      }
    }
    for (int m=0;m<=calificaciones.length - 1;m++)
    {
      if (calificaciones[m]>8)
      {
        y++;
      }
    }
    while (i<=calificaciones.length - 1)
    {
      suma = suma + (calificaciones[i]);
      i++;
    }
    prom = (double)suma/alumnos;
    porcen1 = reprob*100/alumnos;
    porcen2 = aprob*100/alumnos;
    System.out.printf("El promedio es de %.2f\n",prom);
    System.out.println("Alumnos reprobados: "+reprob+"\n Porcentaje: "+porcen1+"%");
    System.out.println("Alumnos aprobados: "+aprob+"\n Porcentaje: "+porcen2+"%");
    System.out.println("Alumnos cuya calificacion fue mayor a 8: "+y);
  }
}

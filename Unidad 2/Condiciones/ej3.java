/* Construya un diagrama de flujo tal que dado como datos la matrícula y 5 calificaciones de un alumno; imprima la
matrícula, el promedio y la palabra “aprobado” si el alumno tiene un promedio mayor o igual a 6, y la palabra “reprobado,
acudir a asesorías” en caso contrario */
import java.util.Scanner;
class ej3
{
  public static void main(String[]args)
  {
    int mat, cal1,cal2,cal3,cal4,cal5,prom;
    Scanner input = new Scanner(System.in);
    System.out.print("Ingresa tu matricula: ");
    mat = input.nextInt();
    System.out.print("Primera calificacion: ");
    cal1 = input.nextInt();
    System.out.print("Segunda calificacion: ");
    cal2 = input.nextInt();
    System.out.print("Tercera calificacion: ");
    cal3 = input.nextInt();
    System.out.print("Cuarta calificacion: ");
    cal4 = input.nextInt();
    System.out.print("Quinta calificacion: ");
    cal5 = input.nextInt();

    prom = (cal1+cal2+cal3+cal4+cal5)/5;
    if (prom>=6)
    {
      System.out.println("Tu matricula es "+mat);
      System.out.println("Tu promedio es de "+prom);
      System.out.println("Aprobado");
    }
    else
    {
      System.out.println("Tu matricula es "+mat);
      System.out.println("Tu promedio es de "+prom);
      System.out.println("Reprobado, acudir a asesorias");
    }

  }
}

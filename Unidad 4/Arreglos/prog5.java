import java.util.Scanner;
import java.util.Arrays;
class prog5
{
  public static void main(String[] args)
  {
    int alumnos,moda=0,suma=0,rep=1,modaF=0,mo,num=0,y;
    double prom,desE,varianza=0;
    Scanner input = new Scanner(System.in);
    System.out.print("Ingresa la cantidad de alumnos: ");
    alumnos = input.nextInt();
    int calificaciones[] = new int[alumnos];

    for (int i=0;i<=calificaciones.length - 1;i++)
    {
      System.out.print("Ingresa la calificacion para el alumno "+(i+1)+": ");
      calificaciones[i] = input.nextInt();
      suma = suma + calificaciones[i];
    }
    prom = (double)suma/alumnos;

    for (int x=0;x<=calificaciones.length - 1;x++)
    {
      varianza = varianza + Math.pow(calificaciones[x]-prom,2);
    }
    desE = Math.sqrt(varianza);

    Arrays.sort(calificaciones);
    for (int m=0;m<=calificaciones.length - 1;m++)
    {
      System.out.println(calificaciones[m]);
    }

    for (y=0;y<=calificaciones.length - 1;y++)
    {
      mo=1;
      for (int z=y+1;z<=calificaciones.length - 1;z++)
      {
        if (calificaciones[y]==calificaciones[z])
        {
          mo++;
        }
      }
      if (mo>moda)
      {
        moda=mo;
        modaF=moda;
        num = calificaciones[y];
      }
    }
    System.out.println("Moda: "+num+", Repeticiones: "+modaF);

    System.out.printf("La media aritmetica es %.2f\n",prom);
    System.out.printf("La varianza es %.2f\n",varianza);
    System.out.printf("La desviacion estandar es %.2f\n",desE);


  }
}
